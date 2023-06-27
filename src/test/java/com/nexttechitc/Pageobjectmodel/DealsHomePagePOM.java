package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsHomePagePOM {

	WebDriver driver;
	
	public DealsHomePagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@target=\"_self\"]")
	WebElement VeryfyDealHomePage;
	public WebElement HomePageDisplayed() {
		return VeryfyDealHomePage;
	}
}
