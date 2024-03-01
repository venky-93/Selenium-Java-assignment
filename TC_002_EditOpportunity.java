package marathon;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_002_EditOpportunity extends opportunitybase {
	
	@Test
	
	public  void editOpportunity() throws InterruptedException {
		
		System.out.println("Edit Opportunity");
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Sneha V", Keys.ENTER);
		Thread.sleep(3000);
		WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class, 'rowActionsPlaceHolder')])[1]"));
		driver.executeScript("arguments[0].click();", virtualButton);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		WebElement nextDate = driver.findElement(By.xpath("(//td[@class='slds-is-today slds-is-selected']//following::span)[1]"));
//		driver.executeScript("arguments[0].click();", nextDate);
		nextDate.click();
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		WebElement deliveryInstall = driver
				.findElement(By.xpath("(//label[contains(text(),'Delivery')]/following::span)[1]"));
		driver.executeScript("arguments[0].click();", deliveryInstall);
		driver.findElement(By.xpath("//span[@title='In progress']")).click();
		WebElement description = driver.findElement(By.xpath("//div[contains(@class, 'textarea-container')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(description).sendKeys("Salesforce").perform();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String opportunityName = driver.findElement(By.xpath("//span[contains(@class, 'toastMessage')]")).getText();
		if (opportunityName.contains(" was saved.")) {

			System.out.println("Opportunity was updated Successfully");

		} else {

			System.out.println("Opportunity was not updated");
		}

		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce automation",
				Keys.ENTER);
		String stageUpdate = driver.findElement(By.xpath("(//span[contains(@class, 'forceInlineEditCell')])[4]"))
				.getText();
		if (stageUpdate.contains("Perception Analysis")) {

			System.out.println("Stage was updated Successfully");

		} else {

			System.out.println("Stage was not updated");
		}
	}

}


