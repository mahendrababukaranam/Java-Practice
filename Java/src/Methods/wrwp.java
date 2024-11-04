package Methods;

public class wrwp {
//Method with Returntype and Method with parameter
	int addition(int a, int b) {	
		int c = a+b;
		return c;	
	}
	public static void main(String[] args) 
	{
		wrwp e1 = new wrwp();
		int result = e1.addition(22,33);
		System.out.println(result);
	}
	
}
