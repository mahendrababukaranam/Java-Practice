package this_pack;

public class this2 {
	int a=22;
	this2(){
		int a=30;
		System.out.println("Local Variable "+a);
		System.out.println("Good Morning");
		System.out.println("Instance Variable "+this.a);
		
	}
	this2(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new this2();
		//new this2(280);
		
		
     
		
	}

}
