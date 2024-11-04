package Instance_Part2;

public class Employees2 {
	
	int empid;
	String empname;
	long sal;
	String dept;
	String role;
	boolean isActive;
	
	void empdata() {
		System.out.println("Employee ID is :"+empid);
		System.out.println("Employee Name is :"+empname);
		System.out.println("Employee Salary is :"+sal);
		System.out.println("Employee department is :"+dept);
		System.out.println("Employee role is :"+role);
		System.out.println("Employee statusActive/inactive) is :"+isActive);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Data from object reference empl");
		System.out.println("------------------------------------------");
		Employees2 empl=new Employees2();
		empl.empdata();
		
		Employees2 empl1=new Employees2();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data from object reference empl1");
        System.out.println("------------------------------------------");
		empl1.empid=1212;
		empl1.empname="Mahendra";
		empl1.sal=1000000L;
		empl1.dept="QA";
		empl1.role="Quality Analyst";
		empl1.isActive=true;
		empl1.empdata();
		
		Employees2 empl2=new Employees2();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data from object reference empl2");
        System.out.println("------------------------------------------");
		empl2.empid=2212;
		empl2.empname="Sreeja";
		empl2.sal=3000000L;
		empl2.dept="Development";
		empl2.role="Java Developer";
		empl2.isActive=false;
		empl2.empdata();
		
		System.out.println("Changing s1 name Mahendra to Tirumala");
		empl1.empname="Tirumala";
		System.out.println("Name Changed");
		
		
		empl.empdata();
		empl1.empdata();
		empl2.empdata();
	}

}
