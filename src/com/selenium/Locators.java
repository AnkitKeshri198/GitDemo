package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	//	driver.get("https://www.google.com");
		
		// ID Locator
		
		Thread.sleep(2000);
		//	driver.findElement(By.linkText("Gmail")).click();
		//	Thread.sleep(2000);
		//	driver.findElement(By.linkText("Sign in")).click();
		//	Thread.sleep(2000);
		
		// Name Locator 
		
		//	driver.findElement(By.name("q")).sendKeys("David Warner");
		//	Thread.sleep(1500);
		//	driver.findElement(By.name("btnK")).click();
		
		// LinkText Locator 
		
		driver.get("https://login.yahoo.com/");
		//		Thread.sleep(2000);
		//		driver.findElement(By.linkText("Help")).click();
		//		Thread.sleep(2000);
		
		// Css Selector
		
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("Hello");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#login-signin")).click();
		
		
		// xpath Locator
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Marshal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		
		
		
		
	}

}
