package Control_Flow_Statements;

public class switch_example7 {

	public static void main(String[] args) {
		int a = 2;
		final int x = 22;
		
		switch(x) {  
		
		case 0: System.out.println("Statement 1");break; 
		case 1: System.out.println("Statement 2");break;
		case 2: System.out.println("Statement 3"); 
		case 3: System.out.println("Statement 4"); 
		case 4: System.out.println("Statement 5"); 
		case x: System.out.println("Statement 5");
		default: System.out.println("Statement N");
		}
	}

}
