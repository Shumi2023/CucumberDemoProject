package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestselleramazonPOM {
	
	WebDriver driver;
	
	public bestselleramazonPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 
	@FindBy(xpath ="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	WebElement Click_bestsellers;
	public WebElement Amazonbestsellers() {
		return Click_bestsellers;
	}
	
	
	
	
}
