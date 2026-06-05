package assignment_day5;
abstract class Bank{
	abstract double getInterestRate();
	
}
class SBI extends Bank{
	double getInterestRate(){
		return 6.5;
	}
}
class PNB extends Bank{
	double getInterestRate() {
		return 7.2;
	}
}
class HDFC extends Bank{
	double getInterestRate() {
		return 7.8;
	}
}


public class Problem2 {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		PNB pnb = new PNB();
		HDFC hdfc = new HDFC();
		System.out.println("The Interest rate of SBI Bank is: "+sbi.getInterestRate());
		System.out.println("The Interest rate of PNB Bank is: "+pnb.getInterestRate());
		System.out.println("The Interest rate of HDFC Bank is: "+hdfc.getInterestRate());

	}

}
