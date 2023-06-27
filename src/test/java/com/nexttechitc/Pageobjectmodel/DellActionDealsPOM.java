package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionDealsPOM {
	WebDriver driver;

	public DellActionDealsPOM (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@role=\"menuitem\"]//span[text()='Deals']")
	WebElement Deals;
	public WebElement Nav_Deals() {
		return Deals;
	}

	@FindBy (xpath="//a[text()='View All Deals']")
	WebElement Click_Deals;
	public WebElement Deals_tab() {
		return Click_Deals;
	}
	
}
