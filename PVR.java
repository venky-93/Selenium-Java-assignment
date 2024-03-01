package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.pvrcinemas.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
    driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
    WebElement findElement = driver.findElement(By.name("city"));
    Select drop1 = new Select(findElement);
    drop1.selectByValue("Chennai");
    WebElement findElement2 = driver.findElement(By.name("genre"));
    Select drop2 = new Select(findElement2);
    drop2.selectByVisibleText("ANIMATION");
    WebElement findElement3 = driver.findElement(By.name("lang"));
    Select drop3 = new Select(findElement3);
    drop3.selectByVisibleText("ENGLISH");
    driver.findElement(By.xpath("//button[text()='Apply']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
    driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
    WebElement findElement4 = driver.findElement(By.name("cinemaName"));
    Select drop4 = new Select (findElement4);
    drop4.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");
    driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
    driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted'][1]")).click();
    WebElement findElement5 = driver.findElement(By.name("timings"));
    Select drop5 = new Select(findElement5);
    drop5.selectByValue("09:00 AM - 12:00 PM");
    driver.findElement(By.name("noOfTickets")).sendKeys("2");
    driver.findElement(By.name("name")).sendKeys("Sneha Vaideswaran");
    driver.findElement(By.name("email")).sendKeys("snehavaideswaran@gmail.com");
    driver.findElement(By.name("mobile")).sendKeys("7200281485");
    WebElement findElement6 = driver.findElement(By.name("food"));
    Select drop6 = new Select(findElement6);
    drop6.selectByValue("No");
    driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Car Parking");
    driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
    driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
    driver.findElement(By.xpath("//button[text()='×']")).click();
    String title = driver.getTitle();
    System.out.println(title);
    
    
	}

}
