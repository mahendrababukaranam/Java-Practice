package JNTUK_Details;

public class Rice_College_Students_Details {

	void Venkatesh() {
		int id=2001;
		String name="Venkatesh";
		String gender="Male";
		String college="Rice College";
		String email="venkatesh@yopmail.com";
		float percentage=85f;
		long mobile=8978687868l;
		
		//Printing the declared values  with multiple print statements
		/*
		 * System.out.println(name+" details:");
		 * System.out.println("ID is            : "+id);
		 * System.out.println("Name is          : "+name);
		 * System.out.println("Gender is        : "+gender);
		 * System.out.println("College Name is  : "+college);
		 * System.out.println("Email is         : "+email);
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
	
	void Ramya() {
		int id=2002;
		String name="Ramya";
		String gender="Female";
		String college="Rice College";
		String email="ramya@yopmail.com";
		float percentage=70f;
		long mobile=9978687866l;
		
		//Printing the declared values with multiple print statements
		/*
		System.out.println(name+" details:");
		System.out.println("ID is            : "+id);
		System.out.println("Name is          : "+name);
		System.out.println("Gender is        : "+gender);
		System.out.println("College Name is  : "+college);
		System.out.println("Email is         : "+email);
		System.out.println("Percentage is    : "+percentage);
		System.out.println("Mobile Number is : "+mobile);*/
	
		//Printing the declared values  with single print statement
		System.out.println("Name is : "+name+" "+"ID is : "+id+
				" "+"Gender is : "+gender+" "+"College name is : "+college+
				" "+"Name is : "+name+" "+"Email is : "+email+
				" "+" is : "+email+" "+"Percentage is : "+percentage+
				" "+"Mobile Number is : "+mobile);
		
	}
	
	public static void main(String[] args) {
		Rice_College_Students_Details Qis_Details=new Rice_College_Students_Details();
		Qis_Details.Venkatesh();
		Qis_Details.Ramya();
	}
	
	
}

