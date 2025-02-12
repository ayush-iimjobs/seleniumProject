package com.crm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div//div/p[contains(text(),'Ayush Singh')]")

	WebElement UserNameLabel;
	
	
	@FindBy(xpath = "//div/a/button[contains(text(),'Banking & Finance')]")
	
	
	WebElement Bank_and_Finance;

	@FindBy(xpath = "//a/button[contains(text(),\"Sales & Marketing\")]")

	WebElement Sales_and_Marketing;

	@FindBy(xpath = "//a/button[contains(text(),\"Consulting\")]")
	WebElement Consulting;

	@FindBy(xpath = "//a/button[contains(text(),\"SCM & Operations\")]")
	WebElement SCM_and_Operations;

	@FindBy(xpath = "//a/button[contains(text(),\"Legal\")]")

	WebElement Legal;

	@FindBy(xpath = "//a/button[contains(text(),\"BPO\")]")

	WebElement BPO;
	
	
	
	
	@FindBy(xpath = "//div/div/hr/following-sibling::a[contains(text(),'Courses')]")

	WebElement Courses;
	

	@FindBy(xpath= "//div//div/div[contains(text(),'Experience')]")

	WebElement Experience;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
	
	public Boolean verifyCorrectUserName() {
		
		return UserNameLabel.isDisplayed();
		
		
	}
	
	public  Bank_and_Finance_page clickOnBank_and_Finance() {
		
		Bank_and_Finance.click();
		
		return new Bank_and_Finance_page();
		
		
	}
	
	public SalesAndMarketingPage clickOnSalesAndMarketing() {
		
		Sales_and_Marketing.click();
		
		return new SalesAndMarketingPage();
	}
	
	public ConsultingPage clickOnConsulting() {
		
		Consulting.click();
		
		return new ConsultingPage();
	}
	
	public SCMAndOperationPage clickOnSCMAndOperation() {
		
		SCM_and_Operations.click();
		
		return new SCMAndOperationPage();
		
	}
	
	public LegalPage clickOnLegal() {
		
		Legal.click();
		
		return new LegalPage();
		
		
	}
	
	public BPOPage clickOnBPO() {
		
		BPO.click();
		
		return new BPOPage();
		
		
	}
	
	public CoursesPage clickOnCourses() {
		
		Courses.click();
		
		return new CoursesPage();
		
		
	}
	
	

	
	
	
	
	

	
	
	
	
	
//	public Bank_and_Finance_page clickOnBank_and_finance_page() {
//		Bank_and_Finance.click();
//		
//		return new Bank_and_Finance_page();
//		
//		
//		
//	}
	
//	public void clickOnExperience() {
//		
//		
//		Experience.click();
//	}
	
	
	
	
	
	

}
