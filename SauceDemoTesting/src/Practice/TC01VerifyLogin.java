package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TC01VerifyLogin extends BaseClass




{
    @Test
    
    public void loginfunctionality() 
    
   {
    String actualTitle= "Swag labs"	;
    
	String expectedTitle=driver.getTitle();
    
    if
    (expectedTitle.equals(actualTitle));
    {
    System.out.println("Login Test is passed");
    }
    
    
    
   }
	
 }
