package Control_Flow_Statements;

public class switch_example1 {

	public static void main(String[] args) {
		int a;
		
		switch(a=2) {
		
		case 0: System.out.println(a+"Statement 1");break;
		case 1: System.out.println("Statement 2");break;
		case 2: System.out.println("Statement 3");break;
		case 3: System.out.println("Statement 4");break;
		case 4: System.out.println("Statement 5");break;
		default: System.out.println("Statement N");
		
		}
	}

}
