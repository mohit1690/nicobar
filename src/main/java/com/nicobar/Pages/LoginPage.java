/**
 * 
 */
package com.nicobar.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mohit
 * 
 * This class store all the locator and method of login page.  
 */
public class LoginPage {
	
	WebDriver driver;
	
	By clickSignInButton = By.xpath("html/body/div[1]/header/nav/div/ul/li[5]/a");
	By clickIhaveAccount = By.xpath("html/body/div[1]/section[7]/div[2]/div/div/div/h3[2]");
	By enterEmail = By.name("email");
	By password = By.name("password");
	By loginSubmit = By.xpath(".//*[@id='sign-form']/div[5]/button");
	
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void loginToNicobar(String emailid,String pass){
		
		driver.findElement(clickSignInButton).click();
		driver.findElement(clickIhaveAccount).click();
		driver.findElement(enterEmail).sendKeys(emailid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginSubmit).click();
		
	}
	
	//Create methods
	
	public void typeClickSignInButton(){
		
		driver.findElement(clickSignInButton).click();
	}
	
	public void typeClickIhaveAccount(){
		
		driver.findElement(clickIhaveAccount).click();
	}
	
	public void typeEnterEmail(String uid){
		
		driver.findElement(enterEmail).clear();
		driver.findElement(enterEmail).sendKeys(uid);
	}
	
	public void typePassword(String pass){
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton(){
		
		driver.findElement(loginSubmit).click();
	}

}
