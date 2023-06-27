package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegiPOM {

	WebDriver driver;

    public RegiPOM (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);

    }
    
    @FindBy(xpath="//a[contains(text(),'My Account')]")
    WebElement Click_Account;
    public WebElement MyAccountPage(){
        return Click_Account;
    }
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Register']")
    WebElement Click_Register;
    public WebElement RegisterPage(){
        return Click_Register;
    }

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    WebElement Type_FirstName;
    public WebElement FirstNM(){
        return Type_FirstName;
    }

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    WebElement Type_LastName;
    public WebElement LastNM(){
        return Type_LastName;
    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement Type_Email;
    public WebElement EmailFL(){
        return Type_Email;
    }
    @FindBy(xpath = "//input[@name=\"telephone\"]")
    WebElement Type_Phone;
    public WebElement Telephone(){
        return Type_Phone;
    }

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement Type_Pass;
    public WebElement PasswordFL(){
        return Type_Pass;
    }

    @FindBy(xpath = "//input[@ name=\"confirm\"]")
    WebElement Type_Confirm;
    public WebElement ConFirmPass(){
        return Type_Confirm;
    }
    @FindBy(xpath = "//input[@name=\"agree\"]")
    WebElement Click_Privacy;
    public WebElement PrivacyPolicy() {
        return Click_Privacy;
    }

    @FindBy(xpath = "//input[@value=\"Continue\"]")
    WebElement Click_Continue;
    public WebElement ContButton() {
        return Click_Continue;
    }

	
	
}
