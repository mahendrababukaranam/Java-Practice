package Nested_If;

public class nestedif11 {

	public static void main(String[] args) {
		 
		int marks=67;
		
		if(marks>35) {
			System.out.println("Passed");
		}
		else if(marks>50) {
			System.out.println("Got Second Class");
		}
		else if(marks>65) {
			System.out.println("Got First Class");	
		}
		else if(marks>90) {
			System.out.println("Got Distinction");
		}
		else {
			System.out.println("Invalid Marks");
		}	

	}

}
