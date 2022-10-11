package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Kumar\\phase5\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		wd.get("http://127.0.0.1:5500/Selenium/login.html");
		
//		String sourceCurrentPagePath=wd.getCurrentUrl();
//		System.out.println(sourceCurrentPagePath);
//		
//		
//		WebElement emailIdRef=wd.findElement(By.id("n1"));
//		WebElement passwordRef=wd.findElement(By.id("n2"));
//		emailIdRef.sendKeys("amit@gmail.com");
//		passwordRef.sendKeys("123");
//		
//		
//		WebElement submitButtonRef=wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		String targetCurrentPagePath=wd.getCurrentUrl();
//		System.out.println(targetCurrentPagePath);
//		
//		WebElement h1TagRef=wd.findElement(By.tagName("h1"));
//		System.out.println(h1TagRef.getText());
//		
//		
//		//WebElement resetButtonRef=wd.findElement(By.id("b2"));
//		//resetButtonRef.click();
		
		
//		WebElement emailIdRef=wd.findElement(By.id("n1"));
//		WebElement passwordRef=wd.findElement(By.id("n2"));
//		WebElement submitButtonRef=wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		Alert alertRef=wd.switchTo().alert();
//		System.out.println(alertRef.getText());
//		alertRef.accept();
//		wd.close();
		
		
		WebElement emailIdRef=wd.findElement(By.id("n1"));
		WebElement passwordRef=wd.findElement(By.id("n2"));
		WebElement submitButtonRef=wd.findElement(By.id("b1"));
		emailIdRef.sendKeys("amit@gmail.com");
		passwordRef.sendKeys("123");
    	submitButtonRef.click();
		Alert alertRef=wd.switchTo().alert();
	    System.out.println(alertRef.getText());
		alertRef.accept();
		wd.close();

	}

}
