package Parameterization_CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowsers {
	WebDriver driver;
    //browser setup
	@Parameters("Browser")
    @Test(priority=1)
    public void Crossbrowser(String Browser) {
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();	
	}	
	else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	
	else {
		System.out.println("wrong browser selected by user");
	}
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	}
    
    @Test(priority=2)
    public void verifycurrenturl() {
	 Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
    }

    @Test(priority=3)
    public void verifypagetitle() {
    	Assert.assertEquals(driver.getTitle(),"Facebook � log in or sign up");
    }

    @Test(priority=4)
    public void verifyUserfield() {
    	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
    	Assert.assertTrue(username.isDisplayed());
    	username.sendKeys("Sumit");
    }

    @Test(priority=5)
    public void verifyPassfield() {
    	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
    	Assert.assertTrue(password.isDisplayed());
    	password.sendKeys("Sumit@123");
    }

    @Test(priority=6)
    public void clickLoginBtn() {
    	WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
    	Assert.assertTrue(LoginBtn.isEnabled());
    	LoginBtn.click();
    }
	
    @Test(priority=7)
	 public void hiddendivisionpopup() {
    	WebElement exitBtn = driver.findElement(By.xpath("//i[@class=\"_9ai6 img sp_-Ww9-2lZPiS_1_5x sx_8ec58c\"]"));
    	exitBtn.click();
    	
    	
    }
	
	
	
	
	
	
	
	
}
