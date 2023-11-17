package testBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
//	private constructor so that no one  else can create the object.
	private DriverFactory() {
		
	}
	
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
//	Factory design pattern : design separate factory method for creating objects
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void setDriver(WebDriver driverParam) {
		driver.set(driverParam);
	}
	
	public void closeBrowser() {
		driver.get().close();
		driver.remove();
	}

}
