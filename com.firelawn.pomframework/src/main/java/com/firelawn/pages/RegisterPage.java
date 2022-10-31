package com.firelawn.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinLink;
	
	public void clickSignIn() {
		
		clickAction(signinLink);		
	}
	
	@FindBy(xpath="//span[text()='Create Account']")
	WebElement createAccount;
	
	public void clickCreateAccount() {
		
		clickAction(createAccount);
	}
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	public void enter_firstName(String value){
		
		enterValue(firstName,value);
	}
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	public void enter_lastName(String value){
	
		enterValue(lastName,value);
	}
	
	@FindBy(xpath="//input[@value='female']")
	WebElement female;
	
	public void clickFemale() {
		
		clickAction(female);
	}
	
	@FindBy(xpath="//input[@value='male']")
	WebElement male;
	
	public void clickmale() {
		
		clickAction(male);
	}
	
	@FindBy(xpath="//input[contains(@value,'disclose')]")
	WebElement noDisclose;
	
	public void clicknoDisclose() {
		
		clickAction(noDisclose);
	}
	
	@FindBy(id="phoneNumber")
	WebElement phoneNumber;
	
	public void enter_phoneNumber(String value){
	
		enterValue(phoneNumber,value);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	public void enter_email(String value){
		
		enterValue(email,value);
	}
	
	@FindBy(id="outlined-adornment-password")
	WebElement password;
	
	public void enter_password(String value) {
		
		enterValue(password,value);
		
	}
	
	@FindBy(xpath="//div[@id='demo-simple-select-placeholder-label'][1]")
	WebElement countryClick;
	
	public void clickCountry() {
		
		clickAction(countryClick);
	}
	
	@FindBy(xpath="//label[text()='State']/../div")
	WebElement stateClick;	
	
	public void clickState() {
		
		clickAction(stateClick);
	}
	
	
	@FindBy(xpath="//label[text()='city']/../div")
	WebElement cityClick;
	
	public void clickCity() {
		
		clickAction(cityClick);
	}
	
	@FindBy(css="g#Group_7293")
	public
	WebElement firelawn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement terms;
	
	public void clickTerms() {
		
		clickAction(terms);
	}
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	WebElement register;
	
	public void clickRegister() {
		
		clickAction(register);
		
	}
}
