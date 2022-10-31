package com.firelawn.testng;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.firelawn.generic.ExcelLibrary;
import com.firelawn.pages.VoucherGeneratePage;

public class VoucherGenerateTest extends BaseTest {
	
	@Test(dataProvider="voucherSignin")
	public void voucherGenerate(String email,String password) throws InterruptedException {
		
		VoucherGeneratePage vc = new VoucherGeneratePage(driver);
		vc.voucherClick();
		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for(String tab: window) {
		driver.switchTo().window(tab);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		}
		
		vc.enter_email(email);
		vc.enter_password(password);
		vc.loginClick();
		vc.viewCouponClick();
		
		int count=0;
		for(WebElement element: vc.webtable) {
			
			System.out.println(element.getText());		
			count++;
		}
		//System.out.println(count);
		vc.nextPageClick();
		
		while(vc.nextPage.isEnabled()) {
		
		for(WebElement element: vc.webtable) {
			
			System.out.println(element.getText());	
			count++;
		}
		
		vc.nextPageClick();
		
		}
		System.out.println(count);
		
		vc.voucherLogoutClick();				
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	}
	
	@DataProvider(name="voucherSignin")
	public Object[][] registerData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("firelawn_signin");		
	}	

}
