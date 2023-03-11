package OOPS;

public class EmployeeClass {

	public String Name;
	public int Empid;
	private static int Salary = 100000;

	public EmployeeClass() {

		System.out.println("Insdie default cons");
	}

	public EmployeeClass(String var1, int var2) {
		System.out.println("Inside parameter cons");
		
		Name = var1;
		Empid = var2;
	}

	public void DisplayName() {
		System.out.println("Name of the employee" + Name);
	}
	
	public static void DisplaySalary() {
		
		System.out.println("Salary of all employee " + Salary);
	}

}
