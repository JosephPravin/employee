package employee;

public class Employee {
	
	int id;
	String name;
	
	Employee(){
		
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Employee created successfully");
	}
	
	public void getEmployee() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
}
