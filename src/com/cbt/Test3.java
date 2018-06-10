package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				
				"C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
		        
			    WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.cybertekschool.com");
	Thread.sleep(2000);
	
	/*Closes the current tab	 * */
	 //driver.close(); 

	driver.quit();
	
	
	}
}
