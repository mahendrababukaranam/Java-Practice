package Control_Flow_Switch_Case;

public class Without_Break_Statement {

	
	public static void main(String[] args) {
        
		int day_num=4;
		
		//Switch Case
		switch(day_num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("Weekdays");break;
		case 6:System.out.println("Weekend-1");break;
		case 7:System.out.println("Weekend-2");break;
		default:System.out.println("You have been entered out of the day list");break;
		}
		
		
	}
	
}
