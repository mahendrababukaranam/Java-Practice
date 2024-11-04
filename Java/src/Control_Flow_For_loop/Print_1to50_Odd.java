package Control_Flow_For_loop;

public class Print_1to50_Odd {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<=50; i++) {
			
			if(i%2!=0) {
				System.out.println("Odd Number is "+i);
			}
		}
	}

}
