package interviewJavaPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfTestNGannotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In beforeSuite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("In afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In afterTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In afterMethod");
	}

	@BeforeGroups(value = "sanity")
	public void beforeGroup() {
		System.out.println("In beforeGroup");
	}
	@AfterGroups(value = "sanity")
	public void afterGroup() {
		System.out.println("In afterGroup");
	}
	
	@Test
	public void simpleTestA() {
		System.out.println("In simpleTestA");
	}
	
	 @Test(groups = {"sanity"})
	 public void simpleGroupTest() {
	 System.out.println("in simpleGroupTest");
	
	 }
	 
	 @AfterSuite() 
		public void afterSuite() {
			System.out.println("In afterSuite");
		}

}
