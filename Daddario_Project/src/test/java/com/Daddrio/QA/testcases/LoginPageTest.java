package com.Daddrio.QA.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Daddario.QA.base.TestBase;
import com.Daddario.QA.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;

	public LoginPageTest() throws IOException {
	super();
	
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialzation();
		loginpage= new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginpageTitletest() {
		String title = loginpage.ValidateTitle();  // this method ValidateTitle has came from TestBase class
		Assert.assertEquals(title, "D&#39;Addario");
	}
	
	@Test(priority=2)
	public void validateLogoTest() { // this method ValidateTitle has came from TestBase class
		boolean flag = loginpage.Validatelogo(); 
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
