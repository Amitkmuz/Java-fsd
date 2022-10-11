package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\eclipse-workspace\\JavaFSD_Phase5\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://localhost:8080/AutomateWebApplication/signup.jsp");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//signup validation
		WebElement emailRef = wd.findElement(By.id("n3"));
		emailRef.sendKeys("raj@gmail.com");
		WebElement passRef = wd.findElement(By.id("n4"));
		passRef.sendKeys("123");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebElement subButRef = wd.findElement(By.id("b2"));
		subButRef.click();
		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		WebElement h2withId = wd.findElement(By.id("abc"));
		System.out.println(h2withId.getText());
		System.out.println();
		wd.navigate().back();
		WebElement aRef = wd.findElement(By.id("a2"));
		aRef.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//login validation
//		WebElement emailRef1 = wd.findElement(By.id("n1"));
//		emailRef1.sendKeys("raj@gmail.com");
//		WebElement passRef1 = wd.findElement(By.id("n2"));
//		passRef1.sendKeys("123");
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		WebElement subButRef1 = wd.findElement(By.id("b1"));
//		subButRef1.click();
//		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
//		WebElement h2withId1 = wd.findElement(By.id("log"));
//		System.out.println(h2withId1.getText());
//		wd.close();
		
		//login validation with wrong credentials
//		WebElement emailRef1 = wd.findElement(By.id("n1"));
//		emailRef1.sendKeys("anu@gmail.com");
//		WebElement passRef1 = wd.findElement(By.id("n2"));
//		passRef1.sendKeys("1234");
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		WebElement subButRef1 = wd.findElement(By.id("b1"));
//		subButRef1.click();
//		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
//		WebElement h2withId1 = wd.findElement(By.id("log"));
//		System.out.println(h2withId1.getText());
//		wd.close();
		
		//login validation with empty emailid
//		WebElement passRef1 = wd.findElement(By.id("n2"));
//		passRef1.sendKeys("123");
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		WebElement subButRef1 = wd.findElement(By.id("b1"));
//		subButRef1.click();
//		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
//		WebElement h2withId1 = wd.findElement(By.id("log"));
//		System.out.println(h2withId1.getText());
//		wd.close();
		
		//login validation with empty password
		WebElement emailRef1 = wd.findElement(By.id("n1"));
		emailRef1.sendKeys("raj@gmail.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebElement subButRef1 = wd.findElement(By.id("b1"));
		subButRef1.click();
		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		WebElement h2withId1 = wd.findElement(By.id("log"));
		System.out.println(h2withId1.getText());
		wd.close();
	}

}
