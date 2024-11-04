package continue_statement;

public class continue_example2 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println(i);
	}

}
