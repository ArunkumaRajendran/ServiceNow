package ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrderingMobile extends Project_Specific_Method{
	
		@Test
		
		public void ordering_mobile() throws InterruptedException {
			
			
			
		
			dom.setImplicitWait(20);
		
			dom.findElementByXPath("//span[text()='Service Catalog']").click();
		
			WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		
			driver.switchTo().frame(frame);
		
			driver.findElement(By.xpath("//h2[contains(text(),'Mobile')]")).click();
		
			driver.findElement(By.xpath("//strong[contains(text(),'iPhone 13')]")).click();
		
			driver.findElement(By.xpath("//label[text()='No']")).click();
		
			WebElement drop = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		
			Select drp = new Select(drop);
		
			drp.selectByVisibleText("Unlimited");
		
			driver.findElement(By.xpath("//label[text()='Pink']")).click();
		
			driver.findElement(By.xpath("//label[contains(text(),'512')]")).click();
		
			driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
			String order_confirmation = driver.findElement(By.xpath("//span[@aria-live='assertive']")).getText();
		
			System.out.println(order_confirmation);		
		
			String request_id = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		
			System.out.println(request_id);
		
	}

}
