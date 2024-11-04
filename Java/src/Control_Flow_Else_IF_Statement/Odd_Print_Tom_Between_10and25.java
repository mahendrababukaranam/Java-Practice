package Control_Flow_Else_IF_Statement;

public class Odd_Print_Tom_Between_10and25 {

	
	public static void main(String[] args) {
		int a=21;
		String name="JERRY";
		String error="OPPS";
		
		if(a%2!=0 && a>=10 && a<=25) {
			System.out.println("Given Number is Odd number so displayed : "+name);
		}
		else {
			System.out.println("Given Number is Even number so displayed : "+error);
		}
	}
	
}
