import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoJSExecuotr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		String URL="file:///C:/Users/Ashtesh.Divakar/Desktop/TestPage.html";
		driver.get(URL);
		
		WebElement ele=driver.findElement(By.xpath("html/body/form/input"));
		ele.sendKeys("Testing");
		//JavascriptExecutor js2=(JavascriptExecutor)driver;
		//js2.executeScript("arguments[0].value='Testing'", ele);
		
		//js2.executeScript("arguments[0].value='Testing'", ele);
		
		
		
		
		
		
		

	}

}
