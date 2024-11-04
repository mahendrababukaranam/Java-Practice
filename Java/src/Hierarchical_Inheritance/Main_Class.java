package Hierarchical_Inheritance;

public class Main_Class {

	public static void main(String[] args) {
		//Child Class1
		Child_Class1 c1 = new Child_Class1(); // Case1: calling parent and child1
		c1.child1();
		c1.parent();

		Parent_Class p1 = new Child_Class1(); // Case2: Calling parent only
		p1.parent();
		p1.child1();
		
		Parent_Class p4 = new Parent_Class(); // Case3: Calling parent only
		p4.parent();
		p4.child1();
		
		Child_Class1 p5 = new Parent_Class(); // Case4: Invalid
		p5.parent();
		p5.child1();
		
		
		//Child Class2
		Child_Class2 c2 = new Child_Class2(); // Case1: calling parent and child2
		c2.child1();
		c2.parent();
		c2.child2();;

		Parent_Class p2 = new Child_Class2(); // Case2: Calling parent only
		p2.parent();
		p2.child1();
		p2.child2();
		
		Parent_Class p6 = new Parent_Class(); // Case3: Calling parent only
		p6.parent();
		
		Child_Class1 p7 = new Parent_Class(); // Case4: Invalid
		p7.parent();
		
		//Child Class3
		Child_Class3 c3 = new Child_Class3(); // Case1: calling parent and child3
		c3.child1();
		c3.parent();
		c3.child2();
		c3.child3();

		Parent_Class p3 = new Child_Class3(); // Case2: Calling parent only
		p3.parent();
		p3.child1();
		p3.child2();
		p3.child3();
		
		Parent_Class p8 = new Parent_Class(); // Case3: Calling parent only
		p8.parent();
		
		Child_Class1 p9 = new Parent_Class(); // Case4: Invalid
		p9.parent();
	}
	
}
