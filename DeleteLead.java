package week2.day2;

// Week2 Day2 Assignment 2

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8446591558");
		driver.findElement(By.linkText("Find Leads")).click();
        WebElement source = driver.findElement(By.linkText("10225"));
        source.getText();
        System.out.println(source.getText());
        source.click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.id("ext-gen246")).sendKeys("10225");
        driver.findElement(By.linkText("Find Leads")).click();
        WebElement source1 = driver.findElement(By.xpath("//div[text()='No records to display']"));
       String text = source1.getText();
        
        if(text.contains("No records to display"))
        {
        	System.out.println("Successful deletion");
        }
        else
        {
        	System.out.println("Not deleted");
        }
		System.out.println(text);
	
		}



	}


