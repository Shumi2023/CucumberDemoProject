package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonRegiPOM;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class AmazonRegistry {

	WebDriver driver;

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	@After

	public void teardown() {

		driver.quit();
	}

	@Given("^user visit to Amazon homepage$")
	public void user_visit_to_Amazon_homepage() throws Throwable {

		driver.get("https://www.amazon.com/");

	}

	@When("^user click to Amazon Registry tab$")
	public void user_click_to_Amazon_Registry_tab() throws Throwable {
		AmazonRegiPOM regi =new AmazonRegiPOM(driver);
		regi.Amazonregi().click();
	}

	@Then("^user should be redirected to the Amazon Registry page$")
	public void user_should_be_redirected_to_the_Amazon_Registry_page() throws Throwable {

		AmazonRegiHomePOM home =new AmazonRegiHomePOM(driver);
		System.out.println(home.Verify_RegistryHomePage.isDisplayed());
	}


}
