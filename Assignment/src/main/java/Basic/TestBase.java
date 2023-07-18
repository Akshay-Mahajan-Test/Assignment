package Basic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	private static final String User_dir = null;
	public static WebDriver driver;
	
	@BeforeTest
	public WebDriver launch() throws IOException
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", User_dir+"\\Drivers\\chromedriver.exe");
		driver.get("URL");
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
}
