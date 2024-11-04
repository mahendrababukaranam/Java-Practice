package this_pack;

public class this_default_example {
	int a;
	this_default_example(){
		this(125);
		this.m1(123);
	}
	this_default_example(int a){
		this.a=a;
		System.out.println(a);
	}
	void m1(int a) {
		this.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		new this_default_example();
	}

}
