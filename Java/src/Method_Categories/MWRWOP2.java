package Method_Categories;

public class MWRWOP2 {
	
	String sum() {
		int val3=23;
		int val4=57;
		String name="Mahendra Babu K";
		int sum=val3+val4;
		System.out.println("The sum of value1 and Value2 is : "+sum);
		//return name+val3;//Type mismatch: cannot convert from String to int
		//return name;
		return name+val3;
	}
	
	public static void main(String[] args) {
		MWRWOP2 s=new MWRWOP2();
		System.out.println("The return value of sum1 method is string + integer : "+s.sum());
	}

}
