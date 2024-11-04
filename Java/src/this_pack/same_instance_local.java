package this_pack;

public class same_instance_local {
	int a = 121;
	
	void m1() {
		int a = 1212;
		System.out.println(a);//1212
		System.out.println(a);//1212
	}
	public static void main(String[] args) {
		same_instance_local s1 = new same_instance_local();
		s1.m1();
	}

}
