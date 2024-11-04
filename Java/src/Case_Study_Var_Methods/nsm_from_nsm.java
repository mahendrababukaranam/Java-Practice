package Case_Study_Var_Methods;

public class nsm_from_nsm {
	int a=10;
	int b=20;
	
	void m2() {
		System.out.println("Two : "+b);
	}
	void m1() {
		System.out.println("One : "+a);
		m2();
	}

	public static void main(String[] args) {
		
		nsm_from_nsm n=new nsm_from_nsm();
		n.m1();
		
	}

}
