package Constructor_Overloading;

public class ConstructorCalling_Example {
	
	
	//Constructor Overloading
	ConstructorCalling_Example(String name){
		System.out.println(name);
	}
	ConstructorCalling_Example(int id){
		System.out.println(id);
	}
	ConstructorCalling_Example(boolean status){
		System.out.println(status);
	}
	public static void main(String[] args) {
		
		new ConstructorCalling_Example("Mahendra");
		new ConstructorCalling_Example(1212);
		new ConstructorCalling_Example("Active");
	}

}
