package Data_Types;

public class short_examples {

	public static void main(String[] args) {
		//Range -32768 to max 32767
		
		short s1 = 32767;           // valid F: short  R: short
		short s2 = -32768;          // valid F: short  R: short
		//short s3 = 32768;           // invalid F: int  R: short
		//short s4 = -32769;          // invalid F: int  R: short
		short s5 = 121;             // valid F: short  R: short
		//short s6 = 32766L;          // invalid F: long  R: short
		//short s7 = 222F;            // invalid F: float  R: short
		//short s8 = 222.2;           // invalid F: double  R: short
		//short s9 = "Mahendra";      // invalid F: string  R: short
		short s10 = 'M';            // valid F: char  R: short
		short s11 = true;          // invalid F: boolean  R: short
		
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		System.out.println(s5);
		//System.out.println(s6);
		//System.out.println(s7);
		//System.out.println(s8);
		//System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		

	}

}
