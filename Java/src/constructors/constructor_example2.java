package constructors;

public class constructor_example2 {
	String name;
	int id;
	String company;
	
	constructor_example2(){
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
		
		constructor_example2 s1	= new constructor_example2();
		s1.m1();

	}
}
