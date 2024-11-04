package Access_Modifiers_P2;

import Access_Modifiers_P1.class1;

public class class3 extends class1 {

	public static void main(String[] args) {
		class3 C3=new class3();
		//System.out.println("Private is not Accessing in Class3 "+C3.a);
		//System.out.println("Default is Accessing in Class3 "+C3.a);
		System.out.println(C3.b);

	}

}
