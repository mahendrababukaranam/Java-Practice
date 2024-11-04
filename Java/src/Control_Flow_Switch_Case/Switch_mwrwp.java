package Control_Flow_Switch_Case;

public class Switch_mwrwp {

	int p1(int id, String name, String email, long mobile) {

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		return id;
	}

	public static void main(String[] args) {
		Switch_mwrwp m1 = new Switch_mwrwp();
		int person = 2;
		switch (person) {
		case 1:
			System.out.println(m1.p1(101, "Mahendra", "mahendra@yopmail.com", 8978687832L));
			break;
		case 2:
			System.out.println(m1.p1(102, "Ravindra", "ravindra@yopmail.com", 77909886655L)); ;
			break;
		default:
			System.out.println("Invalid Data");
			break;
		}
	}

}
