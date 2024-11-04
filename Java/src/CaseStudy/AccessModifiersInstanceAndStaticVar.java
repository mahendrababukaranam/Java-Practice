package CaseStudy;

public class AccessModifiersInstanceAndStaticVar {
	
	private int a = 10;
			int b =20;
	protected int c =30;
	public int d = 40;
	
	private static int e = 50;
	static int f =60;
	protected static int g =70;
	public static int h = 80;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   AccessModifiersInstanceAndStaticVar A = new AccessModifiersInstanceAndStaticVar();
	   System.out.println(A.a);
	   System.out.println(A.b);
	   System.out.println(A.c);
	   System.out.println(A.d);
	   
	   System.out.println(A.e);
	   System.out.println(A.f);
	   System.out.println(A.g);
	   System.out.println(A.h);
	}

}
