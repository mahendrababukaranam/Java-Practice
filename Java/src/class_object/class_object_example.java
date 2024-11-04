package class_object;

public class class_object_example {
	
	void employee_data(String name, int id, String company) {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee company : "+company);
	}

	public static void main(String[] args) {
		class_object_example Mahendra = new class_object_example();
		Mahendra.employee_data("Mahendra", 1212, "Neutara");
		
		class_object_example Tirumala = new class_object_example();
		Tirumala.employee_data("Tirumala", 1451, "Neutara");
		
		class_object_example Madhu = new class_object_example();
		Madhu.employee_data("Madhu", 1865, "Neutara");
		
		class_object_example Ravindra = new class_object_example();
		Ravindra.employee_data("Ravindra", 1231, "Neutara");
		

	}

}
