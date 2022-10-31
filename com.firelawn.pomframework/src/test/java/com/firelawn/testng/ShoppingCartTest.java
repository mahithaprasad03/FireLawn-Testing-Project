package com.firelawn.testng;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.firelawn.generic.ScreenshotMethod;
import com.firelawn.generic.ExcelLibrary;
import com.firelawn.pages.ShoppingCart;
import com.firelawn.pages.SignInPage;

public class ShoppingCartTest extends BaseTest {
	
	@Test(dataProvider="signin",priority=0)
	public void signin(String email, String password){
		
	SignInPage rp = new SignInPage(driver);
	rp.signinClick();
	rp.enter_username(email);
	rp.proceedClick();
	rp.enter_password(password);
	rp.submitClick();
  }
	
	@Test(priority=1)
	public void addToCart() throws InterruptedException {
		
		try {
		ShoppingCart sc = new ShoppingCart(driver);
		Actions action = new Actions(driver);
		action.moveToElement(sc.women).build().perform();
		action.moveToElement(sc.tshirt).click().perform();
		action.moveToElement(sc.search).build().perform();
		sc.addClick();
		sc.msgClick();
//		sc.cartClick();
		}
		
		catch(Exception e) {
			
			System.out.println("Product already added");
			ScreenshotMethod image = new ScreenshotMethod();
			image.pageScreenshot(driver);
		}
	}
	
	@Test(priority=2)
	public void removeFromCart() throws InterruptedException {
		
		
		ShoppingCart sc = new ShoppingCart(driver);		
		sc.cartClick();
		sc.removeClick();
		sc.yesToRemoveClick();
		Thread.sleep(2000);
		ScreenshotMethod image = new ScreenshotMethod();
		image.pageScreenshot(driver);
		
	}	
	
	@DataProvider(name="signin")
	public Object[][] registerData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("firelawn_signin");		
	}	
	
}
