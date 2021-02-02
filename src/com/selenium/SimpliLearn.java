package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpliLearn {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println("Browser Launched ...");
		
	}
	
	public void searchProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("JBL Speakers");
		//driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Daily Deals")).click();
		
		System.out.println("All programs activated ...");
		
	}
	
	public void navigate() throws InterruptedException {
		Thread.sleep(1500);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		System.out.println("Came back to  "+driver.getTitle());
		System.out.println("Done Project  ...!!!");
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		SimpliLearn obj = new SimpliLearn();
		obj.launchBrowser();
		obj.searchProduct();
		obj.navigate();
	}

}
