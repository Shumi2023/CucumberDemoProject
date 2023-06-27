package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPharmacyPOM {
	
	WebDriver driver;
	
	public AmazonPharmacyPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href=\"https://pharmacy.amazon.com/?nodl=0&ref_=nav_cs_pharmacy\"]")
	WebElement Click_Pharmacy;
	public WebElement AmazonPhar() {
		return Click_Pharmacy;
	}

	
}
