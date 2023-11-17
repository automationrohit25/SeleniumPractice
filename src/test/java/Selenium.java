import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) {
	
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * Select select = new Select(driver.findElement(By.xpath("")));
		 * 
		 * List<WebElement> allCities = select.getOptions();
		 * 
		 * for(int i = 0; i < allCities.size(); i++) { String city =
		 * allCities.get(i).getText(); if(city.equalsIgnoreCase("Bangalore")) {
		 * System.out.println("Verified Bangalore is present"); } }
		 */
		
		int num =371;
		int num3 =371;
		int digit, num1, num2 = 0;
		
		while(num>0) {
			digit = num %10;
			num1 = digit * digit * digit;
			num2 = num2 + num1;
			num = num/10;
		}
		
		if(num2 == num3) {
			System.out.println("Armstrong");
		}
		
		
		

	}

}
