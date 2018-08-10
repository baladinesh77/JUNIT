package com.syntel;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PopupTest {
  @Test
  public void test3() {
	  WebDriver driver;
		String geckoDriverKey="webdriver.chrome.driver";
		String geckoDriverPathValue="d:\\soft\\chromedriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(options);
		
		driver.get("file:///D:/web/PopUpWinDemo.html");
		delay(2000);
		WebElement btn = driver.findElement(By.id("newwindow"));
		assertEquals(btn.getText(), "Open in new window");
		delay(2000);
		
		btn.click();
		Set<String> handles =  driver.getWindowHandles();
		assertTrue(handles.size()>1,"No Popup created!");
		delay(3000);
		driver.close();
		
  }
  
  private void delay(int ms) {
	  try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
}
