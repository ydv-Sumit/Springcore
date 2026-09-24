package CollectionswithValue_Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Value("Sumit")
	private String name;
	
	@Value("#{address}")
	private List<String> Address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Address=" + Address + "]";
	}
	
	
	
	
	

}
