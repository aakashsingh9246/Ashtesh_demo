import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Ashtesh\\SELENIUM\\My Workspace\\GoIndigo\\bin\\locators.properties");
		prop.load(fis);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.goindigo.in/");
		
		driver.findElement(By.xpath(prop.getProperty("element"))).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
