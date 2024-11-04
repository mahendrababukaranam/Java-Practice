package DefaultChecks;

public class Local_Check {
	
	
	
	void mahendra() {
		
		//int i;
		//float f;
		//double d;
		//char c;
		//String s;
		//long l;
		
		//System.out.println("The value of i is : "+i);
		//System.out.println("The value of f is : "+f);
		//System.out.println("The value of d is : "+d);
		//System.out.println("The value of c is : "+c);
		//System.out.println("The value of s is : "+s);
		//System.out.println("The value of l is : "+l);
		
		/*Output:
		  -------
		   The local variable i may not have been initialized
		   The local variable f may not have been initialized
	       The local variable d may not have been initialized
	       The local variable c may not have been initialized
	       The local variable s may not have been initialized
	       The local variable l may not have been initialized

		 */
	}
	
	
	public static void main(String[] args) {
		
		Local_Check data=new Local_Check();
		data.mahendra();
		
	}

}
