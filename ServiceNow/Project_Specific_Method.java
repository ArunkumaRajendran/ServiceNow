package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class Project_Specific_Method {

	public EdgeDriver driver;
	public Shadow dom;

	@BeforeMethod

	public void Launch_Browser() {

	    driver = new EdgeDriver();

		driver.get("https://dev139238.service-now.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2$zaCKizMV1-");

		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		dom = new Shadow(driver);
		
		dom.setImplicitWait(30);
		
		dom.findElementByXPath("//div[@aria-label='All']").click();	
	}

}
