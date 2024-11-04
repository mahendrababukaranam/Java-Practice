package Control_Flow_Switch_Case;

public class Add_Sub_Mul_Div_SwitchCase {

	public static void main(String[] args) {

		int x = 'D';
		int i = 12;
		int j = 2;

		switch (x) {
		case 'A':
			System.out.println("The addition result of i and j is : " + (i + j));
			break;
		case 'S':
			System.out.println("The substraction result of i and j is : "+(i-j));
			break;
		case 'M':
			System.out.println("The multiplication result of i and j is : "+(i*j));
			break;
		case 'D':
			System.out.println("The division result of i and j is : "+(i/j));
			break;
		default:System.out.println("You have entered invalid operation");

		}

	}

}
