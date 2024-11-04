package Case_Study_Var_Methods;

public class sv_in_nsm {
	static int a=10;
	
	void m2() {
		System.out.println("One"+a);
	}

	public static void main(String[] args) {
		System.out.println("Two"+a);
		
		sv_in_nsm n=new sv_in_nsm();
		n.m2();
	}

}
