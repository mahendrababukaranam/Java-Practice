package Hierarchical_Inheritance2;

public class Main_Class {
	
	public static void main(String args[]) {
		Cat C = new Cat();
		C.setFood("Curd Rice");
		System.out.println(C.getFood());
		
		Dog D = new Dog();
		D.setFood("Meat");
		System.out.println(D.getFood());
		
		Cow Co = new Cow();
		Co.setFood("Grass");
		System.out.println(Co.getFood());
		
	}
}
