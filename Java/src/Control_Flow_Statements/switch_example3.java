package Control_Flow_Statements;

public class switch_example3 {

	public static void main(String[] args) {
		int a = 0;
		
		switch(a=2) {    //Override a=0 to a=2
		
		case 0: System.out.println("Statement 1");break;
		case 1: System.out.println("Statement 2");break;
		case 2: System.out.println("Statement 3"); // o/p: case 2 to default all statements will print
		case 3: System.out.println("Statement 4");
		case 4: System.out.println("Statement 5");
		default: System.out.println("Statement N");
		
		}
	}

}
