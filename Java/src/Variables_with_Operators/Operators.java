package Variables_with_Operators;

//Variables inside the packages and outside the class and methods
//

public class Operators {
	
	/* 
	  1. We can access static variable in main method without any object reference.
	  2. We can access static variable in any method.
	*/
	static int f;
	
	/*
	  1. Variables inside class and outside the method(Instant/Global Variables)
	  2. If we want to access instant/global variables in main method must need 
	     object reference.
	  3. We can access instant/global variables in methods
    */
	int a=25;
	int b=2;
	int sum =a+b;
	int sub=a-b;
	float div=a%b;
	int mul=a*b;
	
	//Pre Increment
	int princr_A=20;
	int preincr_A=++princr_A;
	
	int princr_B=20+7;
	int preincr_B=++princr_B;
	
	int princr_C=20-2;
	int preincr_C=++princr_C;
	
	int princr_D=20*2+8;
	int preincr_D=++princr_D;
	
	int princr_E=20/2+5;
	int preincr_E=++princr_E;
	
	int princr_F=20%2+3;
	int preincr_F=++princr_F;
	
	//Post Increment
		int princr_G=20;
		int preincr_G=princr_G++;
		
		int princr_H=20+7;
		int preincr_H=princr_H++;
		
		int princr_I=20-2;
		int preincr_I=princr_I++;
		
		int princr_J=20*2+8;
		int preincr_J=princr_J++;
		
		int princr_K=20/2+5;
		int preincr_K=princr_K++;
		
		int princr_L=20%2+3;
		int preincr_L=princr_L++;
	
	void mahendra() {
		//Variables inside method only
		//Local Variables: We can access only in method
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
		//Pre Increment
		
		System.out.println("Pre Increment");
		System.out.println(preincr_A);
		System.out.println(preincr_B);
		System.out.println(preincr_C);
		System.out.println(preincr_D);
		System.out.println(preincr_E);
		System.out.println(preincr_F);
		
		//Post Increment
		System.out.println("Post Increment");
		System.out.println(preincr_G);
		System.out.println(preincr_H);
		System.out.println(preincr_I);
		System.out.println(preincr_J);
		System.out.println(preincr_K);
		System.out.println(preincr_L);
	}
	
	public static void main(String[] args) {
		System.out.println(f);
		Operators ope=new Operators();
		ope.mahendra();
		
		System.out.println("Concatination");
		System.out.println(2+'2'-1);
		// 2+50(ASCII Value)-1
		//2+50-1
		//52-1=51
		
	}
	
}
