package week4.day1;

public class Radiobutton extends Button {
	
	public void selectRadiobutton() {
		System.out.println("Select Radio button");
	}

	public static void main(String[] args) {
   
		Radiobutton obj3 = new Radiobutton();
		obj3.submit();
		obj3.selectRadiobutton();
		obj3.setText("Radiobutton");


	}

}
