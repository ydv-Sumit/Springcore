package Qualifier_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Qualifier_Annotation/Qualiconfig.xml");
	         Student std1=context.getBean("Std", Student.class);
	         System.out.println(std1);
		
	}

}
