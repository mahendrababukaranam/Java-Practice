package Control_Flow_IF_Statement;

public class Given_22_Divisible_By_2_and_11 {
	
	
	public static void main(String[] args) {
		int a=22;
		int b=2;
		int c=11;
		
		if(a%b==0 && a%c==0){
			System.out.println(a+" is divisible by "+b+" and "+c);
		}
		else {
			System.out.println(a+" is not divisible by "+b+" and "+c);
		}
	}

}
