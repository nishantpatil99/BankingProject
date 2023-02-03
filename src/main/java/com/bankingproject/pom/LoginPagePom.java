package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class LoginPagePom extends BaseClass {
	
	public LoginPagePom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@name='uid']")
	WebElement userID;
	
	@FindBy(xpath ="//input[@name='password']")
	WebElement password1;
	
	@FindBy(xpath ="//input[@name='btnLogin']")
	WebElement loginbutton;
	
	@FindBy(xpath ="//input[@name='btnReset']")
	WebElement resetButton;
	
	@FindBy(xpath ="//a[text()='here']")
	WebElement getCredentialLink;

	
	public void setUsername(String userid) {
		userID.sendKeys(userid);
		
	}
	
	public void setPassword(String password) {
		password1.sendKeys(password);
	}
	
	public ManagerHomePagePom clickOnLoginButton() {	
		loginbutton.click();
		return new ManagerHomePagePom();		
	}
	
	public BankHomePagePom clickOnGetCredential() {
		getCredentialLink.click();
		return new BankHomePagePom();		
	}
	
}
	