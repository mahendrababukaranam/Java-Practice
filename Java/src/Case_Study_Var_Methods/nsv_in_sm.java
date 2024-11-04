package Case_Study_Var_Methods;

public class nsv_in_sm {
	int a=10;
	
	static void m1() {
		//System.out.println("One"+a);//Cannot make a static reference to the non-static field a
	}

	public static void main(String[] args) {
		
		nsv_in_sm n=new nsv_in_sm();
		n.m1();
		
	}

}
