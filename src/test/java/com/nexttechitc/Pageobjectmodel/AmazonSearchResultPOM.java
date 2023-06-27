package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchResultPOM {

	WebDriver driver;

	public  AmazonSearchResultPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[contains(text(),'Results')]")
	WebElement amazonsearchResult;
	public WebElement Amazonsearchiphone(){
		return amazonsearchResult;

	}
}
