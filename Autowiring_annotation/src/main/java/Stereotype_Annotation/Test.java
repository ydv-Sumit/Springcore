package Stereotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype_Annotation/Stereoconfig.xml");
	         Student std1=context.getBean("student", Student.class);
	         System.out.println(std1);
		
	}

}
