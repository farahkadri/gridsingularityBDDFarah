package com.gridSingularity.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.gridSingularity.helper.WaitHelper;
import com.gridSingularity.pageObjects.MainPage;
import com.gridSingularity.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MainPageStepdef extends TestBase {

	MainPage loginPage = new MainPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		//waitHelper = new WaitHelper(driver);
	}


	@Then("^I click on sign in button and wait for sign in page$")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() throws Throwable {
		loginPage.clickSignInButton();
		waitHelper.WaitForElement(loginPage.userName, 60);
	}


	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		loginPage.enterUserName(arg1);
	}


	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^Click on Project tab$")
	public void click_on_Project_tab() {
		loginPage.clickOnNewProject();
	}

	@When("^Click on Create Project Icon$")
	public void click_on_Create_project() {
		loginPage.clickOnCreatedProjectIcon();
	}

	@When("^Click on New Simulation Button$")
	public void click_on_new_simulation() {
		loginPage.clickOnNewSimulationBtn();
	}

	@When("^I am logged in$")
	public void i_am_already_logged_in() throws Throwable {
	    loginPage.logoutBtn.isDisplayed();
	}

	@When("^I Click on Sign out$")
	public void i_Click_on_Sign_out() throws Throwable {
	    loginPage.clickLogoutButton();
	    waitHelper.WaitForElement(loginPage.userName, 60);
	}

	@Then("^I got log out from the application and land on sign in page$")
	public void i_got_log_out_from_the_application_and_land_on_sign_in_page() throws Throwable {
		loginPage.userName.isDisplayed();
	}
	

}