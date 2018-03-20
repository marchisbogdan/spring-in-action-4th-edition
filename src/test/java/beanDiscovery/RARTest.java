package beanDiscovery;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.action.config.InstitutionsConfig;
import com.action.models.interfaces.Institution;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=InstitutionsConfig.class)
public class RARTest {

	@Autowired
	private Institution rar;
	
    @Test
    public void rarShouldNotBeNull(){
    	Assert.assertNotNull(rar);
    }
}
