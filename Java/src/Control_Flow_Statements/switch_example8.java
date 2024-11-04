package Control_Flow_Statements;

public class switch_example8 {

	public static void main(String[] args) {
		char ch = 'i';
		
		switch(ch) {  
		
		case 'a':  
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u':
		case 'A':  
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U':System.out.println(ch+" is a Vowel");break;
		default: System.out.println(" Consonants");
		}
	}

}
