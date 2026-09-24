package Qualifier_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("details2")   //Qualifier Annotation ka use kis bean ka use karna hai iske liye use hota hai 
	private Details details;

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [details=" + details + "]";
	}
	

}
