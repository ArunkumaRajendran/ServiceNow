package ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Create_New_Proposal extends Project_Specific_Method{
	
	@Test
	
		public void create_new_proposal() throws InterruptedException {
		
		
		
		dom.setImplicitWait(20);
		
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Proposal", Keys.ENTER);
		
		dom.findElementByXPath("//mark[@class='filter-match']").click();
		
		Thread.sleep(3000);
		
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Change phone");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		
		Thread.sleep(3000);
		  
		String proposal_id = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).getText();
		  
		System.out.println("Proposal ID:"+proposal_id);
		 
}

}