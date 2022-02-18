package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 

{
WebDriver driver;
LoginPageClass login;
HomePageClass home;




	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	}
	
	@BeforeMethod
	public void loginmethod()
	{
	 LoginPageClass login=new LoginPageClass(driver);
	 login.username();
	 login.password();
	 login.loginbutton();
	 
    }
	
	@AfterMethod
	public void logoutmethod()
	{
	HomePageClass home =new HomePageClass(driver);
    home.clickSettingButton();
    home.clickLogoutButton();
   
	}

	@AfterClass
	public void teardown()
	{
      driver.quit();
	}
	}
