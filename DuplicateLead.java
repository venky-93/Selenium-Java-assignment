package week2.day1;

// week2 day1 Assignment 4

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sneha");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vaideswaran");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Venkatesh");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Cloud Tech Support Analyst");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("snehavaideswaran@gmail.com");
         driver.findElement(By.className("smallSubmit")).click();
         String title = driver.getTitle();
         System.out.println(title);
         driver.findElement(By.linkText("Duplicate Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).clear();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
         driver.findElement(By.id("createLeadForm_firstName")).clear();
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatesh");
         driver.findElement(By.className("smallSubmit")).click();
         String title2 = driver.getTitle();
         System.out.println(title2);
         
         
         
         
         
	}

}
