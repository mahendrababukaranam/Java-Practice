package Method_Categories;

public class MWORMWP {
	
	void rectanngle(int a, int b) {
		
		//Method without Returntype and Method with parameter.
		
		System.out.println("Rectangle area:");
		System.out.println("--------------------");
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		System.out.println("The area of Rectangle is : "+(a*b));
		System.out.println();
	}
	
	void mulparam(int x, int y, String name) {
		System.out.println("Rectangle area:");
		System.out.println("--------------------");
		System.out.println("The value of a is: "+x);
		System.out.println("The value of b is: "+y);
		System.out.println("The rectangle area is :"+(x*y)+" and the Owner name is : "+name);
		System.out.println();
	}
	void ex(int d, int g) {
		int f=d*g;
		System.out.println(f);
	}
		
	public static void main(String[] args) {
		
		MWORMWP re=new MWORMWP();
		re.rectanngle(12, 5);
		re.rectanngle(99, 220);
		re.mulparam(24, 67, "Mahendra");
		re.mulparam(45, 98, "Bheem");
		re.ex(22, 10);
		
	}

}
