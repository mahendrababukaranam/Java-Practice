package Company_Employees_with_Object_Creation;

public class User_Interface_Team {
	
	void Sachin() {
		System.out.println("Hi, this is Sachin from Maharastra");
	}
	
	void Rajat() {
		System.out.println("Hi, this is Rajath from Uttar Pradesh");
	}
	
	public static void main(String[] args) {
		User_Interface_Team uit_details=new User_Interface_Team();
		uit_details.Rajat();
		uit_details.Sachin();
	}

}
