package Control_Flow_IF_Statement;

public class Given_Number_Even_OR_Odd {
	int a=45;
	
	void value1() {
		if(a%2==0) {
			System.out.println(a+" is Even Number");
		}
		else {
			System.out.println(a+" is Odd Number");
		}
	}
	
	void value2() {
		if(a%5==0) {
			System.out.println(a+" is Even Number");
		}
		else {
			System.out.println(a+" is Odd Number");
		}
	}
	
	public static void main(String[] args) {
		Given_Number_Even_OR_Odd even_odd1=new Given_Number_Even_OR_Odd();
		even_odd1.value1();
		even_odd1.value2();
	}

}
