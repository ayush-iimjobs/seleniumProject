package com.crm.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Bank_and_Finance_page;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class Banking_and_finance_test extends TestBase {

	LoginPage loginPage;

	HomePage homePage;
	TestUtil testUtil;
	Bank_and_Finance_page bank_and_finance_page;
	public Banking_and_finance_test() {

		super();

	}
	
	
	@BeforeMethod
	public void setUp() {

		initialization();
		
		testUtil = new TestUtil();
		bank_and_finance_page= new Bank_and_Finance_page();
		
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("Email")	, prop.getProperty("password"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[1]/header/div/div/div[3]/div/div[1]/div/div/div[1]/a/button")
		));



		
		bank_and_finance_page =homePage.clickOnBank_and_Finance();
		
	
}
	
	
	@Test(priority=1)
	
	public void verifybank_and_finance_page_label() {
		
		
		Assert.assertTrue(bank_and_finance_page.verifyBank_and_Finance_label(),"Banking and finance label is missing from the page ");
		
		
		
	}
	
	
	@Test(priority = 2)
	public void select_bank_and_finance_page_dropdown() {
		
		
		bank_and_finance_page.hoverAndMoveToDropDown("//div/a/button[contains(text(),'Banking & Finance')]", "//*[@id=\"menu-list-grow\"]/div/ul/li[2]/a");
		
		
		
		
		
	}
	
	
		
		
		
	
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
	
}
	
	
	
