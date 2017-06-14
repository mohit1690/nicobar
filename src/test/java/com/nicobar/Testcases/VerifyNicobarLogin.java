/**
 * 
 */
package com.nicobar.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.nicobar.Pages.LoginPage;

/**
 * @author mohit
 *
 */
public class VerifyNicobarLogin {
	
	@Test	
	public void verifyValidLogin(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nicobar.com/");
		
		LoginPage login = new LoginPage(driver);
		
		//Another way to call this method.
		
		login.loginToNicobar("testnicobar@gmail.com", "tech@nicobar");
		
		/*login.typeClickSignInButton();
		
		login.typeClickIhaveAccount();
		
		login.typeEnterEmail("testnicobar@gmail.com");
		
		login.typePassword("tech@nicobar");
		
		login.clickOnLoginButton();*/
		
		
		
		driver.quit();
		
	}

}
