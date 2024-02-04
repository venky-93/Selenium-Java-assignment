package week2.day1;

//week2 day1 Assignment 2

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//setup driver and launch browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the screen
				driver.manage().window().maximize();
				//load  url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Find the element and enter username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//Find the element and enter password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Find the element and click login
				driver.findElement(By.className("decorativeSubmit")).click();
				//click on crmsfa
				driver.findElement(By.linkText("CRM/SFA")).click();
				//click on leads
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sneha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vaideswaran");
				
				
				
				
				
			//locating the dropdown element Source in return as a web element
					 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//Create obj for Select
				Select drop = new Select(source);
				//methods to pick specific option
			drop.selectByVisibleText("Employee");
				
				//locating the dropdown element Marketing Campaign in return as a web element
				WebElement findElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				//Create obj for Select
						Select drop1 = new Select(findElement);
						//methods to pick specific option
						drop1.selectByValue("9001");
								
						//locating the dropdown element Ownership in return as a web element
								WebElement findElement2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
								//Create obj for Select
										Select drop2 = new Select(findElement2);
										//methods to pick specific option
										drop2.selectByIndex(5);
										
										WebElement findElement3 = driver.findElement(By.name("generalCountryGeoId"));
										Select drop3 = new Select(findElement3);
										drop3.selectByVisibleText("India");
										
										//Click on Create Lead Button
										driver.findElement(By.name("submitButton")).click();
										
										//Verify title
										driver.findElement(By.linkText("Create Lead")).click();
									   String title = driver.getTitle();
										System.out.println(title);
										
										//close the browser
									//	driver.close();
				
			}

	}


