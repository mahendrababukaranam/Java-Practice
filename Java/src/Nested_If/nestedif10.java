package Nested_If;

public class nestedif10 {

	public static void main(String[] args) {
		 
		int marks=67;
		
		if(marks>=35 || marks<50) {
			System.out.println("Passed");
		}
		else if(marks>=50 || marks<65) {
			System.out.println("Got Second Class");
		}
		else if(marks>=65 || marks<90) {
			System.out.println("Got First Class");	
		}
		else if(marks>=90 || marks<=100) {
			System.out.println("Got Distinction");
		}
		else {
			System.out.println("Invalid Marks");
		}
			

	}

}
