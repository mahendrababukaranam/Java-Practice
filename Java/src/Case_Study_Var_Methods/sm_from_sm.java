package Case_Study_Var_Methods;

public class sm_from_sm {
	int a=10;
	
	static void m1() {
		//System.out.println("One"+a);//Cannot make a static reference to the non-static field a
	}

	public static void main(String[] args) {
		
		sm_from_sm n=new sm_from_sm();
		n.m1();
		
	}

}
