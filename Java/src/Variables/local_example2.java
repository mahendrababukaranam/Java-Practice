package Variables;

public class local_example2 {
	
	void m1() {
		/*
		 1. created the variables in one customized method.
		 2. printed the all variables in same method
		 3. Created an object reference and called the method with object reference.
		 */
		String name = "Mahendra";
		String company = "Neutara";
		int id = 1234;
		System.out.println(name);
		System.out.println(company);
		System.out.println(id);
	}

	public static void main(String[] args) {
		
		local_example2 loc = new local_example2();
		loc.m1();
		
	}

}
