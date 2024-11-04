package Company_Employees_with_Object_Creation;

public class Project_Managers {
	
	void Nishitha() {
		System.out.println("Hi, this is Nishitha from Guntur");
	}
	
	void Sangeetha() {
		System.out.println("Hi, this is Sangeetha from Mumbai");
	}
	
	void Bhanuja() {
		System.out.println("Hi, this is Bhanuja from Hyderabad");
	}
	
	void Nitesh() {
		System.out.println("Hi, this is Nitesh from Mumbai");
	}
	
	void Ajay() {
		System.out.println("Hi, this is Ajay from Mumbai");
	}
	
	public static void main(String[] args) {
		Project_Managers pm_details=new Project_Managers();
		pm_details.Nitesh();
		pm_details.Bhanuja();
		pm_details.Ajay();
		pm_details.Sangeetha();
		pm_details.Nishitha();
	}

}
