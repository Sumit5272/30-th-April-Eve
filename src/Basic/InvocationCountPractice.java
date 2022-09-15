package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("logged in the system");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("logged out from the system");
	}
	
    @Test(invocationCount=2)
	public void HomePageTesting() {
		System.out.println("home page tested successfully");
	}
    
    @Test(invocationCount=3)
    public void ProfilePageTesting() {
    	System.out.println("profile page tested successfully");
    }
}
