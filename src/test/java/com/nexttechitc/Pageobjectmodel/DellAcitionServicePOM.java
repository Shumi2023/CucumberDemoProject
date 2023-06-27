package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAcitionServicePOM {

	WebDriver driver;
	
	public DellAcitionServicePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Services']")
	WebElement Action_Service;
	public WebElement service() {
		return Action_Service;
	}
	
	@FindBy(xpath="//a[normalize-space()='View All Services']")
	WebElement Click_viewallservice;
	public WebElement viewallservice() {
		return Click_viewallservice;
	}
}
