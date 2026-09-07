package refobj;

public class Employee {
	
	private  String EmpName;
	private int EmpId;
	private Sallary sallary;
	
	public Employee(String EmpName, int EmpId, Sallary sallary) {
	
		this.EmpName = EmpName;
		this.EmpId = EmpId;
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", sallary=" + sallary + "]";
	}
	
	
	
	
	
	

}
