package Control_Flow_Switch_Case;

public class Print_All_Months {

	public static void main(String[] args) {
        
		String month="May";
		
		//Switch Case
		switch(month){
		case "Jan":System.out.println("You have entered January month");break;
		case "Feb":System.out.println("You have entered February month");break;
		case "Mar":System.out.println("You have entered March month");break;
		case "Apr":System.out.println("You have entered April month");break;
		case "May":System.out.println("You have entered May month");break;
		case "Jun":System.out.println("You have entered June month");break;
		case "Jul":System.out.println("You have entered July month");break;
		case "Aug":System.out.println("You have entered August month");break;
		case "Sep":System.out.println("You have entered September month");break;
		case "Oct":System.out.println("You have entered October month");break;
		case "Nov":System.out.println("You have entered November month");break;
		case "Dec":System.out.println("You have entered December month");break;
		default:System.out.println("You have been entered invalid month");break;
		}
	}
}

