/**
 * 
 */
package com.nicobar.Testcases;

import org.testng.annotations.Test;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.nicobar.Pages.FooterPage;
import com.nicobar.Pages.Handler;

/**
 * @author mohit
 *
 */
public class VerifyNicobarFooter {
	
	@Test
	public void verifyFooter() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nicobar.com/");
		Thread.sleep(3000);
		new Handler().scrolling(driver);
		
		FooterPage footer = new FooterPage(driver);
		
		footer.goToclickFacebookIcon();
		
		footer.goToclickInstagramIcon();
		
		footer.goToclickPintrestIcon();
					
		footer.goToclickAboutUs();
		new Handler().scrolling(driver);
		
		footer.goToclickDesign();
		new Handler().scrolling(driver);
		
		footer.goToclickInThePress();
		new Handler().scrolling(driver);
				
		footer.goToclickInThePress();
		new Handler().scrolling(driver);
		
		footer.goToclickNicotides();
		new Handler().scrolling(driver);
		
		footer.goToclickStores();
		new Handler().scrolling(driver);
		
		footer.goToclickContactUs();
		new Handler().scrolling(driver);
		
		footer.goToclickHiring();
		new Handler().scrolling(driver);
		
		footer.goToclickShippingAndReturn();
		new Handler().scrolling(driver);
		
		footer.goToclickTermAndConditions();
		
		driver.quit();
	}

}
