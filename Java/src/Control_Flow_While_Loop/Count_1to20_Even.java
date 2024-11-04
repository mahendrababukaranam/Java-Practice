package Control_Flow_While_Loop;

public class Count_1to20_Even {
	
	public static void main(String[] args) {
	
		int i=1;
		//int count=0;
		
		while(i<=20) {
			
			if(i%2==0) {
				System.out.println("Even Number is : "+i);
				i++;
				//count++;
			}
		}
		
		//System.out.println("Count is : "+count);
	}

}
