package Company_Employees_with_Object_Creation;

public class Admin {
	
	void Naveen() {
		System.out.println("Hi, this is Naveen from Vijayawada and working as a Admin");
	}
	
	public static void main(String[] atgs) {
		//ClassName Object_Reference = new ClassName
		Admin admin_details=new Admin();
		admin_details.Naveen();
	}

}
