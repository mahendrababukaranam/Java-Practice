package Hierarchical_Inheritance3;

public class Student extends College {
	double fee;
	void setFee(double fee) {
		this.fee = fee;
	}
	double getFee() {
		return fee;
	}
	Student(){
		super(103, "Ramu-Student", "Chennai", 53990);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
