package Variables;

public class diff_instance_local {
	int id = 1212;
	String name = "Mahendra";
	void m1() {
		int a = 10;
		String company = "Exinent";
		
		System.out.println(id);//instance
		System.out.println(name);//instance
		System.out.println(a);
		System.out.println(company);
	}
	public static void main(String[] args) {
		diff_instance_local s1 = new diff_instance_local();
		s1.m1();
	}

}
