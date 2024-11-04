package CaseStudy;

public class SumOfThreeSubjectsWRWP {
	
	int TotalMarks(int Maths, int Sanskrit, int Physics ) {
		//System.out.println("Maths Marks are : "+Maths);
		//System.out.println("Sanskrit Marks are : "+Sanskrit);
		//System.out.println("Physics Marks are : "+Physics);
		
		return Maths+Sanskrit+Physics;
	}

	public static void main(String[] args) {
		
		SumOfThreeSubjectsWRWP Marks = new SumOfThreeSubjectsWRWP();
		System.out.println("The total Marks are : "+Marks.TotalMarks(87, 98, 95));

	}

}



