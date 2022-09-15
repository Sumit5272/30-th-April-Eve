package Basic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnotationsPractice {

	//scenario
	//Login==>HomePageCheck==>Logout
	//Login==>NotificationPageCheck==>Logout
	//Login==>Profilepage Check==>Logout
	@BeforeMethod
	public void Login() {
		System.out.println("Login to the application");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout from the application");
	}
	
	@Test
	public void HomePageTest() {
		Reporter.log("Login to the application");
		Reporter.log("Testing HomePage Report");
		System.out.println("Testing HomePage");
		Reporter.log("Logout from the application");
	}
	@Test
	public void NotificationPageTest() {
		Reporter.log("Login to the application");
		Reporter.log("Testing Notification Page Report");
		System.out.println("Testing Notification Page");
		Reporter.log("Logout from the application");
	}
	@Test
	public void ProfilePageTest() {
		Reporter.log("Login to the application");
		Reporter.log("Testing Profile Page Report");
		System.out.println("Testing Profile page");
		Reporter.log("Logout from the application");
	}
}
