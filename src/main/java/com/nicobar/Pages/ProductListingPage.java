/**
 * 
 */
package com.nicobar.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author mohit
 *
 * This class store all the locator and method of product listing page. (PLP)
 */
public class ProductListingPage {
	
	WebDriver driver;
	Handler handler;
	
	By clickProduct = By.xpath(".//div[@class='resultGiftBox']");
	By clickQuickView = By.xpath(".//*[@id='app']/div/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/a");
	By clickAddToWishList = By.xpath("//span[contains(@data-toggle,'modal')]");
	
	
	
	
	
	List<WebElement> listofItems = new ArrayList<WebElement>();

	public ProductListingPage(WebDriver driver){
		this.handler = new Handler();
		this.driver=driver;
	}
	
	public void clickToProduct(){
		
		driver.findElement(clickProduct).click();
	}
	
//Create methods
	
	public void goToClickProduct(){
		
		handler.clickOnShirt(driver);
		
		listofItems.addAll(driver.findElements(clickProduct));
		
		for (int i=1; i<=listofItems.size();)
		{
		   listofItems.get(i).click();
		   break;
		   
		   /*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   System.out.println(i);
		   System.out.println("pass");
		   driver.navigate().back();*/
		}
		
		
		//driver.findElement(clickProduct).click();
		
	}

}
