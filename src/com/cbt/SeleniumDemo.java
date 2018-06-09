package com.cbt;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class SeleniumDemo {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
	        
	    WebDriver driver = new ChromeDriver();
	        driver.get("http://www.cybertekschool.com");
	        
	        WebDriver driver1 = new ChromeDriver();
	        driver.get("http://www.google.com");
	        
	        WebDriver driver2 = new ChromeDriver();
	        driver.get("http://www.amazon.com");
}
	}
