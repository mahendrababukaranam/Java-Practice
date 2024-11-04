package CaseStudy;


public class PrimeNumber {
	
	String PrimeNumber(int PN) {
		
		if(PN<0) {
			
			return "Not Prime";
		}
		
		if(PN==0 || PN==1) {
			return "Not Prime";
		}
		
		for(int i=2; i<=PN/2; i++) {
			
			if(PN%i==0) {
				return "Not a Prime Number";
			}
		}
			return "Prime Number";
		
	}

	public static void main(String[] args) {
		
		PrimeNumber p = new PrimeNumber();
		System.out.println(p.PrimeNumber(-1));
	

	}

}



