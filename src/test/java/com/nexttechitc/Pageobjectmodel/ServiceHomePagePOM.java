package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceHomePagePOM {

	WebDriver driver;

	public ServiceHomePagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Explore All Services for Home']")
	WebElement VeryfyServiceHomePage;
	public WebElement ServiceHome_Displayed() {
		return VeryfyServiceHomePage;
	}
}
