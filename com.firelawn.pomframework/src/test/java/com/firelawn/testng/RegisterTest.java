package com.firelawn.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.firelawn.generic.ExcelLibrary;
import com.firelawn.generic.ScreenshotMethod;
import com.firelawn.pages.RegisterPage;

public class RegisterTest extends BaseTest{

	@Test(dataProvider="register")
	public void register(String firstName, String lastName,String gender, String phoneNumber,String email, String password,String country, String state, String city) throws InterruptedException {
		
	RegisterPage rp = new RegisterPage(driver);
	
	rp.clickSignIn();
	rp.clickCreateAccount();
	rp.enter_firstName(firstName);
	rp.enter_lastName(lastName);
	
	if(gender.contains("female")) {
		rp.clickFemale();
	}
	
	else if(gender.contains("male")) {
		
		rp.clickmale();
	}
	
	else {
		
		rp.clicknoDisclose();
	}
	
	rp.enter_phoneNumber(phoneNumber);
	rp.enter_email(email);
	rp.enter_password(password);
	
	rp.clickCountry();
	
	//string xPathWithVariable = "(//div[@class='className'])" + "[" + i + "]";
	
//	Actions act = new Actions(driver);
	
	try {
	
	driver.findElement(By.xpath("//li[@data-value='"+ country +"']")).click();
	
// WebDriverWait wait = new WebDriverWait(driver,40);
//	
//	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//li[@data-value='"+ country +"']"))));
//	
//	act.click();
	
	//driver.findElement(By.xpath("//li[contains(@data-value,'"+ country +"')]")).click();
	

	Thread.sleep(2000);
	
	rp.clickState();	
	
	driver.findElement(By.xpath("//li[@data-value='"+ state +"']")).click();
	
	Thread.sleep(2000);
	
	rp.clickCity();
	
	driver.findElement(By.xpath("//li[@data-value='" + city +"']")).click();
	
	}
	
	catch(Exception e) {
		
		ScreenshotMethod image = new ScreenshotMethod();
		image.pageScreenshot(driver);
		Actions act = new Actions(driver);
		act.moveToElement(rp.firelawn).click().perform();
	}
	

	Thread.sleep(2000);
	rp.clickTerms();
	rp.clickRegister();
	
	}
	
	@DataProvider(name="register")
	public Object[][] registerData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("firelawn_register");		
	}
	
	
}