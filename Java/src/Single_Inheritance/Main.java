package Single_Inheritance;

public class Main {

	public static void main(String[] args) {
		Teacher T = new Teacher();
		T.setId(100);
		T.setName("Mahendra");
		T.setSal(50000);
		System.out.println("Teacher Class Data");
		System.out.println(T.getId());
		System.out.println(T.getName());
		System.out.println(T.getSal());
		
		
		Student S = new Student();
		S.setId(101);
		S.setName("Mahendra");
		S.setMarks(506);
		System.out.println("Student Class Data");
		System.out.println(S.getId());
		System.out.println(S.getName());
		System.out.println(S.getMarks());

	}

}
