package exceloperations;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSwagLabs {

	ExcelUtility ex = new ExcelUtility();

	@Test(dataProvider = "getData")
	public void login(Object obj1) {
		HashMap<String, String> testdata = (HashMap<String, String>) obj1;
		System.out.println("Test data is " + testdata);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys(testdata.get("Username"));
		driver.findElement(By.id("password")).sendKeys(testdata.get("Password"));
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		driver.quit();

	}

	@DataProvider(name = "getData")
	public Object[][] testDataSupplier() throws EncryptedDocumentException, IOException {

		Object[][] obj = new Object[ex.getRowCount()][1];
		for (int i = 1; i <= ex.getRowCount(); i++) {
			HashMap<String, String> testData = ex.getTestDataInMap(i);
			obj[i - 1][0] = testData;
		}
		return obj;

	}

}

