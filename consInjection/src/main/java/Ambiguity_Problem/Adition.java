package Ambiguity_Problem;

public class Adition {
	
	private int a;
	private int b;
	
	public Adition(int a,int b) {
		
		this.a=a;
		this.b=b;
		
		System.out.println("consturtor : int, int");
	}
	
public Adition(double a,double b) {
		
		this.a=(int)a;
		this.b=(int)b;
		
		System.out.println("consturtor : double, double");
	}
public Adition(String a,String b) {
	
	this.a=Integer.parseInt(a);                   //spring bydefault string hi leta  hai agar type="int" decide na ho.
	this.b=Integer.parseInt(b);
	
	System.out.println("consturtor : double, double");
}





public void dosum() {
    System.out.println("sum is " + (this.a + this.b));
}
	
	
	
	

}
