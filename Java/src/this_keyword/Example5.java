package this_keyword;

public class Example5 {
	Example5(int c, int b){
		System.out.println(c);
		System.out.println(b);
	}
	Example5(int a) {
		this(25,45);
		System.out.println(a);
	}
	Example5(){
		this(8);
	}
	public static void main(String[] args) {
		new Example5();
	}

}
