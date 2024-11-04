package for_loop;

public class nested_for_example3 {

	public static void main(String[] args) {
		int k = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
