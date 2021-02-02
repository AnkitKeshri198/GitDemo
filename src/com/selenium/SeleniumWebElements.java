package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		// instantiate driver Object
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Maximizing the current webpage
		driver.manage().window().maximize();
		
		
		Thread.sleep(1500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(1500);
		
		System.out.println("Searching Product");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		System.out.println("Found your product details ..");
		
		Thread.sleep(1500);
		driver.findElement(By.linkText("SAMSUNG")).click();
		System.out.println("Jumping to samsung  ");
		
		//Navigating to another webpage 
		Thread.sleep(1000);
		driver.navigate().to("https://www.myntra.com/");
		System.out.println("Came to flipkart");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		System.out.println("Came back to amazon");
		Thread.sleep(500);
		driver.quit();
	

	}

}
