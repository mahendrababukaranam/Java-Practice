package this_pack;

public class this_default_example2 {
	int a;
	//Calling default constructor from parameterized constructor
	this_default_example2(){
		System.out.println("Default Constructor");
	}
	this_default_example2(int b){
		this();
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		new this_default_example2(20);
	}

}
