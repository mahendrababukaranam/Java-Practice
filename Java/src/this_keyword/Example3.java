package this_keyword;

public class Example3 {
	int c;
	void m1(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	void m2() {
		this.m1(15, 42);
	
	}

	public static void main(String[] args) {
		Example3 E = new Example3();
		E.m2();
	}

}
