package com.firelawn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage {
	
	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Women']")
	public
	WebElement women;
	
	@FindBy(xpath="//a[text()='Tshirts'][1]")
	public
	WebElement tshirt;
	
	@FindBy(id="searchbar")
	public
	WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'fashion2wear')]/../..//button[contains(text(),'cart')]")
	WebElement add;
	
	public void addClick() {
		
		clickAction(add);
	}
	
	@FindBy(xpath="//button[@aria-label='close']")
	WebElement msg;
	
	public void msgClick() {
		
		clickAction(msg);
	}
	
	@FindBy(xpath="//a[@class='navbar_cartIcon__Lqbph']")
	public
	WebElement cart;
	
	public void cartClick() {
		
		clickAction(cart);
	}
	
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	WebElement remove;
	
	public void removeClick() {
		
		clickAction(remove);
		
	}
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesToRemove;
	
	public void yesToRemoveClick() {
		
		clickAction(yesToRemove);
	}	

}
