import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class MouseMovetoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Actions abc=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		//driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[1]/span")).click();
		
	}

}
