package Control_Flow_Statements;

public class switch_example9 {

	public static void main(String[] args) {
		String month = "feb";
		
		switch(month) {  
		
		case "jan": System.out.println("January Month");break; 
		case "feb": System.out.println("February Month");break;
		case "mar": System.out.println("March Month"); break;
		case "apr": System.out.println("April Month"); break;
		case "may": System.out.println("May Month"); break;
		case "june": System.out.println("June Month");break;
		case "jul": System.out.println("July Month");break;
		case "aug": System.out.println("August Month");break;
		case "sep": System.out.println("September Month");break;
		case "oct": System.out.println("October Month");break;
		case "nov": System.out.println("November Month");break;
		case "dec": System.out.println("December Month");break;
		default: System.out.println("Unknown Month");
		}
	}

}
