package com.bankingproject.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;

public class LoginPageTest extends BaseClass {
	
	@BeforeClass
	public void setup() {		
		launchWebsite();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void testTitle() {
		String pageTitle= driver.getTitle();
		if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page")) {
	
		System.out.println("We are on GTPL HomePage");
		}
		else {
			System.out.println("We are on Wrong Page");
		}
	}	
		
	@Test
	public void testURL() {
		String pageURL= driver.getCurrentUrl();
		if(pageURL.equalsIgnoreCase("https://demo.guru99.com/V1/index.php")) {
			System.out.println("Correct URL");
		}
			
		else {
			System.out.println("Incorrect URL");	
		}	
			
	}	
		
}


