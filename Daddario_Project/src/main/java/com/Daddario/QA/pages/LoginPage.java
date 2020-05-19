package com.Daddario.QA.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daddario.QA.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//div[@class='header-icon' and @tabindex=0]")
	WebElement Hover;
	@FindBy(xpath= "//a[@href=\\\"https://integration.daddario.com/Login/?ReturnUrl=/\\\"]")
	WebElement LoginBtn;
	@FindBy(id="logonIdentifier")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="next")
	WebElement clicksignin;
	@FindBy(xpath="/html/body/header/div/div[1]/span[2]/a/img")
	WebElement Daddariologo;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
		public String ValidateTitle() {
		return driver.getTitle();
	}

public boolean Validatelogo() {
	return Daddariologo.isDisplayed();
}
		public void login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			clicksignin.click();

		}	

}
