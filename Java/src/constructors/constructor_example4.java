package constructors;

public class constructor_example4 {
	String name;
	int id;
	String company;
	
	constructor_example4(){
		name = "Mahendra";
		id = 101;
		company = "Neutara";
		System.out.println(name);
		System.out.println(id);
		System.out.println(company);
	}

	constructor_example4(String s_name, int s_id,String s_company){
		name = s_name;
		id = s_id;
		company = s_company;
	}
	
	void m1() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		new constructor_example4();
		
		new constructor_example4();
		
		/*constructor_example4 s1	= new constructor_example4();
		s1.m1();
		s1.m1();

		constructor_example4 s2	= new constructor_example4("Rajesh", 103, "Exinent");
		s2.m1();*/
	}
}
