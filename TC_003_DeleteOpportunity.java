package marathon;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;




import org.testng.annotations.Test;

public class TC_003_DeleteOpportunity extends opportunitybase {
	
	@Test

	public  void deleteOpportunity() throws InterruptedException {
	
		
       System.out.println("Delete opportunity");
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Sneha V", Keys.ENTER);
		Thread.sleep(3000);
		WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class, 'rowActionsPlaceHolder')])[1]"));
		driver.executeScript("arguments[0].click();", virtualButton);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("(//button[contains(@class, 'uiButton forceActionButton')])[2]")).click();
		String opportunityName = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		if (opportunityName.contains(" was deleted.")) {

			System.out.println("Opportunity was deleted Successfully");

		} else {

			System.out.println("Opportunity was not deleted");
		}

	}



	}


