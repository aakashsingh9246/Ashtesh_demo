import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetWindowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

}
