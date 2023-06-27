package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchamazonPOM {

	WebDriver driver;

	//WE HAVE TO CREATE CONSTRUCTOR
	//CONSTRuctor is not a method but special types of method. 
	//constructor name and class name will be same
	//it has no return type

	public  searchamazonPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//"//input[@id="twotabsearchtextbox"] "

	@FindBy(name="field-keywords")
	WebElement Type_amazonsearch;
	//Method
	public WebElement Amazonsearch(){
		return Type_amazonsearch;

	}

	@FindBy(id="nav-search-submit-button")
	WebElement Click_searchicon;
	//Method
	public WebElement searchicon(){
		return Click_searchicon;

	}




}
