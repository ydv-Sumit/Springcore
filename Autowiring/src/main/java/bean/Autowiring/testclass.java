package bean.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testclass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean/Autowiring/autoconfig.xml");
                Emp emp1=(Emp)context.getBean("emp1");
                
                System.out.println(emp1);
	}

}
 