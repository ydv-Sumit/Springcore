package refobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runclass {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("refobj/config.xml");
		 Employee emm =(Employee)context.getBean("emp1");
		
		System.out.println(emm);
		
	}

}
