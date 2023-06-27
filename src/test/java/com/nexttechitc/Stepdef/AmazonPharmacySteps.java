package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonPharmacyHomepagePOM;
import com.nexttechitc.Pageobjectmodel.AmazonPharmacyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonPharmacySteps {

	WebDriver driver;

	@Given("^user visit to the Amazon homepage$")
	public void user_visit_to_the_Amazon_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

	}

	@When("^user click to Amazon Pharmachy tab$")
	public void user_click_to_Amazon_Pharmachy_tab() throws Throwable {
		AmazonPharmacyPOM pharmacy = new AmazonPharmacyPOM(driver);
		pharmacy.AmazonPhar().click();
		
	}

	@Then("^user should be redirected to the Amazon Pharmacy page$")
	public void user_should_be_redirected_to_the_Amazon_Pharmacy_page() throws Throwable {

		AmazonPharmacyHomepagePOM homepage =new AmazonPharmacyHomepagePOM(driver);
		homepage.AmazonPharHome().isDisplayed();
		System.out.println("inside the Pharmacy homepage");
	
		driver.quit();
	}

}
