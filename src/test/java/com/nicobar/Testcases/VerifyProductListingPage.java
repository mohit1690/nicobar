/**
 * 
 */
package com.nicobar.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.nicobar.Pages.ProductListingPage;

/**
 * @author mohit
 *
 */
public class VerifyProductListingPage {
	
	@Test
	public void verifyProductListingPage() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nicobar.com/");
		Thread.sleep(3000);
		
		ProductListingPage plp = new ProductListingPage(driver);
		
		plp.goToClickProduct();
		
		
		
		
		
	}

}
