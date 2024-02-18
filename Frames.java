package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick = 'myFunction()']")).click();
		Alert tryit = driver.switchTo().alert();
				String text = tryit.getText();
				System.out.println(text);
				tryit.accept();
				String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
	}

}
