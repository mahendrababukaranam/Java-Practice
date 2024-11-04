package constructors;

public class constructor_example1 {
	String name;
	int id;
	String company;
	
	constructor_example1(){
		name = "Mahendra";
		id = 101;
		company = "Neutara";
		System.out.println(name);
		System.out.println(id);
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		
		new constructor_example1();

	}
}
