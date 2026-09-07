package beanUsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		
		// this is init method bus name ho gya hai qki method koi bhi name likh sajkte hai
		System.out.println("taking pepsi : init");
		
	}

	@Override
	public void destroy() throws Exception {
		// This is destroy method
		System.out.println("Going to put bottle back to shop : destroy");
		
	}
	
	

}
