package Control_Flow_Statements;

public class switch_example10 {

	public static void main(String[] args) {
		String browser = "chrome";
		
		switch(browser) {  
		
		case "safari": System.out.println("Open Safari Browser");break; 
		case "chrome": System.out.println("Open Chrome Browser");break;
		case "opera": System.out.println("Open Opera Browser"); break;
		case "IE": System.out.println("Open IE Browser"); break;
		case "firefox": System.out.println("Open FireFox Browser"); break;
		case "edge": System.out.println("Open Microsoft Edge Browser"); break;
		default: System.out.println("Unknown browser");
		}
	}

}
