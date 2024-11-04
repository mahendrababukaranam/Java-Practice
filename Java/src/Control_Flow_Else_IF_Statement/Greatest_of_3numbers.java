package Control_Flow_Else_IF_Statement;

public class Greatest_of_3numbers {
	
	
	public static void main(String[] args) {
		int a=25;
		int b=32;
		int c=15;
		
		if(a>=b && a>=c) {
			System.out.println(a+" is Greatest Number");
		}
		else if(b>=a && b>=c){
			System.out.println(b+" is Greatest Number");
		}
		else if(c>=a && c>=b) {
			System.out.println(c+" is Greatest Number");
		}
	}
}
