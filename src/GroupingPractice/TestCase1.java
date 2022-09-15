package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeSuite (alwaysRun=true)
	public void configureServer() {
		System.out.println("Configure the server");
	}

	@AfterSuite (alwaysRun=true)
	public void closeServer() {
		System.out.println("Close the server");
	}
	
	@BeforeTest (alwaysRun=true)
	public void openDB() {
		System.out.println("Database is open");
	}
	
	@AfterTest (alwaysRun=true)
	public void closeDB() {
		System.out.println("Database is close");
	}
	
	
	@BeforeClass (alwaysRun=true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass (alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "Smoke")
	public void Test1() {
		System.out.println("Running method test1");
	}
	
	@Test(groups = "Functional")
	public void Test2() {
		System.out.println("Running method test2");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test3() {
		System.out.println("Running method test3");
	}

	
	
}
