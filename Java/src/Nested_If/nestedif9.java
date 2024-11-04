package Nested_If;

public class nestedif9 {

	public static void main(String[] args) {
		 
		int marks=67;
		
		if(marks>35) {
			System.out.println("Passed");
		}
		if(marks>50) {
			System.out.println("Got Second Class");
		}
		if(marks>65) {
			System.out.println("Got First Class");	
		}
		if(marks>90) {
			System.out.println("Got Distinction");
		}
		else {
			System.out.println("Invalid Marks");
		}
	//Syntax issue: multiple if condtions and one else		

	}

}
