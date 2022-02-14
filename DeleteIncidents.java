package week5.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncidents extends BaseService {
	private By driver;

	@Test
	public void deleteIncident() {
		//clicking createnew  under incident:	
		//driver.findElement(By.xpath("//div[text()=\"Create New\"]")).click();
		
		//click on open
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		
		//now we need to switch to frames 
				driver.switchTo().frame("gsft_main");
		
		//sendKeys the incident no
		WebElement sendincno = driver.findElement((SearchContext) By.xpath("//input[@class='form-control']"));
		sendincno.sendKeys("INC0010046");
		sendincno.sendKeys(Keys.ENTER);
		
		//click on the incident no in the list
		//driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		//driver.findElement(By.xpath("//td[@class='vt']//a")).click();
			driver.findElement(By.xpath("//tbody[@class='list2_body']//td[@class='vt']/a")).click();
		
		//click the delete button
		driver.findElement((SearchContext) By.xpath("//button[text()='Delete']")).click();
		
		//click delete on the inspectable popup window
		driver.findElement(By.id("ok_button")).click();
		
		//getting the result
		WebElement deletedisplay = driver.findElement(By.xpath("//table[@id='incident_table']/tbody[1]/tr[1]/td[1]"));
		String notice = deletedisplay.getText();
		System.out.println(notice);
		
		//confirming 
		if(notice.equals("No records to display")) {
			System.out.println("Its confirm that the incident is deleted");
		}
		else {
			System.out.println("The incident is yet to delete");
		}
		
		
	}
}
		

