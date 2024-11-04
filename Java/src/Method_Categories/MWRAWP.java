package Method_Categories;

public class MWRAWP {
	
	int me1(int a, int b) {
		System.out.println("The sum of a and b is : "+(a+b));
		return b;
	}
	

	public static void main(String[] args) {
		MWRAWP mc=new MWRAWP();
		System.out.println("The return value is : "+mc.me1(22, 97));
		
		

	}

}
