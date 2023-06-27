package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportHomePagePOM {
WebDriver driver;
	
	public SupportHomePagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Welcome to Dell Support']")
	WebElement VeryfySupportHomePage;
	public WebElement SupportHome_Displayed() {
		return VeryfySupportHomePage;
	}
}
