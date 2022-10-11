package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageTest {
	WebDriver wd;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Kumar\\phase5\\chromedriver.exe");
	  wd=new ChromeDriver();
  }
	
  @Test
  public void loginPageTest() {
	  wd.get("http://127.0.0.1:5500/Selenium/login.html");
	  WebElement emailIdRef=wd.findElement(By.id("n1"));
	  WebElement passwordRef=wd.findElement(By.id("n2"));
	 
	  emailIdRef.sendKeys("amit@gmail.com");
	  passwordRef.sendKeys("123");
	  
	  WebElement submitButtonRef=wd.findElement(By.id("b1"));
  	  submitButtonRef.click();
		Alert alertRef=wd.switchTo().alert();
		String result=alertRef.getText();
		alertRef.accept();
		assertEquals(result,"successfully Login");
		
  }
  

  @AfterMethod
  public void afterMethod() {
	  wd.close();
  }

}
