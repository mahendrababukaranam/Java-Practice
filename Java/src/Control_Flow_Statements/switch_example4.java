package Control_Flow_Statements;

public class switch_example4 {

	public static void main(String[] args) {
		int a = 2;
		
		switch(a=2) {  
		
		default: System.out.println("Statement N");
		case 0: System.out.println("Statement 1");break;
		case 1: System.out.println("Statement 2");break;
		case 2: System.out.println("Statement 3"); // o/p: Statement 1
		case 3: System.out.println("Statement 4"); // o/p: Statement 2
		case 4: System.out.println("Statement 5"); // o/p: Statement 3
		
		
		}
	}

}
