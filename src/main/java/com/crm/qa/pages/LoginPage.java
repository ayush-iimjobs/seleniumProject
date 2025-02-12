package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
	
	
	@FindBy(xpath="//*[@id='email-input']")
	WebElement Email;
	
	@FindBy(xpath="//*[@id='password-input']")
	WebElement password;
	
	@FindBy(xpath = "(//button[normalize-space(text=\"Login\")])[2]" )
	WebElement loginBtn;
	
	@FindBy(xpath="//*[normalize-space(text())='Sign up now!']")
	
	WebElement signUpBtn;
	
	@FindBy(xpath="//div/img[@alt=\"iimjobs\"]")
	
	WebElement iim_logo;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();		
		
		
	}
	
	public boolean validateIIMImage() {
		return iim_logo.isDisplayed();
		
		
	}
	
	public HomePage login(String userEmail , String pass) {
		
		Email.sendKeys(userEmail);
		password.sendKeys(pass);
		
		loginBtn.click();
		
		return new HomePage();
			
	}
	

	
	
	
	
	
	
	

}
