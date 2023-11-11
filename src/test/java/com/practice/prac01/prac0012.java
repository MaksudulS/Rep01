package com.practice.prac01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class prac0012 {
	WebDriver driver;
	@Test
	public void ron3() throws Exception {
	
		System.setProperty("WebDriver.chrome.driver", "C:\\ChromeDriver\\chrome-win64\\chrome.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		WebElement x = driver.findElement(By.id("APjFqb"));
		x.sendKeys("Bangladesh Consulate in LA");
		//WebElement y = driver.findElement(By.name("btnK"));		
		//y.click();
		
		Thread.sleep(15000);
		driver.close();
		//((WebElement) driver).clear();	
}
}   