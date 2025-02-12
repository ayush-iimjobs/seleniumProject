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

public class Bank_and_Finance_page extends TestBase {
	
	HomePage homepage;

	@FindBy(xpath = "//div/h1[contains(text(),'Banking & Finance Jobs')]")

	WebElement bank_and_finance_label;

	public Bank_and_Finance_page() {

		PageFactory.initElements(driver, this);
	}

	public boolean verifyBank_and_Finance_label() {

		return bank_and_finance_label.isDisplayed();

	}

//	public void selectBankAndFinance(String name) {
//		
//		
//		
//		
////	    driver.findElement(By.xpath("//div//li/a[contains(text(),'" + name + "')]")).click();
//	}
	
	public void WaitForElementVisible(String xpathForElement , int timeInSeconds ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
		
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathForElement)));
		 
		 
		 
		 
		 
		 
		 
		
	}
	
	
	public  Bank_and_Finance_page  hoverAndMoveToDropDown(String mainElementXpath , String dropDownElementXpath) {
		
		
		Actions actions = new Actions(driver);
		
		WebElement mainElement = driver.findElement(By.xpath(mainElementXpath));
		actions.moveToElement(mainElement).perform();
		
		WaitForElementVisible(dropDownElementXpath, 10);
		
		 WebElement dropdownElement = driver.findElement(By.xpath(dropDownElementXpath));
		 actions.moveToElement(dropdownElement).click();
		 
//		 driver.findElement(By.xpath("//div//li/a[contains(text(),'" + name + "')]")).click();
		 
		 return new Bank_and_Finance_page();
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	}


}
