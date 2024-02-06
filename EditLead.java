package week2.day2;

//week2day2 Assignment2

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
     
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.linkText("Find Leads")).click();
         driver.findElement(By.linkText("10212")).click();
         String title = driver.getTitle();
         System.out.println(title);
         driver.findElement(By.linkText("Edit")).click();
         driver.findElement(By.className("inputBox")).clear();
         driver.findElement(By.className("inputBox")).sendKeys("TCS");
         driver.findElement(By.className("smallSubmit")).click();
        driver.close();
	}

}
