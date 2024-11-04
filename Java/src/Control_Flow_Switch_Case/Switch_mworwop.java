package Control_Flow_Switch_Case;

public class Switch_mworwop {

	void p1() {
		int id = 101;
		String name = "Mahendra";
		String email = "mahendra@yopmail.com";
		long mobile = 8978687932L;
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
	}

	void p2() {
		int id = 102;
		String name = "Ravindra";
		String email = "ravindra@yopmail.com";
		long mobile = 9988776655L;
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
	}

	public static void main(String[] args) {
		Switch_mworwop m1 = new Switch_mworwop();
		int person = 1;
		switch (person) {
		case 1:
			m1.p1();
			m1.p2();
			break;
		case 2:
			m1.p2();
			break;
		default:
			System.out.println("Invalid Data");
			break;
		}
	}

}
