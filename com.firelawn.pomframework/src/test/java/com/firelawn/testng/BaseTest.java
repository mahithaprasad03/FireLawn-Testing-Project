package com.firelawn.testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.firelawn.generic.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements FrameworkConstants{
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void setUp(@Optional("chrome") String browserName) {
		
		if(browserName.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.contains("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			
			System.out.println("browser name not specified");
		}
		
		driver.manage().window().maximize();
		driver.get(FrameworkConstants.URL);		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		
		driver.quit();
	}
	

}

