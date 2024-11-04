package Data_Types;

public class double_examples {

	public static void main(String[] args) {
		
		//Range min -1.7976931348623157e308d to max 1.7976931348623157e308D 
		
		double d1 = 1.7976931348623157e308D;           // valid F: double  R: double
		double d2 = -1.7976931348623157e308D;          // valid F: double  R: double
		double d3 = 32768;           			// valid F: int  R: double
		double d4 = -32769;         			 // valid F: int  R: double
		double d5 = 1;             			// valid F: int  R: double
		double d6 = 3256L;         			 // valid F: long  R: double
		double d7 = 222.1F;          			  // valid F: float  R: double
		double d8 = 222.2;           			// valid F: double  R: double
		double d9 = "Mahendra";     			 // invalid F: string  R: double
		double d10 = 'M';            			// valid F: char  R: double
		double d11 = true;          			// invalid F: Boolean  R: double
		double d12 = 1.7976931348623157e309;           // invalid F: out of range  R: double
		double d13 = -1.7976931348623157e309;          // invalid F: out of range  R: double
		double d14 = 10.111111111111111;           	// valid F: double  R: double

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		System.out.println(d14);



	}

}
