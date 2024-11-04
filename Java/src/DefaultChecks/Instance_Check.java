package DefaultChecks;

public class Instance_Check {
	
	int i;
	float f;
	double d;
	char c;
	String s;
	long l;
	
	void mahendra() {
		System.out.println("The value of i is : "+i);
		System.out.println("The value of f is : "+f);
		System.out.println("The value of d is : "+d);
		System.out.println("The value of c is : "+c);
		System.out.println("The value of s is : "+s);
		System.out.println("The value of l is : "+l);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Instance_Check data=new Instance_Check();
		data.mahendra();
		
	}

}
