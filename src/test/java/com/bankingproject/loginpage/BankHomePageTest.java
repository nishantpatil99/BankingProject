package com.bankingproject.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.BankHomePagePom;

	public class BankHomePageTest extends BaseClass {
	
		@BeforeClass
		public void setup() {
			launchWebsite();
		driver.get("https://demo.guru99.com/");
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}
		
		@Test
		public void setEmail() throws InterruptedException {
			BankHomePagePom bankhomepage=new BankHomePagePom();
			bankhomepage.setEmailID();
			Thread.sleep(2000);
		}
		
		@Test
		public void clickOnSubmitButton() throws InterruptedException {
			BankHomePagePom bankhomepage=new BankHomePagePom();
			Thread.sleep(5000);
			bankhomepage.clickOnSubmit();
			
		}
}
