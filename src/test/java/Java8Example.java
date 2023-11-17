import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Java8Example {

	public static void main(String[] args) {
		
//		
//		 List<Object> myList = new ArrayList<Object>();
//		    
//		    myList.add("Rohit");
//		    myList.add("Delhi");
//		    myList.add("30");
		     
		/*
		 * HashMap<Integer,Object> firstObject = new HashMap<Integer,Object>();
		 * firstObject.put(5,"Rohit"); firstObject.put(5,"Delhi");
		 * firstObject.put(5,"30");
		 */
		    
//		    System.out.println(firstObject.get(5));
		    
//		    Map.Entry<Object, Object> mapentry = firstObject.keySet();
		    
//		    String str = "tommorrow";
//		    
//		    char c = str.charAt(4);
//		    System.out.println(c);
//		    
//		    String str2 = str.replace(str.charAt(4), '$');
//		    System.out.println(str2);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> currentPriceList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		ArrayList<Double> priceList = new ArrayList<>();
		
		for(int i = 1; i <= currentPriceList.size(); i++) {
			
//			Double num = Double.parseDouble(currentPriceList.get(i).getText());
			String text = currentPriceList.get(i).getText();
			String text1 = text.replace(",","");
			Double num = Double.parseDouble(text1);
			priceList.add(num);
		
		}
		
		
		Collections.sort(priceList, Collections.reverseOrder());
		System.out.println(priceList.get(1));
		Double secondHighestnum = priceList.get(1);
		
		for (int i = 1; i <= currentPriceList.size(); i++) {
			String text = currentPriceList.get(i).getText();
			String text1 = text.replace(",","");
			Double secnum = Double.parseDouble(text1);
			if(secnum.equals(secondHighestnum)) {
				//table[@class='dataTable']/tbody/tr/td[4]/parent::tr/td/a
				String beforeXpath = "(//table[@class='dataTable']/tbody/tr/td[4])[";
				String afterXpath = "]/parent::tr/td/a";
				String finalXpath = beforeXpath + (i+1) + afterXpath;
				System.out.println(finalXpath);
				String companyName = driver.findElement(By.xpath(finalXpath)).getText();
				System.out.println("Company Name is " + companyName);
				break;
			}
			
		}
		
		System.out.println("completed");
		
		    
		    

	}

}
