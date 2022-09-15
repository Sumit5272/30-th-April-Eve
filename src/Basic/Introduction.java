package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Introduction {
	
	
	@Test (priority=1) 
	public void openurl() {
		System.out.println("Url is opened");
		Reporter.log("Open url successfuly");
	}
	
	@Test (priority=2)
	public void login() {
		System.out.println("Logged into the application successfully");
		Reporter.log("Login Successfully");
	}
	
	@Test (priority=3)
	public void logout() {
		System.out.println("Logged out from the application sucessfully");
		Reporter.log("Logout successfully");
	}


}
