package com.firelawn.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VoucherGeneratePage extends BasePage {
	
	public VoucherGeneratePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Voucher']")
	WebElement voucher;
	
	public void voucherClick() {
		
		clickAction(voucher);
		
	}
	
	@FindBy(id="email")
	WebElement email;
	
	public void enter_email(String value) {
		
		enterValue(email, value);
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void enter_password(String value) {
		
		enterValue(password, value);
	}
	
	@FindBy(xpath="//button[text()='login']")
	WebElement login;
	
	public void loginClick() {
		
		clickAction(login);
	}
	
	@FindBy(xpath="//a[contains(text(),'View')]")
	WebElement viewCoupon;
	
	public void viewCouponClick() {
		
		clickAction(viewCoupon);
	}
	
	@FindBy(xpath="//div[@class='MuiDataGrid-cellContent']")
	public
	List<WebElement> webtable; 
	
	@FindBy(xpath="//button[contains(@title,'next')]")
	public
	WebElement nextPage;
	
	public void nextPageClick() {
		
		clickAction(nextPage);
	}
	
	@FindBy(xpath="//button[text()='logout']")
	WebElement voucherLogout;
	
	public void voucherLogoutClick() {
		
		clickAction(voucherLogout);
	}
		
	
}
