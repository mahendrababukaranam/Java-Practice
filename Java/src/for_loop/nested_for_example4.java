package for_loop;

public class nested_for_example4 {

	public static void main(String[] args) {
		int k = 15;
		for(int i=4; i>0; i--) {
			for(int j=4; j>0; j--) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}

}
