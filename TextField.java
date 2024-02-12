package week4.day1;

public class TextField extends WebElement{

	public void getText() {
     
		System.out.println("Get the letters");
	}

	public static void main(String[] args) {

     TextField obj1 = new TextField();
     obj1.click();
     obj1.getText();
     obj1.setText("TextField");

	}

}
