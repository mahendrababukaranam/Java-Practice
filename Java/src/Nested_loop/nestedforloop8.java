package Nested_loop;

public class nestedforloop8 {

	public static void main(String[] args) {
		
		
		/*
		 10987654321
		 1098765432
		 109876543
		 10987654
		 1098765
		 109876
		 10987
		 1098
		 109
		 10
		 */
		for(int r=1; r<=10; r++ ) {
			for(int c=10; c>=r; c--) {
				System.out.print(c);
				
			}
			System.out.println();
		}

	}

}
