package Control_Flow_IF_Statement;

public class Greatest_of_Two_Numbers1 {
	/* 
	  if(condition)
	  {
	  body(Only true statement)
	  }
	  else
	  {
	  body(Only false statement)
	  }
	  
	  Process: 
	  --------
	  Step-1: Check the Condition
	  Step-2: if true -> Executes only if body.
	          if false -> Executes only else body.
	 */
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a<b) {
			System.out.println(a+" is less than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}

}
