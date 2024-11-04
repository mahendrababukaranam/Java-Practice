package Control_Flow_Else_IF_Statement;

public class Given_Number_Positive_Negative {
	
	
	public static void main(String[] args) {
		int a=-1000;
		
		if(a>=0) {
			System.out.println("Given "+a+" value is Positive");
		}
		/*
		 * else if(a==0) { System.out.println("Given "+a+" value is Positive"); }
		 */
		else if(a>0) {
			System.out.println("Given "+a+" value is Positive");
		}
		else {
			System.out.println("Given "+a+" value is Nagative");
		}
	}

}
