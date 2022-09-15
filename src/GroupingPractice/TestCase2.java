package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

	@BeforeClass (alwaysRun=true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass (alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "Smoke")
	public void Test4() {
		System.out.println("Running method test4");
	}
	
	@Test(groups = "Functional")
	public void Test5() {
		System.out.println("Running method test5");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test6() {
		System.out.println("Running method test6");
	}
}
