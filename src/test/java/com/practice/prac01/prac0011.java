package com.practice.prac01;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;



public class prac0011 {
	
	@Test
	
public void ron2() throws Exception {
	
	//SYSTEM SETUP
	System.setProperty("Webdriver.chrome.driver", "C:\\ChromeDriver\\chrome-win64\\chrome.exe");
	ChromeOptions obj = new ChromeOptions();
	obj.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://Google.com");
	
	driver.manage().window().maximize();
	
	WebElement x = driver.findElement(By.id("APjFqb"));
	x.sendKeys("Tomorrow's weather in Los Angeles?");
	//x.click(By.xpath();
	
	Thread.sleep(20000);
	driver.close();
	
	
}
}