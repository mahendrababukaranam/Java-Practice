package break_statement;

public class break_example5 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++) {
			if(i==4) {
				System.out.println(i);
				break;
			}	
		}
	}

}
