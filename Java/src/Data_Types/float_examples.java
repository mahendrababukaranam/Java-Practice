package Data_Types;

public class float_examples {

	public static void main(String[] args) {
		//Range min -3.4028235e38F to max 3.4028235e38F
		
		float f1 = 3.4028235e38F;           // valid F: float  R: float
		float f2 = -3.4028235e38F;          // valid F: float  R: float
		float f3 = 32768;           // valid F: int  R: float
		float f4 = -32769;          // valid F: int  R: float
		float f5 = 121;             // valid F: int  R: float
		float f6 = 32566L;          // valid F: long  R: float
		float f7 = 222.1F;            // valid F: float  R: float
		float f8 = 222.2;           // invalid F: double  R: float
		float f9 = "Mahendra";      // invalid F: string  R: float
		float f10 = 'M';            // valid F: char  R: float
		float f11 = true;          // invalid F: Boolean  R: float
		float f12 = 3.4028235e39F;           // invalid F: out of range  R: float
		float f13 = -3.4028235e39F;          // invalid F: out of range  R: float
		float f14 = 2.1111111111f;           // valid F: float  R: float
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
		System.out.println(f10);
		System.out.println(f11);
		System.out.println(f12);
		System.out.println(f13);
		System.out.println(f14);

	}

}
