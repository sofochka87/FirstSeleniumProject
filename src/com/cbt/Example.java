package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
        
	    WebDriver driver = new ChromeDriver();
	        driver.get("http://www.etsy.com");
	        
	        
	}

}