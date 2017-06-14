/**
 * 
 */
package com.nicobar.Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mohit
 *
 * This class store all the locator and method of footer.  
 */
public class FooterPage {
	
	WebDriver driver;
	
	//All social Icons locator
	By clickFacebookIcon = By.xpath("//span[@class='icon icon_fb-bordered']");
	By clickInstagramIcon = By.xpath("html/body/footer[1]/div/div[1]/div[1]/div/div[2]/div[2]/a/span");
	By clickPintrestIcon = By.xpath("html/body/footer[1]/div/div[1]/div[1]/div/div[2]/div[3]/a/span");
	By clickCallingIocn = By.xpath("html/body/footer[1]/div/div[1]/div[1]/div/div[2]/div[4]/a/span");
	By clickMailIcon = By.xpath("html/body/footer[1]/div/div[1]/div[1]/div/div[2]/div[5]/a/span");
	
	//Subscribe email locator
	By enterEmailAddress = By.name("email");
	By selectGender = By.xpath("//input[@placeholder='Gender']");
	By selectMaleGender = By.xpath("//div[contains(.,'Male')]");
	By selectFemaleGender = By.xpath("//div[contains(.,'Female')]");
	By clickSubscribeButton = By.xpath("//button[@type='submit']");
	
	
	By clickAboutUs = By.linkText("About us");
	By clickDesign = By.xpath("//a[contains(.,'Design')]");
	By clickInThePress = By.xpath("//a[contains(.,'In the press')]");
	By clickNicotides = By.xpath("//a[contains(.,'Nicotides')]");
	By clickStores = By.xpath("//a[contains(.,'Stores')]");
	By clickContactUs = By.xpath("//a[contains(.,'Contact us')]");
	By clickHiring = By.xpath("//a[contains(.,'We’re hiring')]");
	By clickShippingAndReturn = By.xpath("//a[contains(.,'Shipping & returns')]");
	By clickTermAndConditions = By.xpath("//a[contains(.,'Terms & conditions')]");
	
	
	public FooterPage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public void clickOnFooter(){
		
		driver.findElement(clickFacebookIcon).click();
	}
	
	public void clickInstagramIcon(){
		
		driver.findElement(clickInstagramIcon).click();
	}
	
	public void clickPintrestIcon(){
		
		driver.findElement(clickPintrestIcon).click();
	}
	
	public void clickCallingIocn(){
		
		driver.findElement(clickCallingIocn).click();
	}
	
	public void clickMailIcon(){
		
		driver.findElement(clickMailIcon).click();
	}
	
	public void loginToSubscribe(){
		
		driver.findElement(enterEmailAddress).sendKeys("mohitjaiswal@nicobar.com");
		driver.findElement(selectGender).click();
		driver.findElement(selectMaleGender).click();
		driver.findElement(selectFemaleGender).click();
		driver.findElement(clickSubscribeButton).click();
						
	}
	
	public void clickAboutUs(){
		
		driver.findElement(clickAboutUs).click();
	}
	
	public void clickDesign(){
		
		driver.findElement(clickDesign).click();
	}

	public void clickInThePress(){
	
	driver.findElement(clickInThePress).click();
}

	public void clickNicotides(){
	
	driver.findElement(clickNicotides).click();
}

	public void clickStores(){
	
	driver.findElement(clickStores).click();
}

	public void clickHiring(){
	
	driver.findElement(clickHiring).click();
}

	public void clickContactUs(){
	
	driver.findElement(clickAboutUs).click();
}

	public void clickShippingAndReturn(){
	
	driver.findElement(clickShippingAndReturn).click();
}

	public void clickTermAndConditions(){
	
	driver.findElement(clickTermAndConditions).click();
}
	
	
	
	//Create Method
	
	public void goToclickFacebookIcon(){
		
		driver.findElement(clickFacebookIcon).click();
		new Handler().windowHandler(driver);
						
	}
	
	public void goToclickInstagramIcon(){
		
		driver.findElement(clickInstagramIcon).click();
		new Handler().windowHandler(driver);
		
	}
	
	public void goToclickPintrestIcon(){
		
		driver.findElement(clickPintrestIcon).click();
		new Handler().windowHandler(driver);		
	}
	
	public void goToclickCallingIocn(){
		
		
	}
	
	public void goToclickMailIcon(){
		
		
	}
	
	public void goToclickAboutUs(){
		
		driver.findElement(clickAboutUs).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickDesign(){
		
		driver.findElement(clickDesign).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickInThePress(){
		
		driver.findElement(clickInThePress).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickNicotides(){
		
		driver.findElement(clickNicotides).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickStores(){
		
		driver.findElement(clickStores).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickContactUs(){
		
		driver.findElement(clickContactUs).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickHiring(){
		
		driver.findElement(clickHiring).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickShippingAndReturn(){
		
		driver.findElement(clickShippingAndReturn).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		
	}
	
	public void goToclickTermAndConditions(){
		
		driver.findElement(clickTermAndConditions).click();
		
	}
	

}
