package SpringbeanLifeCycle;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class testclass {

 public static void main(String[] args){

	 AbstractApplicationContext context =new ClassPathXmlApplicationContext("SpringbeanLifeCycle/config.xml");
	 context.registerShutdownHook();
	 Samosa ss =(Samosa)context.getBean("s1");
	 System.out.println(ss);
	   
}
}