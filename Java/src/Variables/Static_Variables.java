package Variables;

public class Static_Variables {
	
	/*
	  1. Static Variables: Before data-type we need to use static keyword.
	  2. Static variables can be accessed in any place without any object reference.
	  3. We can not assign static keyword in main method because by default that is a static method. 
	 */
	static int id=11;
	static String name="Mahendra";
	static float perc=85.3F;
	
	void Mahendra() {
		System.out.println("ID is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Percentage is :"+perc);
		
	}
	static void m2() {
		System.out.println(id);
	}
	
	

	public static void main(String[] args) {
		
		int na=10;
		
		System.out.println("--Accessed static data without object reference--");
		System.out.println("ID is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Percentage is :"+perc);
		
		System.out.println("--Accessed static data with object reference--");
		Static_Variables data=new Static_Variables();
		data.Mahendra();
		
		System.out.println(na);
		data.m2();
		

	}

}
