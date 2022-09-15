package PomWithPageFactoryPractice;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {//Test case ==>These are your navigational steps
  
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();	
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);  //its not use only my identtfication
		driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage=new RegistrationPage(driver);
		
		rgpage.ClickFacebookSignupLink();
		rgpage.verifyfacebookRegistrationPagereg_fblogo();
		rgpage.verifyfacebookRegistrationPageAlreadyAccount();
		rgpage.setfacebookRegistrationPageFirstName("Sumit");
		rgpage.setfacebookRegistrationPageLastName();
		rgpage.setfacebookRegistrationPagemob_email();
		rgpage.setfacebookRegistrationPagepassword();
		rgpage.setfacebookRegistrationPagebirthday("14");
		rgpage.setfacebookRegistrationPagebirthmonth();
		rgpage.setfacebookRegistrationPagebirthyear();
		rgpage.setfacebookRegistrationPageGender("male");
		rgpage.clickfacebookRegistrationPageSubmitBtn();
		
	
	}
	
}
