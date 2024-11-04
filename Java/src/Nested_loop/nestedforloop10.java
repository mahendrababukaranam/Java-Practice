package Nested_loop;

public class nestedforloop10 {

	public static void main(String[] args) {
		/*
		 10987654321
		 987654321
		 87654321
		 7654321
		 654321
		 54321
		 4321
		 321
		 21
		 1
		 */
		for(int r=1; r<=10; r++ ) {
			for(int c=10-r+1; c>=1; c--) {
				System.out.print(c);	
			}
			System.out.println();
		}

	}

}
