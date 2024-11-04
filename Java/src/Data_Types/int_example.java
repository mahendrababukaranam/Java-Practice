package Data_Types;

public class int_example {

	public static void main(String[] args) {
		//Range -2147483648 to max 2147483647
		
		int i1 = 2147483647;      // valid F: int  R: int
		int i2 = -2147483648;     // valid F: int  R: int
		int i3 = 32768;           // valid F: int  R: int
		int i4 = -32769;          // valid F: int  R: int
		int i5 = 121;             // valid F: int  R: int
		int i6 = 32766L;          // invalid F: long  R: int
		int i7 = 222F;            // invalid F: float  R: int
		int i8 = 222.2;           // invalid F: double  R: int
		int i9 = "Mahendra";      // invalid F: string  R: int
		int i10 = 'M';            // valid F: char  R: int
		int i11 = true;           // invalid F: Boolean  R: int
		int i12 = 2147483648;     // invalid F: out of range  R: int
		int i13 = -2147483649;    // invalid F: out of range  R: int
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(i8);
		System.out.println(i9);
		System.out.println(i10);
		System.out.println(i11);
		System.out.println(i12);
		System.out.println(i13);


	}

}
