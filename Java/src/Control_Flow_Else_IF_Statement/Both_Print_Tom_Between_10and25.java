package Control_Flow_Else_IF_Statement;

public class Both_Print_Tom_Between_10and25 {

	
	public static void main(String[] args) {
		int a=20;
		String name1="TOM";
		String name2="JERRY";
		String error="Tom and Jerry";
		
		if(a%2==0 && a>=10 && a<=25) {
			System.out.println("Given Number is Even number so displayed : "+name1);
		}
		else if(a%2!=0 && a>=10 && a<=25){
			System.out.println("Given Number is Odd number so displayed : "+name2);
		}
		else {
			System.out.println(error);
		}
	}
	
}
