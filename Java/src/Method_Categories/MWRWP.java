package Method_Categories;

public class MWRWP {
	
	//Method with Returntype and Method with parameter.
	
	int meth1(int a, int b) {
		
		System.out.println("Sum:");
		System.out.println("--------------------");
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		System.out.println("The sum of a and b values : "+(a+b));
		System.out.println();
		return a;
		
	}
	
	String meth2(String fname, String mname, String lname, String fullname) {
		/*When we declare a return type we must return a value otherwise we will get
		  "This method must return a result of type String" compilation error.
		 */
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Student Names:");
		System.out.println("-----------------------------------------------------");
		System.out.println("First Name   		  : "+fname);
		System.out.println("Middle Name  		  : "+mname);
		System.out.println("Last Name    		  : "+lname);
		System.out.println("Full Name    		  : "+fullname);
		return fullname;
	
	}

	public static void main(String[] args) {
		
		MWRWP sum=new MWRWP();
		sum.meth1(22, 96);
		System.out.println("The return Value of meth1 is: "+sum.meth1(97, 98));
		sum.meth2("Mahendra", "Babu", "Karanam", "Mahendra Babu Karanam");
		System.out.println("Printing the return value : "+sum.meth2("Ravindra", "Babu", "Karanam", "Ravindra Babu Karanam"));

	}

}
