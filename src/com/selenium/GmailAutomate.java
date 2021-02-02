package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomate {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();    // ask to maximize the window .. 
		Thread.sleep(1000);
		//Anything on a webpage is a web element 
		
		driver.findElement(By.id("identifierId")).sendKeys("hs49017@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		String at = driver.getTitle();
		String et = "gmail";
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test successful ..");
		}
		else {
			System.out.println("Test Failure..");
		}
		
		
		
	}

}
