package Control_Flow_For_loop;

public class Count_1to20_Even {

	//Question: Count of even number from 1 to 20?
	
	public static void main(String[] args) {
		
		int i;
		int count=0;
		
		for(i=1; i<=20; i++) {
			
			if(i%2==0) {
				System.out.println("Even Number is : "+i);
				count++;
			}
		}
				System.out.println("Total Count is : "+count);
		
	}
	
	
}
