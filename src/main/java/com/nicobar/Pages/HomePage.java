/**
 * 
 */
package com.nicobar.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mohit
 *
 * This class store all the locator and method of home page.  
 */
public class HomePage {
	
	WebDriver driver;
	
	//Create Objects
	//Home Page Logo
	By clickHomePageIocn = By.xpath(".//*[@id='main-logo']/img");
	
	//Category section - Shop (New Arrivals)
	By clickShop = By.xpath(".//*[@id='n_shop']");
	By clickNewArrivals = By.xpath(".//*[@id='n_new-arrival']");
	By clickNewArrivalsWomen = By.xpath(".//*[@id='n_women']");
	By clickNewArrivalsHouseAndHome = By.xpath(".//*[@id='n_house-home']");
	By clickNewArrivalsTravel = By.xpath("//a[@href='/catalogue/category/new-arrival/travel_138/']");
	
	//Category section - Shop (Women)
	By clickWomen = By.xpath(".//*[@id='n_womens-wear']");
	By clickWomenCollection = By.xpath("//a[@id='n_tops_collection']");
	By clickTops = By.xpath("//a[@id='n_tops']");
	By clickKurtasAndTunics = By.xpath("//a[@id='n_kurtas']");
	By clickDresses = By.xpath("//a[@id='n_dresses']");
	By clickBottoms = By.xpath("//a[@id='n_lowers']");
	By clickSkirts = By.xpath("//a[@id='n_skirts']");
	By clickOverlays = By.xpath("//a[@id='n_overlays']");
	By clickWomenTravel = By.xpath("//a[@href='/catalogue/category/womens-wear/travel_130/']");
	By clickSleepwear = By.xpath("//a[@id='n_sleepwear']");
	By clickWomenEssentials = By.xpath("//a[@id='n_essentials']");
	By clickSarisAndDupattas = By.xpath(".//*[@id='n_saris-dupattas']");
	
	//Category section - Shop (men) 
	By clcikMens = By.xpath(".//*[@id='n_men']");
	By clickMenCollection = By.xpath(".//*[@id='n_shirts_collection']");
	By clickShirts = By.xpath(".//*[@id='n_shirts']");
	By clickKurtas = By.xpath("//a[@href='/catalogue/category/men/kurtas_79/']");
	By clickNicobarXSuket = By.xpath("//a[@id='n_nicobar-x-suket']");
	By clickTrousers = By.xpath("//a[@id='n_trousers']");
	By clickJackets = By.xpath("//a[@id='n_jacket']");
	By clickMenEssentials = By.xpath("//a[@href='/catalogue/category/men/essentials_123/']");
	
	//Category section - Shop (House and Home)
	By clickHouseAndHome = By.xpath(".//*[@id='n_home']");
	By clickHouseCollection = By.xpath(".//*[@id='n_dinnerware_collection']");
	By clickTablewear = By.xpath(".//*[@id='n_dinnerware']");
	By clickCushions = By.xpath(".//*[@id='n_cushions']");
	By clickBarware = By.xpath(".//*[@id='n_barware']");
	By clickServeware = By.xpath(".//*[@id='n_serveware']");
	By clickDecor = By.xpath(".//*[@id='n_decor']");
	By clickBedding = By.xpath(".//*[@id='n_bedding']");
	By clickTableLinen = By.xpath(".//*[@id='n_table-linen']");
	
	//Category section - Shop (Travel) 
	By clickTravel = By.linkText("Travel");
	By clickTravelCollection = By.linkText("Collections");
	By clickTravelTops = By.xpath("//a[@href='/catalogue/category/travel/tops_61/']");
	By clickTravelBottoms = By.xpath(".//*[@id='n_bottoms']");
	By clickDressesAndOverlays = By.xpath(".//*[@id='n_outerwear']");
	By clickScarvesAndAccessories = By.xpath(".//*[@id='n_scarves']");
	By clickBags = By.xpath(".//*[@id='n_travel-bags']");
	By clickPackingEssentials = By.xpath(".//*[@id='n_travel-accessories']");
	By clickTheBookShelf = By.xpath(".//*[@id='n_books']");
	
	//Currency locator
	By clickCurrency = By.xpath(".//*[@id='change-currengy-top']");
	By clickUSDCurrency = By.linkText("$ USD");
	By clickINRCurrency = By.linkText("₹ INR");
	
