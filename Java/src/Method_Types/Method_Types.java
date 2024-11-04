package Method_Types;

public class Method_Types {
	/*
	  If we don't initialize any value to the declared variable the 
	  jvm will consider the default values.
	  Example: int id=0;
			   static String name=null;
	           float perc=0.0;
	           boolean status=false;
	 */
	int id;
	static String name;
	float perc;
	boolean status;
	
	//Non static Method
	//We can access static and non static variables in non static method.
	void mahendra() {
		System.out.println("Printing non static variable in non static method :"+id);
		System.out.println("Printing static variable in non static method :"+name);
		System.out.println("Printing non static variable in non static method :"+perc);
		System.out.println("Printing non static variable in non static method :"+status);
		System.out.println("----------------------------");
		System.out.println("Static accessed in Non static method");
		//Mani();
		System.out.println("----------------------------");
		
	}
	
	//Static Method
	//We can not access non static variables data in static methods.
	static void Mani() {
		//Cannot make a static reference to the non-static field id
		//System.out.println("Printing non static variable in non static method :"+id);
		
		System.out.println("Printing non static variable in non static method :"+name);
		System.out.println("----------------------------");
		System.out.println("Non Static accessed in static method");
		//mahendra();//Unable to Access
		//System.out.println("----------------------------");
	}
	
	void Siri() {
		System.out.println("Print Siri Method");
		mahendra();//non static to non static
	}
	
	//Static to Static
	static void sai() {
		System.out.println("Printing Sai Data");
		Mani();
		
	}
	


	public static void main(String[] args) {
		
		Method_Types data=new Method_Types();
		data.mahendra();
		data.Mani();
		data.Siri();
		data.sai();
	}

}
