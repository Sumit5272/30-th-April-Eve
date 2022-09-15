package AnotationsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4 {
	@BeforeClass
    public void openBrowser() {
    	System.out.println("Browser is open");
    }
	@AfterClass
    public void closeBrowser() {
    	System.out.println("Browser is close");
    }
	@Test
	public void m4() {
		System.out.println("This is method m4");
	}
	@Test
	public void m5() {
		System.out.println("This is method m5");
	}
	@Test
	public void m6() {
		System.out.println("This is method m6");
	}
}
