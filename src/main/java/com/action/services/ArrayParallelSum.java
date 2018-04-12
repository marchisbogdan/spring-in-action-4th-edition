package com.action.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ArrayParallelSum extends RecursiveTask<Integer>{

	private static final long serialVersionUID = -3600238693155130249L;
	private int[] arr;
	private static final int THRESHOLD=8;
	
	public ArrayParallelSum(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	protected Integer compute() {
		if(arr.length > THRESHOLD){
			return ForkJoinTask.invokeAll(createSubtasks()).stream().mapToInt(ForkJoinTask::join).sum();
		}else {
			return processing(arr);
		}
	}

	public Collection<ArrayParallelSum> createSubtasks(){
		Collection<ArrayParallelSum> coll = new ArrayList<>();
		
		coll.add(new ArrayParallelSum(Arrays.copyOfRange(arr, 0, arr.length/2)));
		coll.add(new ArrayParallelSum(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
		
		return coll;
		
	}
	
	private Integer processing(int[] array){
		int sum = Arrays.stream(array).sum();
		System.out.println("Sum:"+sum+ " was calculated by thread:"+Thread.currentThread().getName());
		return sum;
	}

}
