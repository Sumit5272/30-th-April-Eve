package PomWithPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {  //pom class

	//Declaretion==>webelements
	//Initialization==>pagefactory
	//Usage==>validation==>methods

    //Declaration
	
	//object Repository
//  @FindBy (value) private WebElement elementname;
	@FindBy (xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy (xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy (name="firstname") private WebElement firstname;
	@FindBy (name="lastname" ) private WebElement surname;
	@FindBy (name="reg_email__") private WebElement mob_email;
	@FindBy (name="reg_passwd__") private WebElement password;
	@FindBy (name="birthday_day") private WebElement birthday;
	@FindBy (name="birthday_month") private WebElement birthmonth;
	@FindBy (name="birthday_year") private WebElement birthyear;
	@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
	@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
	@FindBy (xpath="//button[@name='websubmit']" ) private WebElement signupbtn;
	
	
	//Initialization
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void ClickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void verifyfacebookRegistrationPagereg_fblogo() {
        Assert.assertTrue(reg_fblogo.isDisplayed(), "The fblogo is not display on Registration Page");	
	}
	
	public void verifyfacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The fb Already having account option is not displayed on registration page");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void setfacebookRegistrationPageFirstName(String fn) {
		Assert.assertTrue(firstname.isDisplayed(), "The fb firstname option is not displayed on Registration page");
		firstname.sendKeys(fn);
	}
	
	public void setfacebookRegistrationPageLastName() {
		surname.sendKeys("Khairnar");
	}
	
	public void setfacebookRegistrationPagemob_email() {
		mob_email.sendKeys("8975271924");
	}
	
	public void setfacebookRegistrationPagepassword() {
		password.sendKeys("Sumit@1234");
	}
	
	public void setfacebookRegistrationPagebirthday(String g) {
		Select bday=new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(), "The birth day option not displayed on Registration Page");
		Assert.assertFalse(birthday.isSelected());
		bday.selectByVisibleText(g);
	}
	
	public void setfacebookRegistrationPagebirthmonth() {
		Select bmonth=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "The birth month option not displayed on Registration Page");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("Jul");
	}
	
	public void setfacebookRegistrationPagebirthyear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "The birth year option not displayed on Registration Page");
		Assert.assertFalse(birthyear.isSelected());
		byear.selectByVisibleText("1990");
	}
	
	public void  setfacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			gender_male.click();
		}
		else if(gender.equalsIgnoreCase("Female")) {
			gender_female.click();
		}
		else {
			System.out.println("User has provided the wrong input");
		}
	}
	
	public void clickfacebookRegistrationPageSubmitBtn() {
		signupbtn.click();
	}
}
