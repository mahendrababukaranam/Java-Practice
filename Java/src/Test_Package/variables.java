package Test_Package;

public class variables {
	
	int a=10;
	int b=20;//Cannot make a static reference to the non-static field b
	
	void test() {
		int c=30;//c cannot be resolved to a variable
		//byte a1=128;//Type mismatch: cannot convert from int to byte
		//short a2=313333;//Type mismatch: cannot convert from int to short
		//int a3=2233445566;//The literal 2233445566 of type int is out of range
		//long a4=9399228833337766553l;//The literal 9399228833337766553l of type long is out of range
		//float a5=9399228833337766553l;//The literal 9399228833337766553l of type long is out of range 
		float a6=9399228833337766553f;
		//double a7=9999999999999999999999999999999999999999999f;
		//boolean a8=19797907889l;
		boolean a9=false;
		//char a10='39';
		
		System.out.println(a);
		System.out.println(c);
		//System.out.println(a1);
		//System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a6);
		System.out.println(a9);
	}

	public static void main(String[] args) {
		variables te=new variables();
		te.test();
		//System.out.println(b);
		//System.out.println(c);

	}

}
