package Test_Package;

public class methods {
	
	String name1="Mahendra1";
	String name2="Mahendra2";
	static String name3="Mahendra3";
	static String name4="Mahendra4";
	
	void test1() {
	    System.out.println("Non Static Method: "+name1);
	}
	
	void test2() {
		System.out.println("From Test2 Method");
	    System.out.println("Non Static Method: "+name2);
	    System.out.println("Accessing non static test1 method to test2 non static method");
	    test1();
	    test3();
	}
	
	static void test3() {
		System.out.println("From Test3 Method");
		System.out.println("Non Static Method: "+name3);
		System.out.println("Accessing non static test2 method to test3 static method");
		//test2();
	}
	
	static void test4() {
		System.out.println("From Test4 Method");
		System.out.println("Non Static Method: "+name4);
		System.out.println("Accessing non static test3 method to test4 static method");
		test3();
	}
	
	public static void main(String[] args) {
		
		methods te=new methods();
		te.test1();
		te.test2();
		//System.out.println(test3);
		test3();
		test4();
	}

}
