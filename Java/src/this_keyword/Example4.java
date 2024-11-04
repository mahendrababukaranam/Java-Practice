package this_keyword;

public class Example4 {
	Example4(){
		System.out.println("Default Constructor");
	}
	Example4(int a) {
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Example4(10);
	}

}
