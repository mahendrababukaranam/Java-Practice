package JNTUK_Details;

public class Pace_College_Students_Details {

	void Ramesh() {
		int id=3001;
		String name="Ramesh";
		String gender="Male";
		String college="Rice College";
		String email="ramesh@yopmail.com";
		float percentage=67f;
		long mobile=9988776655l;
		
		//Printing the declared values  with multiple print statements
		/*
		 * System.out.println(name+" details:");
		 * System.out.println("ID is            : "+id);
		 * System.out.println("Name is          : "+name);
		 * System.out.println("Gender is        : "+gender);
		 * System.out.println("College Name is  : "+college);
		 * System.out.println("Email is         : "+email);
		 * System.out.println("Email is         : "+name);
		 * System.out.println("Percentage is    : "+percentage);
		 * System.out.println("Mobile Number is : "+mobile);
		 * System.out.println("------------------------------------");
		 */
		
		//Printing the declared values  with single print statement
		System.out.println("Name is : "+name+" "+"ID is : "+id+
			    " "+"Gender is : "+gender+" "+"College name is : "+college+
				" "+"Name is : "+name+" "+"Email is : "+email+
				" "+" is : "+email+" "+"Percentage is : "+percentage+
				" "+"Mobile Number is : "+mobile);
	}
	
	void Madhuri() {
		int id=3002;
		String name="Madhuri";
		String gender="Female";
		String college="Pace College";
		String email="madhuri@yopmail.com";
		float percentage=90f;
		long mobile=7788996655l;
		
		//Printing the declared values with multiple print statements
		/*
		 * System.out.println(name+" details:");
		 * System.out.println("ID is            : "+id);
		 * System.out.println("Name is          : "+name);
		 * System.out.println("Gender is        : "+gender);
		 * System.out.println("College Name is  : "+college);
		 * System.out.println("Email is         : "+email);
		 * System.out.println("Percentage is    : "+percentage);
		 * System.out.println("Mobile Number is : "+mobile);
		 */		
		//Printing the declared values  with single print statement
		System.out.println("Name is : "+name+" "+"ID is : "+id+
				" "+"Gender is : "+gender+" "+"College name is : "+college+						" "+"Name is : "+name+" "+"Email is : "+email+
				" "+" is : "+email+" "+"Percentage is : "+percentage+
				" "+"Mobile Number is : "+mobile);
	}
	
	public static void main(String[] args) {
		Pace_College_Students_Details Qis_Details=new Pace_College_Students_Details();
		Qis_Details.Ramesh();
		Qis_Details.Madhuri();
	}
	
	
}

