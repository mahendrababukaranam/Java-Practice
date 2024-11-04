package Variables;

public class Instance_Variables {

	int id=1;
	String name="Mahendra";
	float percentage=85.3F;
	/*
	  1. Variables inside class and outside the method(Instant/Global Variables).
	  2. If we want to access instant/global variables in main method must need 
	     object reference.
	  3. We can access instant/global variables in methods also.
  */
	
	void Mahendra() {
		System.out.println();
		System.out.println("<--- This Data is displaying from Method--->");
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Percentage is: "+percentage);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(id);//Cannot make a static reference to the non-static field id
		
		Instance_Variables data=new Instance_Variables();
		System.out.println("ID is: "+data.id);
		System.out.println("Name is: "+data.name);
		System.out.println("Percentage is: "+data.percentage);
		data.Mahendra();

	}
	
}
