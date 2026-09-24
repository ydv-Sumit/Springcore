package CollectionswithValue_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionswithValue_Annotation/config.xml");
		
		Person p1 =  (Person)context.getBean("person");
		
		System.out.println(p1);
	}

}
