package com.Daddario.QA.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Daddario.QA.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//div[@class='header-icon' and @tabindex=0]")
	WebElement Hover;
	@FindBy(xpath= "//a[contains(@href='https://integration.daddario.com/Login/?ReturnUrl=/create-account/')]")
	WebElement LoginBtn;

	public LoginPage() throws IOException {
		super();
		
	}

}
