package springcore.Autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;       //Annotation use karne ke 3 tarikhe hote hai 1.by properprty 2.by constructer 3.by Setter method

	public Address getAddress() {
		return address;
	}

	//@Autowired  yaha setter method ke upar use 
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
		
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired by constructer
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructer");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	

}
