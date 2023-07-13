package com.shankar.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public abstract class SBaseTest {
	
	String testId;
	String testCaseName;
	public static WebDriver driver;
	
	public SBaseTest(String testId, String testCaseName ) {
		this.testId= testId;
		this.testCaseName=testCaseName;
	}
	
	
	public abstract void runTest() throws Exception;
	
	@Test
	public void testResult() throws Exception {
		runTest();
		
	}
	
	public static void getBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options= new ChromeOptions();
			
			driver = new ChromeDriver(options);
			driver.get(url);
				
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
			driver.get(url);
		}
		
	}

}
