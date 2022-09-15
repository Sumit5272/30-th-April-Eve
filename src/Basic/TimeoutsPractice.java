package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TimeoutsPractice {

		@BeforeClass
		public void launchBrowser() {
			System.out.println("Browser is launched.");
		}
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("Browser is closed");
		}
		
		@BeforeMethod
		public void login() {
			System.out.println("Logged in to the application sucessfully");
		}
		
		@AfterMethod
		public void logout() {
			System.out.println("Logged out from the application sucessfully");
		}
		
		@Test (priority=1,timeOut=5000)
		public void homePageTest() throws InterruptedException {
			Thread.sleep(6000);
			System.out.println("Home page tested sucessfully");
		}

		@Test (priority=2)
		public void profilePageTest() {
			System.out.println("Profile page tested sucessfully");
		}
	

}
