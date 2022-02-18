package com.sauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass 
{

	 private WebDriver driver;
	 
	// find xpath 
	 
	 @FindBy(xpath="//input[@id='user-name']")
	 private WebElement username;
	 
	 
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	 
	 @FindBy(xpath="//input[@id='login-button']")
	 private WebElement loginbutton;
	 
	 
	 //create constructor
	 
	 public POMclass (WebDriver driver)
	 {
	   this.driver=driver;
	 
	   PageFactory.initElements(driver, this);
	    
	 }	
	// create methods for performing actions
	   public void username()
	   {
		   username.sendKeys("standard_user");
	   }
	   public void password()
	   {
		   password.sendKeys("secret_sauce");   
	   }
	   
	   public void loginbutton()
	   {
		   loginbutton.click();
	   }
	   

	
	
	

	
	
	
}
