package Method_calling_mul_single_obj;

public class Example1 {
	void m1(int a, int b) {
		int c=a*b+a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Example1 ope = new Example1();
		ope.m1(10, 10);
		ope.m1(6, 7);
		ope.m1(8, 5);
		ope.m1(9, 6);
	}

}
