package Instance_Part2;

public class Employees {
	
	int empid=121;
	String empname="Mahendra";
	long sal=1000000L;
	String dept="QA";
	String role="Quality Analyst";
	boolean isActive=true;
	
	void emp1() {
		System.out.println("Employee ID is :"+empid);
		System.out.println("Employee Name is :"+empname);
		System.out.println("Employee Salary is :"+sal);
		System.out.println("Employee department is :"+dept);
		System.out.println("Employee role is :"+role);
		System.out.println("Employee statusActive/inactive) is :"+isActive);
	}
	
	public static void main(String[] args) {
		
		Employees empl1=new Employees();
		empl1.emp1();
		System.out.println(empl1.dept);
		
	}

}
