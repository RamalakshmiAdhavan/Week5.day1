package Week5day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import java.time.Duration;

	public class createlead extends BaseClass
	{
		
		@Test
		public void createLead() {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramalakshmi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Adhavan");
			driver.findElement(By.name("submitButton")).click();
			
	}
	

	}


