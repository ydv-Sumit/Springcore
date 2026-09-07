package Ambiguity_Problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runclass {
	
	 public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Ambiguity_Problem/config.xml");
		Adition a1 = (Adition) context.getBean("Add");
		a1.dosum();
		
		
	}

}
