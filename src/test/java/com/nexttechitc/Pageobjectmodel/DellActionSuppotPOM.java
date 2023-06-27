package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionSuppotPOM {
	
	WebDriver driver;
	
	public DellActionSuppotPOM(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@role=\"menuitem\"]//span[text()='Support']")
	WebElement Support;
	public WebElement Nav_Support() {
		return Support;
	}
	
	@FindBy(xpath="//li[@data-tier-id=\"4\"]//a[text()='Support Home']")
	WebElement Click_SupportHome;
	public WebElement Support_tab () {
		return Click_SupportHome;
	}
}
