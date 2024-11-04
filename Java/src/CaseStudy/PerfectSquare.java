package CaseStudy;

public class PerfectSquare {
	
	
	
	public static void main(String[] args) {
		
		int val1=1600;
		for(int i=1; i<=val1; i++) {
			if(i*i<=val1) {
				if(i*i==val1) {
					System.out.println("The "+val1+" value is perfect Square "+i);
					break;
				}
			}
			else {
				System.out.println("The "+val1+" value is not perfect Square "+i);
				break;
			}
			
			
		}
		
	}

}
