package Variables;

public class instance_example1 {
	
	//Instance Variables
	String name = "Mahendra";
	String city = "Hyderabad";
	static long mn = 8978687932L;
	void m1() {
		System.out.println(name);
	}


	public static void main(String[] args) {
		
		instance_example1 a = new instance_example1();
		System.out.println(a.name);
		System.out.println(a.city);
		System.out.println(mn );

	}

}
