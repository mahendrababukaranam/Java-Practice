package Data_Types;

public class char_example {

	public static void main(String[] args) {
		char c1 = "Mahendra";   //invalid F: String   R: char
		char c2 = 'M';   		  //valid F: char   R: char
		char c3 = '1';          //valid F: char   R: char
		char c4 = 1897554388l;   //invalid F: long   R: char
		char c5 = 2.5f;            //invalid F: float   R: char
		char c6 = 12.3;            //invalid F: double   R: char
		char c7 = true;           //invalid F: boolean   R: char
		char c8 ='@';			//valid F: char   R: char
		       

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
	}

}
