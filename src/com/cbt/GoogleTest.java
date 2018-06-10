package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		/*Open Chrome
		 * property: "webdriver.chrome.driver",
		 * "C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe"
		 * go to url www.google.com
		 * get() --> goes to a website
		 * verify title
		 * */
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//getTitle() --> get the title
		driver.get("http://www.google.com");
		
		String expected = "Google";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Pass");
		} else { System.out.println("Fail");
			System.out.println("Expected: \t"+ expected); 
			System.out.println("Actual: \t"+ actual);}
		
	}
}
