package PomWithPageFactoryPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {

	//daclaration
	@FindBy (xpath="//img[@alt='Facebook']") private WebElement login_fblogo;
	@FindBy (xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_fbtagline;
	@FindBy (xpath="//input[@name='email']") private WebElement username;
	@FindBy (xpath="//input[@name='pass']") private WebElement password;
	@FindBy (xpath="//button[@name='login']") private WebElement loginBtn;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgottenpassword;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement createnewaccountbtn;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement createpagelink;
	@FindBys ({@FindBy(xpath="//div[@aria-label='Facebook site links']/ul/li/a")}) private List<WebElement> footerlinks;
	
	//initilization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	
	public void verifyfacebookloginpagelogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(), "FB logo is not displayed on login page");
		Reporter.log("verifyfacebookloginpagelogo",true);
	}
	
	public void verifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_fbtagline.isDisplayed(), "Fb Tagline is not displayed on login page");
		Reporter.log("verifyFacebookLoginPageTagline",true);
	}
	
	public void verifyFacebookLoginPageCreateNewAccountBtn() {
		Assert.assertTrue(createnewaccountbtn.isDisplayed(), "Fb New Account Button is not displayed on login page");
		Reporter.log("verifyFacebookLoginPageCreateNewAccountBtn",true);
	}
	
	public void verifyFacebookLoginPageCreatePage() {
		Assert.assertTrue(createpagelink.isDisplayed(), "Fb Crete Page Link is not displayed on login page");
		Reporter.log("verifyFacebookLoginPageCreatePage",true);
	}
	
	public void setFacebookLoginPageUsername() {
		Assert.assertTrue(username.isDisplayed(), "Fb Username Field is not displayed on login page");
		Assert.assertTrue(username.isEnabled(), "Fb Username Field is not enabled on login page");
		username.sendKeys("Sumit");
		Reporter.log("setFacebookLoginPageUsername",true);
	}
	
	public void setFacebookLoginPagePassword() {
		Assert.assertTrue(password.isDisplayed(), "Fb Username Field is not displayed on login page");
		password.sendKeys("Sumit@9874895278922547923");
		Reporter.log("setFacebookLoginPagePassword",true);
	}
	
	public void clickFacebookLoginPageLoginBtn() {
		Assert.assertTrue(loginBtn.isDisplayed(), "Fb Login Button is not displayed on login page");
		Assert.assertTrue(loginBtn.isEnabled(), "Fb Login Button is not Enabled on login page");
		loginBtn.click();
		Reporter.log("clickFacebookLoginPageLoginBtn",true);
	}
	
	public void verifyFacebookLoginPageFooterLinks() {
		Assert.assertEquals(footerlinks.size(), 31);
		
		Reporter.log("verifyFacebookLoginPageFooterLinks",true);
		for(int i=0;i<footerlinks.size();i++) {
			String links = footerlinks.get(i).getText();
			System.out.println(links);
		}
	}
	
	
}
