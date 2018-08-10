package com.syntel;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void test1() {
		WebDriver driver;
		String geckoDriverKey="webdriver.chrome.driver";
		String geckoDriverPathValue="d:\\soft\\chromedriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		
		driver.get("http://demo.opencart.com");
		//Note (install firebug plugin in mozilla)
		//Step 3: Finding element by name and sending the key i.e input data
		driver.findElement(By.name("search")).sendKeys("MacBook");
		//Step 4: Finding element by id i.e button click
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		
		String title = driver.getTitle();
		if(!title.contains("MacBook")) {
			fail("Search failed!");
		}
		//Step : close the browser
		driver.close();//close the browser
	    
  }
}
