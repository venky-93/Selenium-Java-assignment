package week4.day1;

public class Checkbox extends Button{

	public void clickCheckbutton() {
		System.out.println("Click Check button");
		
	}

	public static void main(String[] args) {
		Checkbox obj2 = new Checkbox();
		obj2.submit();
		obj2.click();
		obj2.setText("Checkbox");
		obj2.clickCheckbutton();

	}

}
