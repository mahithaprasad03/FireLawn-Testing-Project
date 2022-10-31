package com.firelawn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinLink;
	
	public void signinClick() {
		
		clickAction(signinLink);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	public void enter_username(String value) {
		
		enterValue(username, value);
	}
	
	@FindBy(xpath="//span[text()='Proceed']")
	WebElement proceed;
	
	public void proceedClick() {
		
		clickAction(proceed);
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void enter_password(String value) {
		
		enterValue(password, value);
	}
	
	@FindBy(xpath="//span[text()='submit']")
	WebElement submit;
	
	public void submitClick() {
		
		clickAction(submit);
	}
	
	@FindBy(xpath="//button[@aria-label='close']")
	WebElement msg;
	
	public void msgClick() {
		
		clickAction(msg);
	}
	
	@FindBy(xpath="//div[text()='M']")
	WebElement account;
	
	public void accountClick() {
		
		clickAction(account);
	}
	
	
	@FindBy(xpath="//li[@role='menuitem'][7]")
	WebElement logout;
	
	public void logoutClick() {
		
		clickAction(logout);
	}	
}
