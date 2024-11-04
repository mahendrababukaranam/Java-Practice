package Company_Employees_with_Object_Creation;

public class Server_Team {
	
	void Krishna() {
		System.out.println("Hi, this is Krishna from Vijayawada");
	}
	
	void Swaroop() {
		System.out.println("Hi, this is Swaroop from Vizag");
	}
	
	void Vijay() {
		System.out.println("Hi, this is Vijay from Vijayawada");
	}
	
	void Subrata() {
		System.out.println("Hi, this is Subrata from Uttar Pradesh");
	}
	
	void Ravi() {
		System.out.println("Hi, this is Ravi Annavarapu from Vijayawada");
	}
	
	void Bharath() {
		System.out.println("Hi, this is Bharath from Mumbai");
	}
	
	public static void main(String[] args) {
		Server_Team st_details=new Server_Team();
		st_details.Bharath();
		st_details.Ravi();
		st_details.Subrata();
		st_details.Vijay();
		st_details.Swaroop();
		st_details.Krishna();
		
	}

}
