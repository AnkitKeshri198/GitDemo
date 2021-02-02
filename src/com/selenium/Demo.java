package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// call Web driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANKIT\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		// instantiate driver Object
		WebDriver driver =new ChromeDriver();
		
		// work with URL (get facebook URL )
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		
		driver.manage().window().maximize();
		
		// Set day
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		Thread.sleep(2000);
		d.selectByIndex(3);
		
		//Set month
		
		WebElement month = driver.findElement(By.id("month"));
		Select e = new Select(month);
		Thread.sleep(2000);
		e.selectByVisibleText("Dec");
		
		//Set Year
		
		WebElement year = driver.findElement(By.id("year"));
		Select f = new Select(year);
		Thread.sleep(2000);
		f.selectByValue("1997");
		

	}

}
