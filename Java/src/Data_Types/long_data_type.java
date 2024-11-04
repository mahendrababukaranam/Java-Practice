package Data_Types;

public class long_data_type {
	
	public static void main(String[] args) {
		
		//Range: -9223372036854775808 to 9223372036854775807
		
		//long a=92233720368;//The literal 92233720368 of type int is out of range 
		
		//long b=-92233720368;//The literal 92233720368 of type int is out of range 
		
		long a=92233720368L;//We must declare L
		
		long b=-92233720368L;//We must declare L
		
		long c=20;//byte
		
		long d=2222;//short
		
		long e=214748364;//int
		
		System.out.println("The value "+a+" is within the range between -9223372036854775808 to 9223372036854775807");
		
		System.out.println("The value "+b+" is within the range between -9223372036854775808 to 9223372036854775807");
		
		System.out.println("The value "+c+" is within the range between -9223372036854775808 to 9223372036854775807");
		
		System.out.println("The value "+d+" is within the range between -9223372036854775808 to 9223372036854775807");
		
		System.out.println("The value "+e+" is within the range between -9223372036854775808 to 9223372036854775807");
		
	}

}
