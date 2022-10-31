package com.firelawn.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
	
	public MainPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[text()='Men']")
	public
	WebElement men;	
	
	@FindBy(xpath="//a[text()='Men']/..//li//a[contains(@href,'/sub-category')]")
	public
	List<WebElement> mensWear;

}
