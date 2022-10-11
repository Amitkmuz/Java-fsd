package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DemoTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Kumar\\phase5\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		//WebDriver wd=new OperaDriver();
		//WebDriver wd=new InternetExplorerDriver();
		wd.get("http://127.0.0.1:5500/Selenium/index.html");
//		String titleTagContent=wd.getTitle();
//		String url=wd.getCurrentUrl();
//		String pageContent=wd.getPageSource(); 
//		System.out.println(titleTagContent);
//		System.out.println(url);
//		System.out.println(pageContent);
		
		WebElement h2TagRef=wd.findElement(By.tagName("h2"));
		WebElement pTagRef=wd.findElement(By.tagName("p"));
		WebElement divTagRef=wd.findElement(By.tagName("div"));
		System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
		System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
		System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
		
		List<WebElement> listOfPTag=wd.findElements(By.tagName("p"));
		Iterator<WebElement> ii=listOfPTag.iterator();
		while(ii.hasNext()) {
			WebElement ww=ii.next();
			System.out.println(ww.getTagName()+" "+ww.getText());
		}
		
		WebElement divTagUsingIdRef = wd.findElement(By.id("d1"));
		System.out.println(divTagUsingIdRef.getTagName()+" "+divTagUsingIdRef.getText());
		
		wd.close();
		

	}

}
