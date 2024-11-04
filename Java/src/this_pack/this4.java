package this_pack;

public class this4 {
	
	int b=22;
	
	void m1() {
		System.out.println("This is method");
	}
	this4(){
		this(2);
		this.m1();
		System.out.println(this.b);
		System.out.println("This is default constructor");
	}
	
	this4(int a){
		System.out.println("This is Parameterized Constructor");
		
	}
	
	public static void main(String[] args) {
		new this4();
		
		
		
     
		
	}

}
