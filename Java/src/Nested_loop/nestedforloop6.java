package Nested_loop;

public class nestedforloop6 {

	public static void main(String[] args) {
		
		/*
		  *
		  **
		  ***
		  ****
		  *****
		  ******
		  *******
		  ********
		  *********
		 */
		for(int r=1; r<=9; r++ ) {
			for(int c=1; c<=r; c++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
