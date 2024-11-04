package CaseStudy;

public class SumOfThreeSubjectsEvenlyDividedByTotal {
	
	void TotalMarks( ) {
		int sub1=60;
		int sub2=80;
		int sub3=90;
		int Total=sub1+sub2+sub3;
		
		if(Total%sub1==0) {
			System.out.println(sub1+" is evenly diveded by Total");
		}
		else {
			System.out.println(sub1+" is evenly not diveded by Total");
		}
		
		if(Total%sub2==0) {
			System.out.println(sub2+" is evenly diveded by Total");
		}
		else {
			System.out.println(sub2+" is not evenly diveded by Total");
		}
		
		if(Total%sub3==0) {
			System.out.println(sub3+" is evenly diveded by Total");
		}
		else {
			System.out.println(sub3+" is not evenly diveded by Total");
		}
	
	}

	public static void main(String[] args) {
		SumOfThreeSubjectsEvenlyDividedByTotal T = new SumOfThreeSubjectsEvenlyDividedByTotal();
		T.TotalMarks();
		
		

	}

}



