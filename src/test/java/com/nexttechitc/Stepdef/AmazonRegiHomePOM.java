package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegiHomePOM {

WebDriver driver;
	
	public AmazonRegiHomePOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@href=\"/registries\"]")
	WebElement Verify_RegistryHomePage;
	public WebElement AmazonregiHome() {
		return Verify_RegistryHomePage;
	}
}