	//Search
	By clickSearchIcon = By.xpath(".//*[@id='search-box-nav']");
	By clickSearchClose = By.xpath(".//*[@id='search-nav']/div/div/div[1]/a");
	By clickSearchInput = By.xpath(".//*[@id='search-typeahead']");
	By clickSearchIconForResult = By.xpath(".//*[@id='tns-btn-submit']");
	By clickSearchViewAllResult = By.xpath("//a[contains(.,'view all results')]");
	
	//Banners
	By clickBannerImages = By.xpath("//img[@src='https://cdn.nicobar.com/media/uploads/froala_editor/images/1496737139homepage-banner_books_desktop.jpg']");
	
	//Banner next
	By clickBannerNext = By.xpath(".//*[@id='heroNext']");
	
	//Banner previous
	By clickBannerPrevious = By.xpath(".//*[@id='heroPrev']");
	
	//Our shop section
	//Women
	By clickWomenImage = By.xpath("html/body/div[1]/section[2]/div/div[2]/div/div/div[1]/a[1]/img");
	
	//Men
	By clickMenImage = By.xpath("html/body/div[1]/section[2]/div/div[2]/div/div/div[2]/a[1]/img");
	
	//House and home
	By clickHouseAndHomeImage = By.xpath("html/body/div[1]/section[2]/div/div[2]/div/div/div[3]/a[1]/img");
	
	//Travel
	By clickTravelImage = By.xpath("html/body/div[1]/section[2]/div/div[2]/div/div/div[4]/a[1]/img");
	
	//A good place to start - recommendation products
	By clickNext = By.xpath(".//*[@id='multiThumbNext']");
	By clickPrev = By.xpath(".//*[@id='multiThumbPrev']");
	By clickRecomProduct = By.xpath("//img[@class='img-responsive dynamic-image']"); //Use loop for this product
	
	//Stores
	//DELHI
	By clickDelhiStore = By.xpath("//img[@src='https://cdn.nicobar.com/400/media/uploads/froala_editor/images/home-delhi-store_j63O2P4.jpg']");
	By clickMumbaiStore = By.xpath("//img[@src='https://cdn.nicobar.com/media/uploads/froala_editor/images/home-mumbai-store_IAHOdE6.jpg']");
	By clickBangaloreStore = By.xpath("//img[@src='https://cdn.nicobar.com/media/uploads/froala_editor/images/Jomepage.jpg']");
	By clickJhodpurStore = By.xpath("//img[@src='https://cdn.nicobar.com/media/uploads/froala_editor/images/Jodhpur-Image.jpg']");
	
	//After click open store page
	By clickDiscoverStoreButton = By.xpath("//a[contains(.,'Discover Store')]");
	
	//Map navigation
	By clickMapNavigation = By.xpath("html/body/div[1]/section[7]/div[2]/div/div[4]/div/a[2]");
	
	//Gift Card 
	By clickGifting = By.xpath(".//*[@id='n_gifting']");
	By clickGiftCard = By.xpath(".//*[@id='n_giftcard']");
	//Add default gift card
	By clickDefaultGC = By.xpath(".//*[@id='gift-card-purchase-form']/div/div[1]/div/div/div/div[1]/div[1]/label/img");
	//Enter details
	By clickGCName = By.xpath(".//*[@id='id_form-0-recipient_name']");
	By clickGCEmail = By.xpath(".//*[@id='id_form-0-recipient_email']");
	By clickGCMessage = By.xpath(".//*[@id='id_form-0-message']");
	By clickGCSenderName = By.xpath(".//*[@id='id_form-0-sender_name']");
	By clickGCAddToBag = By.xpath(".//*[@id='n_giftcard']");
	
	
	
	
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void navigateToHomePage(){
		
		driver.findElement(clickHomePageIocn).click();
	}
	
//Create methods-----------------------------------------------------
	
	public void goToclickHomePageIocn(){
		
		driver.findElement(clickHomePageIocn).click();
	}
	
//Category section - Shop (New Arrivals)
	
	public void goToClickNewArrivals(){
		
		driver.findElement(clickShop).click();
		driver.findElement(clickNewArrivals).click();
		driver.findElement(clickNewArrivalsWomen).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(clickShop).click();
		driver.findElement(clickNewArrivals).click();
		driver.findElement(clickNewArrivalsHouseAndHome).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(clickShop).click();
		driver.findElement(clickNewArrivals).click();
		driver.findElement(clickNewArrivalsTravel).click();
		
	}
	
//Category section - Shop (Women)
	
	public void goToClickWomen(){
		
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickWomenCollection).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickTops).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickKurtasAndTunics).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickDresses).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickBottoms).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickSkirts).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickOverlays).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickWomenTravel).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickSleepwear).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickWomenEssentials).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickWomen).click();
		driver.findElement(clickSarisAndDupattas).click();
		
	}
	
