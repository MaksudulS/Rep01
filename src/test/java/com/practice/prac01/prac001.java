// SELENIUM CODING CLASS # 01, 08-20-2023

package com.practice.prac01;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac001 {
	
	@Test
	public void ron1() throws Exception
	{
		//SETTING UP SYSTEM:
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\m_sir\\eclipse-workspace\\prac01\\ChromeDriver\\chrome.exe");
		ChromeOptions obj = new ChromeOptions();// ChromeOptions class is given by Selenium. Creating object of the class.
		obj.addArguments("--remote-allow-origins=*");// "Allow" permission required.
		
		//CREATING OBJECT OF WebDriver: Name of the object should be always "driver".
		WebDriver driver = new ChromeDriver();// WebDriver and ChromeDriver: Father and Child relation.
		driver.get("http://google.com");// Launching the web site: "google.com".
		
		driver.manage().window().maximize();// To maximize the window size.
		
		WebElement x = driver.findElement(By.id("APjFqb"));// Locator of the WebElement.
		x.sendKeys("What is Java?");// Searching for: "What is Java?"
		//OTHER WAY: driver.findElement(By.id("APjFqb")).sendKeys("What is Java?");
		
		//CLOSING WINDOW(S): "close" will close current/facing window only, "quit" will close multiple windows.
		Thread.sleep(5000);// Time in milliseconds to close the window.
		driver.close();
	}

}

