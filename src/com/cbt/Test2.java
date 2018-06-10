package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver",
		
		"C:/Users/pizza/Documents/selenium dependencies/drivers/chromedriver.exe");
        
	    WebDriver driver = new ChromeDriver();
	        //*driver.get("http://www.google.com");
	        //navigate().to() == get(); =>>> same thing
	        driver.navigate().to("http://www.cybertekschool.com");
	        
	        String expected = "cybertekschool";
			String actual = driver.getCurrentUrl();
			System.out.println(actual);
			
			if(actual.contains(expected)) {
				System.out.println("Pass");
			} else { System.out.println("Fail");
				System.out.println("Expected: \t"+ expected); 
				System.out.println("Actual: \t"+ actual);  }
			
			
			/*Navigate to google.com
			verify url contains google*/
			
			driver.navigate().to("http://google.com");
			Thread.sleep(1000);
		//goes back to previous page
			driver.navigate().back();
			Thread.sleep(1000);
		// goes forward in browsing history
			driver.navigate().forward();
			Thread.sleep(1000);
		//refresh the current page
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.close();
			
			
	}

}
