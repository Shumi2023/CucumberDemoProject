package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.RegiPOM;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class NinjaSteps {

	WebDriver driver;
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

	}
	@After
	public void teardown(){

		driver.quit();
	}

	@Given("^user navigates to Register Account page$")
	public void user_navigates_to_Register_Account_page() throws Throwable {
		driver.get("https://tutorialsninja.com/demo/");
		RegiPOM regi = new RegiPOM(driver);
		regi.MyAccountPage().click();
		regi.RegisterPage().click();
	}

	@When("^user enters \"([^\"]*)\" in the first name field and \"([^\"]*)\" in the last name field$")
	public void user_enters_in_the_first_name_field_and_in_the_last_name_field(String arg1, String arg2) throws Throwable {

		RegiPOM TypeFirstNM = new RegiPOM(driver);
		TypeFirstNM.FirstNM().sendKeys(arg1);
		TypeFirstNM.LastNM().sendKeys(arg2);
	}

	@When("^user enters \"([^\"]*)\" in the email field and \"([^\"]*)\" in the telephone field$")
	public void user_enters_in_the_email_field_and_in_the_telephone_field(String arg1, String arg2) throws Throwable {

		RegiPOM TypeEmail_Tel = new RegiPOM(driver);
		TypeEmail_Tel.EmailFL().sendKeys(arg1);
		TypeEmail_Tel.Telephone().sendKeys(arg2);

	}

	@When("^user enters  \"([^\"]*)\" in the password field and \"([^\"]*)\" password confirmation field$")
	public void user_enters_in_the_password_field_and_password_confirmation_field(String arg1, String arg2) throws Throwable {

		RegiPOM TypePass = new RegiPOM(driver);
		TypePass.PasswordFL().sendKeys(arg1);
		TypePass.ConFirmPass().sendKeys(arg2);

	}

	@When("^user selects Privacy Policy Field$")
	public void user_selects_Privacy_Policy_Field() throws Throwable {

		RegiPOM Select_Policy = new RegiPOM(driver);
		Select_Policy.PrivacyPolicy().click();

	}

	@When("^user Click on Continue button$")
	public void user_Click_on_Continue_button() throws Throwable {

		RegiPOM Click_Cont = new RegiPOM(driver);
		Click_Cont.ContButton().click();

	}

	@Then("^user Account should get successfully created$")
	public void user_Account_should_get_successfully_created() throws Throwable {

	}


}
