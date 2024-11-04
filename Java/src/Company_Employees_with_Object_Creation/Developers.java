package Company_Employees_with_Object_Creation;

public class Developers {
	
	void Pavan() {
		System.out.println("Hi, This is Pavan from Hyderabad");
	}
	
	void Shailendra() {
		System.out.println("Hi, This is Shailendra from Maharastra");
	}
	
	void Ravi() {
		System.out.println("Hi, This is Ravi from Hyderabad");
	}
	
	void Jubeda() {
		System.out.println("Hi, This is Jubeda from Vijayawada");
	}
	

	public static void main(String[] args) {
		//Multiple Objects for Single Class
		//Object-1 
		Developers dev_details1=new Developers();
		System.out.println("Object:1 Details");
		System.out.println("-----------------");
		dev_details1.Jubeda();
		dev_details1.Ravi();
		
		System.out.println("");
		System.out.println("Object:2 Details");
		System.out.println("-----------------");
		//Object-2
		Developers dev_details2=new Developers();
		dev_details2.Shailendra();
		dev_details2.Pavan();
	}

}
