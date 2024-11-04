package for_loop;

public class nested_for_example6 {

	public static void main(String[] args) {
		for(int i=1; i<7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
