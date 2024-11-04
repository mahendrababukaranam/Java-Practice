package JNTUK_Details;

public class Qis_College_Students_Details {

	public void Mahendra() {
		int id=1111;
		String name="Mahendra";
		String gender="Male";
		String college="Qis College";
		String email="mahendra@yopmail.com";
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
	
	public void Siri() {
		int id=1112;
		String name="Siri";
		String gender="Female";
		String college="Qis College";
		String email="siri@yopmail.com";
		float percentage=85f;
		long mobile=9978687866l;
		
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
				" "+"Gender is : "+gender+" "+"College name is : "+college+
				" "+"Name is : "+name+" "+"Email is : "+email+
				" "+" is : "+email+" "+"Percentage is : "+percentage+
				" "+"Mobile Number is : "+mobile);
	}
	
	public static void main(String[] args) {
		Qis_College_Students_Details Qis_Details=new Qis_College_Students_Details();
		Qis_Details.Mahendra();
		Qis_Details.Siri();
	}
	
	
}

