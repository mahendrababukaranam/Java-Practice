package Control_Flow_Else_IF_Statement;

public class Even_Print_Tom_Between_10and25 {

	
	public static void main(String[] args) {
		int a=20;
		String name="TOM";
		String error="OPPS";
		
		if(a%2==0 && a>=10 && a<=22) {
			System.out.println("Given Number is even number so displayed : "+name);
		}
		else {
			System.out.println("Given Number is Odd number so displayed : "+error);
		}
	}
	
}
