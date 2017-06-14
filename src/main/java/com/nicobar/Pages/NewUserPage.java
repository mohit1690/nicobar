/**
 * 
 */
package com.nicobar.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mohit
 *
 * This class store all the locator and method of registration page. 
 */
public class NewUserPage {
	
	WebDriver driver;
	
	By clickSignInButton = By.xpath("html/body/div[1]/header/nav/div/ul/li[5]/a");
	By clickCreateAccount = By.xpath("//h3[@class='text-center border-bottom cursor create-account']");
	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By signupEmail = By.id("signup-email");
	By password1 = By.id("password1");
	By password2 = By.id("password2");
	By clickToJoinUs = By.xpath(".//*[@id='signup']/div[8]/input");
	
	
	public NewUserPage(WebDriver driver){
		
		driver.findElement(clickSignInButton).click();
		driver.findElement(clickCreateAccount).click();
		driver.findElement(firstName).sendKeys("Test");
		driver.findElement(lastName).sendKeys("Test");
		driver.findElement(signupEmail).sendKeys("test90@testing.com");
		driver.findElement(password1).sendKeys("123456");
		driver.findElement(password2).sendKeys("123456");
		driver.findElement(clickToJoinUs).click();
	}
	
	//Create Methods.
	
	public void typeClickSignInButton(){
		
		driver.findElement(clickSignInButton).click();
	}
	
	public void typeClickCreateAccount(){
		
		driver.findElement(clickCreateAccount).click();
	}
	
	public void typeFirstName(){
		
		driver.findElement(firstName).sendKeys("Test");
	}
	
	public void typeLastName(){
		
		driver.findElement(lastName).sendKeys("Test");
	}
	
	public void typeSignUpEmail(){
		
		driver.findElement(signupEmail).sendKeys("test90@testing.com");
	}
	
	public void typePassword1(){
		
		driver.findElement(password1).sendKeys("123456");
	}
	
	public void typePassword2(){
		
		driver.findElement(password2).sendKeys("123456");
	}
	
	public void typeClickOnSignupButton(){
		
		driver.findElement(clickToJoinUs).click();
	}

}
