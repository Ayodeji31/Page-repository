/**
 * 
 */
package com.cucumber.Zoopler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ayodeji
 *
 */
public class base_step {
	
static WebDriver driver;

protected WebDriver getDriver(){
	if (driver == null){
		System.setProperty("Webdriver.Chromedriver", "C:\\chromedriver");
		driver = new ChromeDriver();
	}
	return driver;
}

}
