package week4.day1;

//week 4 day 1 Assignment 6

public class Bankinfo extends AxisBank {

	public void saving() {
		System.out.println("Saving account is");
	}
	
	public void fixed() {
		System.out.println("Fixed account is");
	}
	
	public void deposit() {
		System.out.println("Deposit account");
	}
	public static void main(String[] args) {
		Bankinfo obj = new Bankinfo();
		obj.deposit();
		

	}

}
