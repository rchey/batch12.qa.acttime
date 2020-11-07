package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

/*
 * Name: LoginPage Class
 * Tester: Subhashini
 * Verified By: Shantosh
 * Date Modified: 11/04/2020
 */

public class LoginPage extends DriverScript {
  
// ************************************************ Page Elements *******************************************// 
	
	@FindBy(id = "username") WebElement usernameTextBox;
	@FindBy(name = "pwd") WebElement passwordTextBox;
	@FindBy(id = "loginButton") WebElement loginButton;
	@FindBy(className = "atLogoImg") WebElement actitimeLogo;
  
//************************************************ Page Initialization ************************************// 
  
  // Pagefactory is the class used to initialize the current class elements
  
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
  
//************************************************ Page Actions *******************************************//
  
	public void loginToApplication(String username, String password) 
	{
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}

	public boolean verifyActiLogo() 
	{
		return actitimeLogo.isDisplayed();
	}

	public String verifyPageTitle() 
	{
		return driver.getTitle();
	}

}