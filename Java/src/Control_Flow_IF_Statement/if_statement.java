package Control_Flow_IF_Statement;

public class if_statement {

	public static void main(String[] args) {
		int a=99;
		
		if (a==99) {
			System.out.println("TRUE");
		}
		if_statement a1=new if_statement();
		a1.m1();
		a1.m2();
		a1.m3();
		
	}
	
	
	void m1() {
		int a=98;
		if(a%2!=0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	void m2() {
		int a=13;
		
		switch(a) {
		case 1:System.out.println("January");break;
		case 2:System.out.println("February");break;
		case 3:System.out.println("March");break;
		case 4:System.out.println("April");break;
		case 5:System.out.println("May");break;
		case 6:System.out.println("June");break;
		case 7:System.out.println("July");break;
		case 8:System.out.println("August");break;
		case 9:System.out.println("September");break;
		case 10:System.out.println("October");break;
		case 11:System.out.println("November");break;
		case 12:System.out.println("December");break;
		default:System.out.println("You have entered the month is out of the list");
		}
	}
	void m3() {
		String mon="dec";
		
		switch(mon) {
		case "jan":System.out.println("January");break;
		case "feb":System.out.println("February");break;
		case "mar":System.out.println("March");break;
		case "apr":System.out.println("April");break;
		case "may":System.out.println("May");break;
		case "june":System.out.println("June");break;
		case "jul":System.out.println("July");break;
		case "aug":System.out.println("August");break;
		case "sep":System.out.println("September");break;
		case "oct":System.out.println("October");break;
		case "nov":System.out.println("November");break;
		case "dec":System.out.println("December");break;
		default:System.out.println("You have entered the month is out of the list");
		}
	}

}
