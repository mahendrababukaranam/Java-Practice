package Nested_loop;

public class nestedforloop7 {

	public static void main(String[] args) {
		
		/*
		  *********
		  ********
		  *******
		  ******
		  *****
		  ****
		  ***
		  **
		  *
		 */
		for(int r=1; r<=9; r++ ) {
			for(int c=9; c>=r; c--) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
