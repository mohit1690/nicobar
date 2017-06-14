/**
 * 
 */
package com.nicobar.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


/**
 * @author mohit
 *
 */
public class Handler{
	
	// Menu - men shirt
	By clickShop = By.xpath(".//*[@id='n_shop']");
	By clcikMens = By.xpath(".//*[@id='n_men']");
	By clickShirts = By.xpath(".//*[@id='n_shirts']");
	
	//Child browser window handler.
	public void windowHandler(WebDriver driver){
		String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{

			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		driver.switchTo().window(parent);
	}
	
	//Navigate to back 
	public void navigateToBack(WebDriver driver){
		
		driver.navigate().to("http://www.nicobar.com");
		driver.navigate().refresh();
	}
	
	//Scrolling page.
	public void scrolling(WebDriver driver) throws InterruptedException{
		
		// This  will scroll page vertical
		((JavascriptExecutor)driver).executeScript("scroll(0,6000)");
		Thread.sleep(2000);
	}
	
	public void clickOnShirt(WebDriver driver){
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickShirts).click();
	}
	
	
}