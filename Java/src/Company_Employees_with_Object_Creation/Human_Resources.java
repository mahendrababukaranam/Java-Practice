package Company_Employees_with_Object_Creation;

public class Human_Resources {
	
	void Gopi() {
		System.out.println("Hi, this is Gopi from Vizag");
	}
	
	void Pooja() {
		System.out.println("Hi, this is Pooja from Mumbai");
	}
	
	void Aparajita() {
		System.out.println("Hi, this is Aparajita from Bangalore");
	}
	
	public static void main(String[] args) {
		Human_Resources hr_details=new Human_Resources();
		hr_details.Aparajita();
		hr_details.Gopi();
		hr_details.Pooja();
	}

}
