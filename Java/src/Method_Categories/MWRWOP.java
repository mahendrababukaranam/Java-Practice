package Method_Categories;

public class MWRWOP {
	//Note: If we want to print return value definitely we have to use print statement.
	//Method with Returntype and Method without parameters.
	
	int sum() {
		int a=10;
		int b=22;
		return a;
		//Output: We will get empty console because we didn't print the value.
	}
	
	int sum1() {
		int x=88;
		int y=66;
		return y;
		//Output: We will get Y value 66 because we have return y value and printed the y value.
	}
	
	String sum2() {
		int val1=23;
		int val2=57;
		String name="Mahendra Babu K";
		int sum=val1+val2;
		return name;
		//System.out.println("The sum of value1 and Value2 is : "+sum);//Unreachable code
		//Because we have printed the value after return statement, before return statement only we have to print anything.
	}
	
	String sum3() {
		int val3=23;
		int val4=57;
		String name="Mahendra Babu K";
		int sum=val3+val4;
		System.out.println("The sum of value1 and Value2 is : "+sum);
		return name;
	}
	
	public static void main(String[] args) {
		MWRWOP s=new MWRWOP();
		s.sum();
		System.out.println("The return value of sum1 method is : "+s.sum1());
		s.sum2();	
		System.out.println("The return name of sum3 method is: "+s.sum3());
	}

}
