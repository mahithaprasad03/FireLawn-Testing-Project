package com.firelawn.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.firelawn.pages.MainPage;

public class MainTest extends BaseTest{

	@Test
	public void menu_Men() {
		
		MainPage m = new MainPage(driver);
		
		Actions action = new Actions(driver);
		action.moveToElement(m.men).build().perform();
		
		for(WebElement element: m.mensWear) {
			
			action.moveToElement(element).click().perform();
			System.out.println(driver.getCurrentUrl());
		}
	}

}
