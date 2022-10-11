package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddtoCart {
	WebDriver wd;
  @Test
  public void AddCartTest() {
	  wd.get("https://cupsofmagik.com/");
	  wd.manage().window().maximize();
	  WebElement AddCartBut = wd.findElement(By.id("AddToCart-1602165198576"));
	  AddCartBut.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Kumar\\phase5\\chromedriver.exe");
		wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.close();
  }

}
