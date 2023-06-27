package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FBsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignupSteps {

	WebDriver driver;

	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup/");

	}

	@When("^user enter \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {

		try{
			FBsignupPOM fbsignup1 =new FBsignupPOM(driver);
			fbsignup1.firstname().sendKeys(arg1);
			fbsignup1.lastname().sendKeys(arg2);
			fbsignup1.email().sendKeys(arg3);
			fbsignup1.password().sendKeys(arg4);
			WebDriverWait wait=new WebDriverWait(driver,20);
		}

		catch(Exception e) {
			System.out.println("element not found exception");
		}
	}


	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {

		FBsignupPOM fbsignup1 =new FBsignupPOM(driver);

		Select dropdown=new Select (fbsignup1.click_month);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);

		Select dropdown1=new Select (fbsignup1.click_day);
		dropdown1.selectByValue("2");
		Thread.sleep(3000);

		Select dropdown2=new Select (fbsignup1.click_year);
		dropdown2.selectByVisibleText("2000");
		Thread.sleep(3000);

		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^user select gender radio button$")
	public void user_select_gender_radio_button() throws Throwable {
		FBsignupPOM fbsignup1 =new FBsignupPOM(driver);
		fbsignup1.RadioButton().click();
		Thread.sleep(3000);
		driver.quit();
	}

}
