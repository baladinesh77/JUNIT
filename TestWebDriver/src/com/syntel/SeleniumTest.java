package com.syntel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void test1() {
		WebDriver driver;
		String geckoDriverKey="webdriver.gecko.driver";
		String geckoDriverPathValue="d:\\soft\\geckodriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		
		FirefoxOptions options = new FirefoxOptions();
		
		driver = new FirefoxDriver(options);
		
	    driver.get("http://google.com");
	    
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	  
  }
}
