import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//Login Test new file in Maven
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
	}
	@Test
	public void doLogin()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("lalita.asm");
		driver.findElement(By.id("pass")).sendKeys("lalita.asm");
	}
}
