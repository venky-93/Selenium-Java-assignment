package week4.day1;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Submit the result");
	}

	public static void main(String[] args) {
		Button obj = new Button();
		obj.click();
		obj.setText("Button");
	}

}
