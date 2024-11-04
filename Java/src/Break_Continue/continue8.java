package Break_Continue;

public class continue8 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==8 && i!=5) {
				System.out.println(i);
				continue;
			}
			
			System.out.println(i);
		}

	}

}
