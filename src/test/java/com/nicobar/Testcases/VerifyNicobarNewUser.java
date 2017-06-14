/**
 * 
 */
package com.nicobar.Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.nicobar.Pages.NewUserPage;

/**
 * @author mohit
 *
 */
public class VerifyNicobarNewUser {
	
	@Test
	public void verifyValidNewUser(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nicobar.com/");
		
		
		NewUserPage newuser = new NewUserPage(driver);
		
		newuser.typeClickSignInButton();
		
		newuser.typeClickCreateAccount();
		
		newuser.typeFirstName();
		
		newuser.typeLastName();
		
		newuser.typeSignUpEmail();
		
		newuser.typePassword1();
		
		newuser.typePassword2();
		
		newuser.typeClickOnSignupButton();
		
		driver.quit();
		
	}

}
