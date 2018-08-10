package com.syntel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestLink {
  @Test
  public void test2() {
	  WebDriver driver;
		String geckoDriverKey="webdriver.chrome.driver";
		String geckoDriverPathValue="d:\\soft\\chromedriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		
		driver.get("file:///D:/web/HyperlinkDemo.html");
		assertEquals(driver.getTitle(), "Locating Hyperlinks");
		
		//Trigger a click on FIRST link
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		assertEquals(driver.getTitle(), "Your Store");
		
		driver.navigate().back();
		assertEquals(driver.getTitle(), "Locating Hyperlinks");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
  }
}
