
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


public class LOVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		//From Location
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul/li[1]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul/li[1]/div/ul/li[18]/a")).click();
		
		//To Location
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul/li[2]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul/li[2]/div/ul/li[11]/a")).click();
		
		//Number of Tickets
		driver.findElement(By.xpath("//input[@class='count travellers-count']")).click();
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul/li[3]/div/div[1]/label[2]/select")).click();
		
		//Select Date
		driver.findElement(By.xpath(".//*[@id='depart-date']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
	}

}
