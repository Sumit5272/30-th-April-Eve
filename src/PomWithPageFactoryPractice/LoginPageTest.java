package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();	
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void facebookLoginPageTest() {
	LoginPage lp=new LoginPage(driver);
	
	lp.verifyfacebookloginpagelogo();
	lp.verifyFacebookLoginPageTagline();
	lp.verifyFacebookLoginPageCreateNewAccountBtn();
	lp.verifyFacebookLoginPageCreatePage();
	lp.verifyFacebookLoginPageFooterLinks();
	lp.setFacebookLoginPageUsername();
	lp.setFacebookLoginPagePassword();
	lp.clickFacebookLoginPageLoginBtn();
	}
}
