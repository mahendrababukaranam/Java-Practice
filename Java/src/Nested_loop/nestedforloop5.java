package Nested_loop;

public class nestedforloop5 {

	public static void main(String[] args) {
		
		/*
		  1
		  12
		  123
		  1234
		  12345
		  123456
		  1234567
		  12345678
		  123456789
		 */
		for(int r=1; r<=9; r++ ) {
			for(int c=1; c<=r; c++) {
				System.out.print(r);
				
			}
			System.out.println();
		}

	}

}
