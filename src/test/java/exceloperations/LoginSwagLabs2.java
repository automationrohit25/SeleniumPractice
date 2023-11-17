package exceloperations;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSwagLabs2 {

	ExcelUtility ex = new ExcelUtility();

	@Test
	public void login() throws EncryptedDocumentException, IOException {
		HashMap<String, String> testdata = ex.getTestDataInMap(1);
		System.out.println("Test data is " + testdata);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(testdata.get("Username"));
		driver.findElement(By.id("password")).sendKeys(testdata.get("Password"));
		driver.findElement(By.id("user-name")).sendKeys(Keys.F12);
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		driver.quit();

	}
	
	@Test
	public void login1() throws EncryptedDocumentException, IOException {
		HashMap<String, String> testdata = ex.getTestDataInMap(2);
		System.out.println("Test data is " + testdata);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(testdata.get("Username"));
		driver.findElement(By.id("password")).sendKeys(testdata.get("Password"));
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		driver.quit();

	}
	
	@Test
	public void login2() throws EncryptedDocumentException, IOException {
		HashMap<String, String> testdata = ex.getTestDataInMap(3);
		System.out.println("Test data is " + testdata);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(testdata.get("Username"));
		driver.findElement(By.id("password")).sendKeys(testdata.get("Password"));
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		driver.quit();

	}



}
