package com.firelawn.testng;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.firelawn.generic.ExcelLibrary;
import com.firelawn.pages.SignInPage;

public class SignInTest extends BaseTest{

	@Test(dataProvider="signin")
	public void signin(String email, String password) throws InterruptedException{
		
	SignInPage rp = new SignInPage(driver);
	rp.signinClick();
	rp.enter_username(email);
	rp.proceedClick();
	rp.enter_password(password);
	rp.submitClick();
	rp.msgClick();
	rp.accountClick();
	rp.logoutClick();
	
	}
	
	@DataProvider(name="signin")
	public Object[][] registerData() throws IOException {
		ExcelLibrary lib=new ExcelLibrary();
		return lib.readMultipleData("firelawn_signin");		
	}	
}