package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DealsHomePagePOM;
import com.nexttechitc.Pageobjectmodel.DellAcitionServicePOM;
import com.nexttechitc.Pageobjectmodel.DellActionDealsPOM;
import com.nexttechitc.Pageobjectmodel.DellActionSuppotPOM;
import com.nexttechitc.Pageobjectmodel.ServiceHomePagePOM;
import com.nexttechitc.Pageobjectmodel.SupportHomePagePOM;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellActionService {

	WebDriver driver;

	@Before()

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@After()

	public void teardown() {
		driver.quit();
	}

	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {

		driver.get("https://www.dell.com/en-us");

	}

	@When("^user go to service dropdown menu and able to see View All Service$")
	public void user_go_to_service_dropdown_menu_and_able_to_see_View_All_Service() throws Throwable {

		Actions act = new Actions(driver);//object
		DellAcitionServicePOM ser = new DellAcitionServicePOM(driver);
		act.moveToElement(ser.service()).build().perform();
		Thread.sleep(5000);

		ser.viewallservice().click();
		Thread.sleep(3000);
	}


	@Then("^user redirects to view all service$")
	public void user_redirects_to_view_all_service() throws Throwable {

		ServiceHomePagePOM ServiceHome = new ServiceHomePagePOM(driver);
		System.out.println(ServiceHome.ServiceHome_Displayed().isDisplayed());
		Thread.sleep(3000);
	}

	@When("^user navigates to Support dropdown menu and able to see Support Home option$")
	public void user_navigates_to_Support_dropdown_menu_and_able_to_see_Support_Home_option() throws Throwable {

		Actions support_act = new Actions(driver);
		DellActionSuppotPOM Actsupport = new DellActionSuppotPOM(driver);
		support_act.moveToElement(Actsupport.Nav_Support()).build().perform();
		
		Actsupport.Support_tab().click();
		Thread.sleep(3000);

	}


	@Then("^user redirects to Support Home  page$")
	public void user_redirects_to_Support_Home_page() throws Throwable {
		SupportHomePagePOM HP = new SupportHomePagePOM(driver);
		System.out.println(HP.SupportHome_Displayed().isDisplayed());

		Thread.sleep(3000);
	}

	@When("^user navigates to Deals dropdown menu and able to see View All Deals option$")
	public void user_navigates_to_Deals_dropdown_menu_and_able_to_see_View_All_Deals_option() throws Throwable {

		Actions dealAct =new Actions(driver);
		DellActionDealsPOM deals = new DellActionDealsPOM (driver);
		dealAct.moveToElement(deals.Nav_Deals()).build().perform();

		deals.Deals_tab().click();
		Thread.sleep(3000);
	}


	@Then("^user redirects to View All Deals page$")
	public void user_redirects_to_View_All_Deals_page() throws Throwable {

		DealsHomePagePOM DealHP =new DealsHomePagePOM(driver);
		System.out.println(DealHP.HomePageDisplayed().isDisplayed());

	}

}
