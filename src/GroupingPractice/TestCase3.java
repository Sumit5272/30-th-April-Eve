package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

	@BeforeClass (alwaysRun=true)
	public void launchBrowser() {
		System.out.println("Browser is launched");
	}
	
	@AfterClass (alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test(groups = "Smoke")
	public void Test7() {
		System.out.println("Running method test7");
	}
	
	@Test(groups = "Functional")
	public void Test8() {
		System.out.println("Running method test8");
	}
	
	@Test(groups = {"Functional","Regression"})
	public void Test9() {
		System.out.println("Running method test9");
	}
}
