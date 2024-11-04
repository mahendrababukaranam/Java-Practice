package constructors;

public class constructor_example3 {
	String name;
	int id;
	String company;
	
	constructor_example3(){
		name = "Mahendra";
		id = 101;
		company = "Neutara";
	}
	void m1() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		
		constructor_example3 s1	= new constructor_example3();
		s1.m1();

		constructor_example3 s2	= new constructor_example3();
		s2.m1();
	}
}
