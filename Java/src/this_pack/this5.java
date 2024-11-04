package this_pack;

public class this5 {
	
	int b=22;
	
	void m1() {
		System.out.println("This is method");
	}
	this5(){
		System.out.println("This is default constructor");
	}
	
	this5(int a){
		this();
		this.m1();
		System.out.println(this.b);
		System.out.println("This is Parameterized Constructor");
		
	}
	
	public static void main(String[] args) {
		new this5(2);
		
		
		
     
		
	}

}
