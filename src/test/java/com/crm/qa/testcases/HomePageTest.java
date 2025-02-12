package com.crm.qa.testcases;

import java.time.Duration;

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

public class HomePageTest extends TestBase {

	LoginPage loginPage;

	HomePage homePage;
	TestUtil testUtil;
	
	Bank_and_Finance_page bank_and_finance_page;
	
	public HomePageTest() {

		super();

	}
	
	//test cases should be independent with each other
	//before each test case -- launch browser and login 
	//@test --execute test case 
	// after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {

		initialization();
		
		testUtil = new TestUtil();
		bank_and_finance_page= new Bank_and_Finance_page();
		
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("Email")	, prop.getProperty("password"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until the title is fully loaded (exact match)
		wait.until(ExpectedConditions.titleIs("My Jobfeed"));

	}

	@Test(priority=1)
	public void verifyHomePageTitleTest() {

		String homePageTitle =homePage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle,"My Jobfeed","Home Page title not matched");
		
		

	}
	
	@Test(priority=2)
	
	public void verifyUserNameTest() {
		
//		testUtil.switchToFrame();
		
		Assert.assertTrue(homePage.verifyCorrectUserName());
		
		
	}
	
	@Test(priority=3)
	public void verifyBank_and_Finance_page_link_test() {
		
		bank_and_finance_page = homePage.clickOnBank_and_Finance();
		
		homePage.clickOnBank_and_Finance();
		
		
	}
	
	
	
	
	
	

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
