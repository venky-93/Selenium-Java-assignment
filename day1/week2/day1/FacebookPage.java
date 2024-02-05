package seleniumSample;

//week2 day2 Assignment 3

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	public static void main(String[] args) {
		//setup driver and launch browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the screen
				driver.manage().window().maximize();
				//load  url
				driver.get("https://www.facebook.com/");
				
				//Find the element and click login
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.linkText("Create new account")).click();
				driver.findElement(By.name("firstname")).sendKeys("Sneha");
				driver.findElement(By.name("lastname")).sendKeys("Vaideswaran");
				driver.findElement(By.name("reg_email__")).sendKeys("8446591558");
				driver.findElement(By.name("reg_passwd__")).sendKeys("Haasini@22");
				driver.findElement(By.xpath("//input[@type='radio']")).click();
			
				WebElement findElement = driver.findElement(By.id("day"));
				Select drop = new Select(findElement);
				drop.selectByValue("18");
				
				WebElement findElement1 = driver.findElement(By.id("month"));
				Select drop1 = new Select(findElement1);
				drop1.selectByVisibleText("Aug");
				
				WebElement findElement2 = driver.findElement(By.id("year"));
				Select drop2 = new Select(findElement2);
				drop2.selectByValue("1997");
				
				
			//	String title = driver.getTitle();
			//	System.out.println(title);
	}

	

}
