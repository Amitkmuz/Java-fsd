package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignIn {
	WebDriver wd;
  @Test
  public void signinTest() {
	  wd.get("https://cupsofmagik.com/account/login");
	  wd.manage().window().maximize();
	  WebElement emailRef = wd.findElement(By.name("customer[email]"));
	  emailRef.sendKeys("amit@gmail.com");
	  WebElement passRef = wd.findElement(By.name("customer[password]"));
	  passRef.sendKeys("123");
	  WebElement subButRef = wd.findElement(By.className("btn"));
	  subButRef.click();
	  String url = wd.getCurrentUrl();
	  if(url.equals("https://cupsofmagik.com/challenge")) {
		  System.out.println("Invalid Username or Password");
	  }
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
