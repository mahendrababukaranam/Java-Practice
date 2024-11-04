package CaseStudy;

public class Print100to50 {
	
	
	
	public static void main(String[] args) {
		
		/*for(int i=100; i>=50; i--) {
			if(i!=75 && i!=57) {
				System.out.println(i);
			}
			
		}*/
		
		for(int i=100; i>=50; i--) {
			if(i==75 || i==57) {
				continue;
			}
			System.out.println(i);
		}
	}

}
