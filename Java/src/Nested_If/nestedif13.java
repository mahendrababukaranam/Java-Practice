package Nested_If;

public class nestedif13 {

	public static void main(String[] args) {
		 
		int marks=35;
		
		if(marks>=35) {
			System.out.println("Passed");
			if(marks>=50) {
				System.out.println("First nested Class");
			}
			System.out.println("First1 nested class");
		}
		if(marks>=65) {
			System.out.println("Second Class");
		}
		

	}

}
