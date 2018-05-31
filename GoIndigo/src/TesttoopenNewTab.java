import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TesttoopenNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://myworld.relianceada.com/");
		driver.findElement(By.xpath(".//*[@id='wrapper']/header/div[2]/div/nav/ul/li[4]/a/span[1]/img")).click();
		Thread.sleep(5000L);
		driver.switchTo().window("R-DIAL");
		
		driver.findElement(By.xpath(".//*[@id='fldName']")).sendKeys("Ashtesh");
		/*driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click(); 
		//driver.get("https://www.amazon.in/Samsung-Galaxy-Prime-Gold-16GB/dp/B01LY4V6IM/ref=sr_1_1?s=electronics&ie=UTF8&qid=1510982507&sr=1-1&keywords=samsung+mobile");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[2]/a")).click();
		driver.switchTo().window("Samsung On7 Pro Price: Buy Samsung On7 Pro Gold Online at Best Price in India- Amazon.in");*/
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath(".//*[@id='nav-logo']/a[1]/span[1]")).click();
		
	}

}
