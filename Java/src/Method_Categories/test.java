package Method_Categories;

public class test {
	
	int Hello(int a, int b) {
		System.out.println("Sum of A and B is : "+(a+b));
		
		return a;
		
		
	}
	
	public static void main(String[] args) {
		test i=new test();
		i.Hello(10, 20);
		System.out.println(i.Hello(12, 16));
		
	}

}
