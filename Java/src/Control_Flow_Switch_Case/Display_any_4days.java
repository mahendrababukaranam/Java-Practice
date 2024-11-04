package Control_Flow_Switch_Case;

public class Display_any_4days {

	public static void main(String[] args) {
        
		int day_num=2;
		
		//Switch Case
		switch(day_num){
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("Monday");
		case 3:System.out.println("Tuesday");
		case 4:System.out.println("Wednesday");break;//It will execute up to break statement
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saturday");break;
		default:System.out.println("You have been entered out of the day list");break;
		}
	}
}

