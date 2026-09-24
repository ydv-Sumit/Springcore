package Stereotype_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("Sumit")                                                                
	private String Name;
	@Value("mumbai")
	private String city ;
	@Value("linkroad")
	private String Street;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", city=" + city + ", Street=" + Street + "]";
	}
	

}
