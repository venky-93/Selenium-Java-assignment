package marathon;



import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class TC_001_CreateOpportunity extends opportunitybase {
	@Test
	
	public void createOpportunity() {
	
		System.out.println("Create opportunity");
		driver.findElement(By.xpath("//div[contains(@class,'lvmForceActionsContainer')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sneha V");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String opportunityName = driver.findElement(By.xpath("//span[contains(@class, 'toastMessage')]")).getText();
		if (opportunityName.contains(" was created.")) {
			
			System.out.println("Opportunity Created Successfully");
			
		}
		else {
			
			System.out.println("Opportunity NotCreated");
		}
		
		
	}

}


