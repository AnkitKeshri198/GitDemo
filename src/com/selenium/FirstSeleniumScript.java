package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	// 	driver.manage().window().maximize();  // optional line 
		driver.manage().deleteAllCookies();  // optional line 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // optional line 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // optional line 
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("keshari.ankit114@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("marshalinvisible");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Facebook Login Done ...!!");

	}

}