//Category section - Shop (men)
	
	public void goToClcikMens(){
		
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickMenCollection).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickShirts).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickKurtas).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickNicobarXSuket).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickTrousers).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickJackets).click();
		driver.findElement(clickShop).click();
		driver.findElement(clcikMens).click();
		driver.findElement(clickMenEssentials).click();
		
	}
	
//Category section - Shop (House and Home)
	
	public void goToclickHouseAndHome(){
		
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickHouseCollection).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickTablewear).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickCushions).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickBarware).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickServeware).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickDecor).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickBedding).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickHouseAndHome).click();
		driver.findElement(clickTableLinen).click();
		
	}
	
//Category section - Shop (Travel)
	
	public void goToclickTravel(){
		
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickTravelCollection).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickTravelTops).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickTravelBottoms).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickDressesAndOverlays).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickScarvesAndAccessories).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickBags).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickPackingEssentials).click();
		driver.findElement(clickShop).click();
		driver.findElement(clickTravel).click();
		driver.findElement(clickTheBookShelf).click();
		
	}
	
//Currency changer
	
	public void goToChangeCurrency(){
		
		driver.findElement(clickCurrency).click();
		driver.findElement(clickUSDCurrency).click();
		driver.findElement(clickCurrency).click();
		driver.findElement(clickINRCurrency).click();
		
	}
	
//Search
	
	public void goToClickSearch(){
		
		driver.findElement(clickSearchIcon).click();
		driver.findElement(clickSearchClose).click();
		driver.findElement(clickSearchIcon).click();
		driver.findElement(clickSearchInput).sendKeys("Kurta");
		driver.findElement(clickSearchIconForResult).click();
		//driver.findElement(clickSearchViewAllResult).click();
				
	}
	
//Banners
	
	public void goToClickBanner(){
		
		//Banner next
		driver.findElement(clickBannerNext).click();
		//Banner previous
		driver.findElement(clickBannerPrevious).click();
		driver.findElement(clickBannerImages).click();
		
	}
		
//Our shop section
	
	public void goToClickCategorySectionOnHomePage(){
		
		//Women Section
		driver.findElement(clickWomenImage).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		//Men Section
		driver.findElement(clickMenImage).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		//House and home
		driver.findElement(clickHouseAndHomeImage).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new Handler().navigateToBack(driver);
		//Travel section
		driver.findElement(clickTravelImage).click();
		
	}
		
// A good place to start - recommendation products
	
	public void goToClickRecommendationProducts(){
		
		//Next icon
		driver.findElement(clickNext).click();
		//Previous icon
		driver.findElement(clickPrev).click();
		// Products
		driver.findElement(clickRecomProduct).click();
		
	}
	
//Stores
	
	public void goToClickStores(){
		
		driver.findElement(clickDelhiStore).click();
		driver.findElement(clickDiscoverStoreButton).click();
		new Handler().windowHandler(driver);
		driver.findElement(clickDelhiStore).click();
		driver.findElement(clickMapNavigation).click();
		new Handler().windowHandler(driver);
		
		driver.findElement(clickMumbaiStore).click();
		driver.findElement(clickDiscoverStoreButton).click();
		new Handler().windowHandler(driver);
		driver.findElement(clickMapNavigation).click();
		new Handler().windowHandler(driver);
		
		driver.findElement(clickBangaloreStore).click();
		driver.findElement(clickDiscoverStoreButton).click();
		new Handler().windowHandler(driver);
		driver.findElement(clickMapNavigation).click();
		new Handler().windowHandler(driver);
		
		driver.findElement(clickJhodpurStore).click();
		driver.findElement(clickDiscoverStoreButton).click();
		driver.findElement(clickMapNavigation).click();
		
	}
		
//Gift Card
	
	public void goToClickGC(){
		
		driver.findElement(clickGifting).click();
		driver.findElement(clickGiftCard).click();
		driver.findElement(clickDefaultGC).click();
		driver.findElement(clickGCName).sendKeys("Mohit Jaiswal");
		driver.findElement(clickGCEmail).sendKeys("mohitjaiswal@nicobar.com");
		driver.findElement(clickGCMessage).sendKeys("Hi, This is test message.");
		driver.findElement(clickGCSenderName).sendKeys("Testing");
		driver.findElement(clickGCAddToBag).click();
		
		
		
	}
}
