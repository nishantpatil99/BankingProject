package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class BankHomePagePom extends BaseClass {
	
	public BankHomePagePom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@name='emailid']")
	WebElement EmailID;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement SubmitButton;
	
	public void setEmailID(String email) {		
		EmailID.sendKeys(email);
	}
	
	public CredentialPagePom clickOnSubmit() {
		SubmitButton.click();
		return new CredentialPagePom();
	}
	

}
