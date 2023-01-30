package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class CredentialPagePom extends BaseClass {
	
	public CredentialPagePom() {
		PageFactory.initElements(driver, this);
	}
	
	//table[@border='1']/tbody/tr[4]/td[2]
	
	@FindBy(xpath= "//table[@border='1']/tbody/tr[4]/td[2]")
	WebElement userID;
	
	@FindBy(xpath= "//table[@border='1']/tbody/tr[5]/td[2]")
	WebElement password;
	
	public void savecredentials() {
		String userid= userID.getText().trim();
		String passwordtext= password.getText().trim();
		System.out.println("User ID...." +userid);
		System.out.println("Password....." +passwordtext);
	}
	
	
}
