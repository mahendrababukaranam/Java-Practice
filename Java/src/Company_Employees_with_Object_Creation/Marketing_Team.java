package Company_Employees_with_Object_Creation;

public class Marketing_Team {
	
	void Bharathi() {
		System.out.println("Hi, this is Bharathi from Guntur");
	}
	
	void Venkat() {
		System.out.println("Hi, this is Venkat from Vijayawada");
	}
	
	void Antony() {
		System.out.println("Hi, this is Antony fron United States of America");
	}
	
	public static void main(String[] args) {
		Marketing_Team mt_details=new Marketing_Team();
		mt_details.Venkat();
		mt_details.Bharathi();
		mt_details.Antony();
	}

}
