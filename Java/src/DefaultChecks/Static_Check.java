package DefaultChecks;

public class Static_Check {
	
	static int i;
	static float f;
	static double d;
	static char c;
	static String s;
	static long l;
	
	void mahendra() {
		System.out.println("The value of i is : "+i);
		System.out.println("The value of f is : "+f);
		System.out.println("The value of d is : "+d);
		System.out.println("The value of c is : "+c);
		System.out.println("The value of s is : "+s);
		System.out.println("The value of l is : "+l);
		
		/*Output:
		  -------
		   The value of i is : 0
           The value of f is : 0.0
           The value of d is : 0.0
           The value of c is : 
           The value of s is : null
           The value of l is : 0
		 */
	}
	
	
	public static void main(String[] args) {
		
		Static_Check data=new Static_Check();
		data.mahendra();
		//data.naga();
		System.out.println();
		System.out.println("Accessing Static variables in static way in main method");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of f is : "+f);
		System.out.println("The value of d is : "+d);
		System.out.println("The value of c is : "+c);
		System.out.println("The value of s is : "+s);
		System.out.println("The value of l is : "+l);
		
		
	}
	static void naga() {
		System.out.println("Accessing static variables in static method");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of f is : "+f);
		System.out.println("The value of d is : "+d);
		System.out.println("The value of c is : "+c);
		System.out.println("The value of s is : "+s);
		System.out.println("The value of l is : "+l);
	}

}
