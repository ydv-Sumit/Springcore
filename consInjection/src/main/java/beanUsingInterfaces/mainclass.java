package beanUsingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("beanUsingInterfaces/config.xml");
		 context.registerShutdownHook();
		pepsi ss =(pepsi)context.getBean("p1");
		System.out.println(ss);
		

	}

}
