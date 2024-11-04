package Variables;

public class instance_example4 {
	
	//Instance Variables within a class
	// If we don't provide/initialize values to the variables by default jvm will take default values based on data type.
	String name;
	int id;
	double sal;
	boolean active;

	public static void main(String[] args) {
		instance_example4 ins = new instance_example4();
		System.out.println(ins.name);
		System.out.println(ins.id);
		System.out.println(ins.sal);
		System.out.println(ins.active);
		//System.out.println(instance_example4.name);//invalid->error(we cannot access the instance variables with class name

	}

}
