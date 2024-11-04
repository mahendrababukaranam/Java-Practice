package Variables;

public class static_expample3 {
	//static variable
	
	static String name = "Mahendra";
	
	void m1() {
		System.out.println("Accessing directly from method : "+name);
	}

	public static void main(String[] args) {
		//static area
		//with object reference accessing but we can access in static way
		static_expample3 st = new static_expample3();
		
		System.out.println("Accessing through object reference : "+st.name);//Accessing through object reference
		System.out.println("Accessing directly : "+name);
		st.m1();//by calling method
	}

}
