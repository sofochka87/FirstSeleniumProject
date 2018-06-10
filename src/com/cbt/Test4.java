package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				
				"C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
		        
			    WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://testing-ground.scraping.pro/login");
	
	/*
	 * 1) Enter username "tutorial"
	 * 2) Enter password "tutorial"
	 * verify title contains "Find a Flight"
	 * */
	// findElement() => finds elements on a page
	//locator => is a way of finding element on a page
	//locators represented in a class called "BY"
	//By.name("userName")
	driver.findElement(By.name("usr")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("12345");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='submit']")).click(); // clicks
	
	String expected = "Testing";
	String actual = driver.getTitle();
	if(actual.contains(expected)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
		System.out.println("Expecteed:\t"+ expected);
		System.out.println("Actual: \t" + actual);
	}
	
	
	}
}


