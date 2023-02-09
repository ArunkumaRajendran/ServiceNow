package ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Fill_Mandatory_Fields extends Project_Specific_Method {
	
	@Test
	
		public void fill_mandatory_fields() throws InterruptedException {
		
		dom.setImplicitWait(30);
		
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge", Keys.ENTER);
		
		dom.findElementByXPath("//mark[@class='filter-match']").click();
		
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT",Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("Java", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("I like to learn Java Selenium", Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='form_action_button header  action_context btn btn-default']")).click();
		
	}
}
