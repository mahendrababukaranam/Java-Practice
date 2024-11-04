package Control_Flow_IF_Statement;

public class Greatest_of_Two_Numbers2 {
	int a=10;
	int b=20;
	
	//Method
	void if_statement1() {
		
	    if(a<b) {    	
		    System.out.println(a+" is less than "+b);
	    }
	    else {
		    System.out.println(b+" is greater than "+a);
	    }
	 
	}
	
	//method
	void if_statement2() {
		if(a>b) {    	
		    System.out.println(a+" is less than "+b);
	    }
	    else {
		    System.out.println(b+" is greater than "+a);
	    }
	}
	
	public static void main(String[] args) {
		Greatest_of_Two_Numbers2 ifstmt=new Greatest_of_Two_Numbers2();
		ifstmt.if_statement1();
		ifstmt.if_statement2();
	}
}
