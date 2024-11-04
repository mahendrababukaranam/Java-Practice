package Data_Types;

public class long_examples {

	public static void main(String[] args) {
		//Range -9223372036854775808 to max 9223372036854775807
		
		long l1 = 9223372036854775807L;           // valid F: long  R: long
		long l2 = -9223372036854775808L;          // valid F: long  R: long
		long l3 = 32768;          				 // valid F: int  R: long
		long l4 = -32769;         				 // valid F: int  R: long
		long l5 = 121;             				// valid F: int  R: long
		long l6 = 32766L;          				// valid F: long  R: long
		long l7 = 222F;            				// invalid F: float  R: long
		long l8 = 222.2;           				// invalid F: double  R: long
		long l9 = "Mahendra";      				// invalid F: string  R: long
		long l10 = 'M';            				// valid F: char  R: long
		long l11 = true;          				// invalid F: Boolean  R: long
		long l12 = 9223372036854775808L;           // invalid F: out of range  R: long
		long l13 = -9223372036854775809L;          // invalid F: out of range  R: long
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6);
		System.out.println(l7);
		System.out.println(l8);
		System.out.println(l9);
		System.out.println(l10);
		System.out.println(l11);
		System.out.println(l12);
		System.out.println(l13);



	}

}
