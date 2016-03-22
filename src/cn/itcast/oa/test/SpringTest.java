package cn.itcast.oa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testBean() throws Exception{
		TestAction testAction = (TestAction) ac.getBean("testAction");
		System.out.println(testAction);
	}

}
