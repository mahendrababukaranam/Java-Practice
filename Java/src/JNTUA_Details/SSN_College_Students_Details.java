package JNTUA_Details;

public class SSN_College_Students_Details {

	void Rama() {
		int id=82001;
		String name="Rama";
		String gender="Female";
		String college="SSN College";
		String email="rama@yopmail.com";
		float percentage=85f;
		long mobile=8978687868l;
		
		//Printing the declared values  with multiple print statements
		System.out.println(name+" details:");
		System.out.println("ID is            : "+id);
		System.out.println("Name is          : "+name);
		System.out.println("Gender is        : "+gender);
		System.out.println("College Name is  : "+college);
		System.out.println("Email is         : "+email);
		System.out.println("Email is         : "+name);
		System.out.println("Percentage is    : "+percentage);
		System.out.println("Mobile Number is : "+mobile);
		System.out.println("------------------------------------");
	}
	
	void Ramya() {
		int id=82002;
		String name="Ramya";
		String gender="Female";
		String college="SSN College";
		String email="ramya@yopmail.com";
		float percentage=70f;
		long mobile=9978687866l;
		
		//Printing the declared values with multiple print statements
		System.out.println(name+" details:");
		System.out.println("ID is            : "+id);
		System.out.println("Name is          : "+name);
		System.out.println("Gender is        : "+gender);
		System.out.println("College Name is  : "+college);
		System.out.println("Email is         : "+email);
		System.out.println("Email is         : "+name);
		System.out.println("Percentage is    : "+percentage);
		System.out.println("Mobile Number is : "+mobile);
	}
	
	public static void main(String[] args) {
		SSN_College_Students_Details Qis_Details=new SSN_College_Students_Details();
		Qis_Details.Rama();
		Qis_Details.Ramya();
	}
	
	
}

