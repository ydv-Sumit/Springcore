package proj.consInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testclass {
	public static void main(String[] arg) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("proj/consInjection/config.xml");
	     Person p1= (Person)context.getBean("person1");
	     System.out.println(p1);
		
	}

}
