package Case_Study_Var_Methods;

public class sm_from_nsm {
	static int a=10;
	int b=20;
	
	void m2() {
		m1();
		System.out.println("Two : "+b);
	}
	static void m1() {
		System.out.println("One : "+a);
	}

	public static void main(String[] args) {
		
		sm_from_nsm n=new sm_from_nsm();
		n.m2();
		
	}

}
