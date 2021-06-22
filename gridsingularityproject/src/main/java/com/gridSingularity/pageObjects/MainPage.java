package com.gridSingularity.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gridSingularity.helper.WaitHelper;

public class MainPage {
	
	private WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	WebElement Email;

	@FindBy(xpath="//input[@id='password']")
	WebElement Password;

	@FindBy(xpath="//div[contains(@class,'button button--accent')]/input")
	WebElement loginButton;

	@FindBy(xpath="//input[@id='icon_projects']")
	WebElement projectTab;

	//button__label
	//div[contains-token(@class, 'button__label')]
	//input [@class=’button__label’]

	@FindBy(xpath="//*[contains(@class, ‘button__label)]")
	WebElement newProject;

	@FindBy(xpath="//input[@id='input-field-name']")
	WebElement newProjectName;

	@FindBy(xpath="//input[@id='textarea-field-nameTextArea']")
	WebElement newProjectDesc;

//Note this gets enabled only after name and desc are entered
	@FindBy(xpath="//*[contains(@class, ‘button button--accent)]")
	WebElement newProjectAddBtn;

	@FindBy(xpath="//*[contains(@class, ‘icon-carat)]")
	WebElement createdProjectIcon;

	@FindBy(xpath="//*[contains(@class, ‘button button--accent button-icon saved-project__button--new-simulation)]")
	WebElement newSimulationBtn;
	
	WaitHelper waitHelper;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}

	public void clickOnNewProject()
	{
		newProject.click();
	}

	public void clickOnCreatedProjectIcon()
	{
		createdProjectIcon.click();
	}


	public void clickOnNewSimulationBtn()
	{
		newSimulationBtn.click();
	}

	
	public void clickSignInButton(){
		Actions builder = new Actions(driver);
		builder.moveToElement(SignInfromNav).build().perform();
		SignInfromNav.click();
	}

	//Not using this method
	public void clickLogoutButton(){
		Actions builder = new Actions(driver);
		builder.moveToElement(SignInfromNav).build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", logoutBtn);;
	}
}
