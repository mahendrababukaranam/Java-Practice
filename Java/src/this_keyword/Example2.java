package this_keyword;

public class Example2 {
	
	void m1() {
		System.out.println("Method 1");
	}
	void m2() {
		this.m1();
	}
	public static void main(String[] args) {
		Example2 E = new Example2();
		E.m2();
	}
}
