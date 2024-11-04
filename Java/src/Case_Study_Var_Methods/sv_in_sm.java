package Case_Study_Var_Methods;

public class sv_in_sm {
	static int a=10;
	
	static void m1() {
		System.out.println("One : "+a);
		m2();
	}
	static void m2() {
		System.out.println("Two : "+a);
		//m1();
	}
	

	public static void main(String[] args) {
		
		sv_in_sm n=new sv_in_sm();
		n.m1();
	}

}
