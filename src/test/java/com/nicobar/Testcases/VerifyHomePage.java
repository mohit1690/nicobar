/**
 * 
 */
package com.nicobar.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.nicobar.Pages.HomePage;

/**
 * @author mohit
 *
 */
public class VerifyHomePage {
	
	@Test
	public void verifyHomePage() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nicobar.com/");
		Thread.sleep(3000);
		
		HomePage homePage = new HomePage(driver);
		
		/*homePage.goToClickNewArrivals();
		
		homePage.goToClickWomen();
		
		homePage.goToClcikMens();
		
		homePage.goToclickHouseAndHome();
		
		homePage.goToclickTravel();
		
		homePage.goToChangeCurrency();
		
		homePage.goToClickSearch();
		
		homePage.goToClickBanner();*/
		
		//homePage.goToClickCategorySectionOnHomePage();	//Not working this methods
		
		homePage.goToClickStores();
		
		//homePage.goToClickGC();
		
		driver.quit();
		
	}

}
