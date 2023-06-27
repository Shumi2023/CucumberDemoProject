package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBestsellerHomePOM {
	
	WebDriver driver;
	
	//Constructor
	
	public AmazonBestsellerHomePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id=\"zg_banner_text\"]")
	WebElement BestsellerHP;
	public WebElement Bestsellerhome() {
		return BestsellerHP;
	}

}
