package com.cucumber.Zoopler;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Rent_Steps {
     WebDriver driver;
	
	@Given("^Zoopla - Am on the hompage$")
	public void zoopla_Am_on_the_hompage() throws Throwable {
	System.setProperty("Webdriver.Chromedriver", "C:\\chromedriver");
	driver = new ChromeDriver();
	driver.navigate().to("http://www.zoopla.co.uk/");
	driver.manage().window().maximize();
	}

	@And("^Zoopla - Am I cleared the cookies$")
	public void zoopla_Am_I_cleared_the_cookies() throws Throwable {
	driver.manage().deleteAllCookies();
//	Alert myAlert = driver.switchTo().alert();
//	myAlert.accept();
	}

	@And("^Zoopla - Rent - I selected the To rent$")
	public void zoopla_Rent_I_selected_the_To_rent() throws Throwable {
	driver.findElement(By.id("search-tabs-to-rent")).click();   
	}

	@And("^Zoopla - Location - I selected \"([^\"]*)\" property location$")
	public void zoopla_Location_I_selected_property_location(String location) throws Throwable {
	driver.findElement(By.id("search-input-location")).sendKeys(location);
	//driver.findElement(By.cssSelector("#search-input-location")).click();
	}

	@And("^Zopla - Price Min - I selced \"([^\"]*)\" Minimum price of property$")
	public void zopla_Price_Min_I_selced_Minimum_price_of_property(String MinPrice) throws Throwable {
	driver.findElement(By.id("rent_price_min_per_month")).sendKeys(MinPrice);
	driver.findElement(By.cssSelector("#rent_price_min_per_month")).click();
	}

	@Given("^Zoopla - Price Max - I selected \"([^\"]*)\" Maximum property price$")
	public void zoopla_Price_Max_I_selected_Maximum_property_price(String MaxPrice) throws Throwable {
	//new Select (driver.findElement(By.id("rent_price_max_per_month"))).selectByVisibleText(MaxPrice);
	driver.findElement(By.id("rent_price_max_per_month")).sendKeys(MaxPrice);
	driver.findElement(By.cssSelector("#rent_price_max_per_month")).click();
	}

	@Given("^Zoopla - Property type - Select \"([^\"]*)\" Property Type$")
	public void zoopla_Property_type_Select_Property_Type(String PropertyType) throws Throwable {
	new Select (driver.findElement(By.id("property_type"))).selectByVisibleText(PropertyType);
	driver.findElement(By.cssSelector("#property_type")).click();
	
	}

	@Given("^Zoopla - Bedrooms - I selected \"([^\"]*)\" Bedrooms$")
	public void zoopla_Bedrooms_I_selected_Bedrooms(String Bedroom) throws Throwable {
	new Select(driver.findElement(By.id("beds_min"))).selectByVisibleText(Bedroom);
	driver.findElement(By.cssSelector("#beds_min")).click();
	 
	}

	@When("^Zoopla - I hit search button$")
	public void zoopla_I_hit_search_button() throws Throwable {
	driver.findElement(By.id("search-submit")).click();
	}

	@Then("^Zoopla - List of properties should be displayed$")
	public void zoopla_List_of_properties_should_be_displayed() throws Throwable {
		 String ExpectedMessage = "Flats to rent in Portsmouth";
		 String ActualMessage = "Flats to rent in Portsmouth";
		 System.out.print("Flats to rent in Portsmouth ");  
		 Assert.assertEquals(ExpectedMessage, ActualMessage);
	driver.findElement(By.cssSelector("i.icon.icon-grid")).click();
	Thread.sleep(1000);
	driver.close();
		}
	 
	}


	
	

