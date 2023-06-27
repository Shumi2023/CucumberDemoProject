package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegiPOM {

WebDriver driver;
	
	public AmazonRegiPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[normalize-space()='Registry']")
	WebElement Click_Registry;
	public WebElement Amazonregi() {
		return Click_Registry;
	}

}
