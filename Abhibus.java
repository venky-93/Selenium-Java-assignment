package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.linkText("Tomorrow")).click();
	    String text = driver.findElement(By.xpath("//h5[text()='Parveen Travels']")).getText();
	    System.out.println(text);
	    driver.findElement(By.linkText("Sleeper")).click();
		String text2 = driver.findElement((By.xpath("(//div[@class='text-grey']/small)[1]"))).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		driver.findElement(By.xpath("//div[@class='label']/p")).click();
		driver.findElement(By.xpath("//div[@class='label']/p[1]")).click();
		String text3 = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		System.out.println(text3);
		String text4 = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		System.out.println(text4);
	String title = driver.getTitle();
	System.out.println(title);
		
	}

}
