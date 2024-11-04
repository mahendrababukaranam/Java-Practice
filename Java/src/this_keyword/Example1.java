package this_keyword;

public class Example1 {
	
	int a = 10;//instance variable
	
	void m1() {
		int a = 20;
		System.out.println(this.a); // instance variable 10
		System.out.println(a); // local variable 20
	}

	public static void main(String[] args) {
		Example1 E = new Example1();
		E.m1();
	}

}
