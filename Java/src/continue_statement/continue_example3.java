package continue_statement;

public class continue_example3 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++) {
			if(i==3) {
				System.out.println(i);
				continue;
			}
		}
	}

}
