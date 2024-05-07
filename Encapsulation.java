class Demo1{
	
	private int employeeId=10;
	int contact=5678;
	private String s="Coder";
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	
	public String getS() {
		
		return s;
	}
	
	public void setEmployeeId(int employeeId) {
		
		if(employeeId<=100)
			this.employeeId=employeeId;
		else
			System.out.println("You can only set values which are less than 100");
	}

	public void setS(String s) {
		this.s = s;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		
		System.out.println("Before setting......");
		System.out.println(d.getEmployeeId());
		System.out.println(d.getS());
		System.out.println(d.contact);
		
		d.setEmployeeId(80);
		d.contact=70;
		
		System.out.println("\nAfter setting......");
		System.out.println(d.getEmployeeId());
		System.out.println(d.getS());
		System.out.println(d.contact);
	}

}
