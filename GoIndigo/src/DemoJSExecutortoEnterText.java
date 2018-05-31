//import newpackage.String;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoJSExecutortoEnterText {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		String URL="https://www.google.com/";
		driver.get(URL);
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
		WebElement elements=driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		
		//ele.sendKeys("India");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='India'",ele);
		Thread.sleep(5000L);
		//js.executeScript("window.document.getElementByName('btnK').click()");
		//js.exe
	
	/*	WebElement ele=driver.findElement(By.xpath(".//*[@id='link']/div/ul/li[3]/a"));
		WebElement textbox=driver.findElement(By.xpath(".//*[@id='container']/div[1]/table/tbody/tr[2]/td/div[2]/form/input[1]"));
		//ele.sendKeys("India");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Hello'",textbox);
		//js.executeScript("arguments[0].click();", ele);
*/
		
		
	}

}
