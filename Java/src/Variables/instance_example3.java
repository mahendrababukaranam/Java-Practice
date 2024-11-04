package Variables;

public class instance_example3 {
	
	//Instance Variables within a class
	// we can assign access modifiers to the instance variables
	public String name = "Mahendra";
	private String city = "Hyderabad";
	protected long mn = 8978687932L;

	public static void main(String[] args) {
		instance_example3 ins = new instance_example3();
		System.out.println(ins.name);
		System.out.println(ins.city);
		System.out.println(ins.mn);

	}

}
