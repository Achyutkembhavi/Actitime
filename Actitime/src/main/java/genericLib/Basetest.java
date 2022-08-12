package genericLib;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest
{
	public WebDriver driver;
    @BeforeClass
	    public void browserlaunch() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser is launched successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Window is maxmized successfully");	
	}
	
	@AfterClass
	public void closeapp() {
		driver.close();
	}	
}
