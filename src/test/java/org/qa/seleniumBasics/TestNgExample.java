package org.qa.seleniumBasics;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgExample {
	
	@Test
	public void solution() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		By cookies_accept = By.xpath("//button[contains(text(),'Accept all cookies')]");
	    
	    WebDriverWait wait = new WebDriverWait(driver,);
	    wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
	    
	    By question_section = By.xpath("//a[@role='menuitem']");
	    wait.until(ExpectedConditions.elementToBeClickable(question_section)).click();
	    
	    By tags = By.xpath("//div[contains(text(),'Tags')]");
	    wait.until(ExpectedConditions.elementToBeClickable(tags)).click();
	    
	    By new_link = By.xpath("//a[contains(text(),'New')]");
	    wait.until(ExpectedConditions.elementToBeClickable(new_link)).click();
	    
//	    Get the total questions values
	    List<WebElement> totalquestions = driver.findElements(By.xpath("//div[@class='grid-layout']/div[2 or 3]/div/div[1][contains(text(),'question')]"));
	    int count = totalquestions.size();
	   	    
	    Set<String> st = new HashSet<>();
	    for(int i = 0; i < totalquestions.size(); i++) {
	    	String questiontext = totalquestions.get(i).getText();
	    	String[] words = questiontext.split(" ");
	    	st.add(words[0]);	
	    }
	   
	    String maxcount = Collections.max(st);
	    
	    String prexpath = "//div[@class='grid-layout']/div[2 or 3]/div/div[1][@class='flex--item'][contains(text(),'";
	    String postxpath = " question')]/../preceding-sibling::div/div";
	    
//	   By tagelement = By.xpath("//div[@class='grid-layout']/div[2 or 3]/div/div[1][@class='flex--item'][contains(text(),'1 question')]/../preceding-sibling::div/div");
	  
	   By dynamicxpath = By.xpath(prexpath + maxcount + postxpath);
	   
	   List<WebElement> tagelements = driver.findElements(dynamicxpath);
	   
	  for(int i =0; i < tagelements.size(); i++) {
		     String tagText =  tagelements.get(i).getText();
		     System.out.println("Tag Name:- " + tagText + " QuestionsCount:- " + maxcount);
	  }
	    
	   driver.close();
	    	
	}

}
