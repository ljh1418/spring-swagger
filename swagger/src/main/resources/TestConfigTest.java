import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.BeanExample;
import com.example.demo.bean.TestConfig;

public class TestConfigTest {

	@Test
	void beanExampleTest() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		BeanExample bx = ac.getBean(BeanExample.class);
		
		Asseritons.assertEquals("no",beanExampleTest().isNull());
		
	}
	
}
