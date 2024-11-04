package this_pack;

public class this1 {

	int a=10;
	
	this1(){
		int a=20;
		System.out.println("Local Variable "+a);
		System.out.println("Instance Variable "+this.a);
	}
	
	
	public static void main(String[] args) {
		
       new this1();
		
	}

}
