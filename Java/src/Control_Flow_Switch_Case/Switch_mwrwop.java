package Control_Flow_Switch_Case;

public class Switch_mwrwop {

	int p1() {
		
		int id=101;
		String name="Mahendra";
		String email="mahendra@yopmail.com";
		long mobile=8978687932L;

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		return id;
	}

	public static void main(String[] args) {
		Switch_mwrwop m1 = new Switch_mwrwop();
		int person = 1;
		switch (person) {
		case 1:
			m1.p1();
			break;
		case 2:
			m1.p1();
			break;
		default:
			System.out.println("Invalid Data");
			break;
		}
	}

}
