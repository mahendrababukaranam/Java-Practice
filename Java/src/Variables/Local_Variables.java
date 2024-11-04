package Variables;

public class Local_Variables {
	
	void Mahendra() {
		/*1. Variables inside method only.
		  2. Local Variables: We can access only in methods.
		  3. We can not access local variables outside of the method and in static method also we can not access.
		  4. If we want access local variables in main method we must need object reference.
		  5. When we create variables in main method those are also considered as "local variables" and those can be accessed in main method only, we can not access in methods.
		*/
		
		int id=10;
		String name="Mahendra";
		float Perc=85.3F;
		
		
		System.out.println("ID is : "+id);
		System.out.println("Name is : "+name);
		System.out.println("Percenatage is : "+Perc);
		
	}
	
	public static void main(String[] args) {
		
		String status="In Active";
		
		Local_Variables data=new Local_Variables();
		
		data.Mahendra();
		System.out.println(status);
		
	}

}
