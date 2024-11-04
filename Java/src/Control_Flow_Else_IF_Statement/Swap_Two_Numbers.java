package Control_Flow_Else_IF_Statement;

public class Swap_Two_Numbers {
	
	public static void main(String[] args) {
		
		//By using Third variable
		int a=20;
		int b=30;
		int c;
		    c=a;
		    a=b;
		    b=c;
		//Without using third variable 
		int sa=25;
		int sb=45;
		    sa=sa+sb;//70
		    sb=sa-sb;//70-45=25
		    sa=sa-sb;//70-25=45
		
		System.out.println("With third variable");
		System.out.println(a+" "+b);
		System.out.println("Without third variable");
		System.out.println(sa+" "+sb);
		
	}

}
