package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPharmacyHomepagePOM {

WebDriver driver;
	
	public AmazonPharmacyHomepagePOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href=\"dashboard?ref_=ap_sb_sf_hero\"]")
	WebElement Redirect_to_Pharmacypage;
	public WebElement AmazonPharHome() {
		return Redirect_to_Pharmacypage;
	}
	
}
