package springcore.Standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("springcore/Standalone_collections/aloneconfig.xml");
		   Person p1 =(Person) con.getBean("person1");
         System.out.println(p1);
         System.out.println(p1.getFriends().getClass().getName());
         System.out.println("----------------------------------");
         System.out.println(p1.getFeestructure());
         
	}
	

}
