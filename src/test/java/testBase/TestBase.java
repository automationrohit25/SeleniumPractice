package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	BrowserFactory bf = new BrowserFactory();
	
	@BeforeMethod
	public void LaunchApplication() {
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
	
	

}
