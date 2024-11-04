package break_statement;

public class break_example4 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println(i);
	}

}
