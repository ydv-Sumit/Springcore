package beanUsingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testclass {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("beanUsingAnnotations/config.xml");
		 context.registerShutdownHook();
		Example ss =(Example)context.getBean("s1");
		System.out.println(ss);
		
	}

}
