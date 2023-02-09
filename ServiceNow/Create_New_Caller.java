package ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Create_New_Caller extends Project_Specific_Method {
	
	@Test
	
	public  void create_new_caller() 
	
	{
		
		dom.setImplicitWait(20);
		
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Callers", Keys.ENTER);
	
		dom.findElementByXPath("//mark[text()='Callers']").click();
	
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
	
		driver.switchTo().frame(frame);
	
		driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
	
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Arun");
	
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Kumar");
	
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Testing");
	
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("arun@gmail.com");
	
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("987654321");
	
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("123456789");
	
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
	
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Arun",Keys.ENTER);
	
		String verification = driver.findElement(By.xpath("//td[text()='Arun']")).getText();
	
		System.out.println(verification);
}
}
