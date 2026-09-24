package Qualifier_Annotation;

public class Details {
	
	private String Name;
	private String city ;
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
