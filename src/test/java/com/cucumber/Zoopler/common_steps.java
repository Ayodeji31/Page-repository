/**
 * 
 */
package com.cucumber.Zoopler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Ayodeji
 *
 */
public class common_steps extends base_step{

	WebDriver driver = getDriver();
	
	@Given("^Zoopler - I navigate to homepage$")
	public void zoopler_I_navigate_to_homepage() throws Throwable {
	   driver.navigate().to("http://www.zoopla.co.uk/");
	   driver.manage().window().maximize();
	}

	@And("^Zoopler - Common - I delete all cookies$")
	public void zoopler_Common_I_delete_all_cookies() throws Throwable {
		driver.manage().deleteAllCookies();
	    
	}

@When("^Zoopler - I clicked on search button$")
public void zoopler_I_clicked_on_search_button() throws Throwable {
	driver.findElement(By.id("search-submit")).click();
    Thread.sleep(1000);
}





}
