package Case_Study_Var_Methods;

public class nsm_from_sm {
	static int a=10;
	int b=20;
	
	void m2() {
		System.out.println("Two : "+b);
	}
	static void m1() {
		System.out.println("One : "+a);
		//m2();//Cannot make a static reference to the non-static method m2() from the type nsm_from_sm
	}

	public static void main(String[] args) {
		
		nsm_from_sm n=new nsm_from_sm();
		n.m1();
		
	}

}
