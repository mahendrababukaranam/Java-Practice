package Data_Types;

public class string_example {

	public static void main(String[] args) {
		String s1 = "Mahendra";   //valid F: String   R: String
		String s2 = 'M';   		  //invalid F: char   R: String
		String s3 = 10;          //invalid F: int   R: String
		String s4 = 1897554388l;   //invalid F: long   R: String
		String s5 = 2.5f;            //invalid F: float   R: String
		String s6 = 12.3;            //invalid F: double   R: String
		String s7 = "12345";        //valid F: String   R: String

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}

}
