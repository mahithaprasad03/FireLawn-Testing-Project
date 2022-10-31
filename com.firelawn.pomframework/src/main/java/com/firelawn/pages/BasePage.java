package com.firelawn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.firelawn.generic.UtilityMethods;

public class BasePage extends UtilityMethods {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

}
