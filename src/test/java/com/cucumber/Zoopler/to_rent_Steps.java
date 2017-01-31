/**
 * 
 */
package com.cucumber.Zoopler;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * @author Ayodeji
 *
 */
 public class to_rent_Steps extends base_step{
 WebDriver driver = getDriver();


 @And("^Zoopler - I select To rent tab$")
 public void zoopler_I_select_To_rent_tab() throws Throwable {
 driver.findElement(By.id("search-tabs-to-rent")).click();
 Thread.sleep(2000);
}

 @And("^Zoopler - I entered location in the search field$")
 public void zoopler_I_entered_location_in_the_search_field() throws Throwable {
 driver.findElement(By.id("search-input-location")).sendKeys("Portsmouth, Hampshire");
    
}

 @Given("^Zoopler - Set price Min price pcm and assert$")
 public void zoopler_Set_price_Min_price_pcm_and_assert() throws Throwable {
 new Select(driver.findElement(By.id("rent_price_min_per_month"))).selectByVisibleText("£500 pcm");
 driver.findElement(By.cssSelector("option[value=\"500\"]")).click();
}

 @Given("^Zoopler - Set Max price pcm and assert$")
 public void zoopler_Set_Max_price_pcm_and_assert() throws Throwable {
 new Select(driver.findElement(By.id("rent_price_max_per_month"))).selectByVisibleText("£2,000 pcm");
 driver.findElement(By.cssSelector("#rent_price_max_per_month > option[value=\"2000\"]")).click();
   
}

 @Given("^Zoopler - Set property type to Flats$")
 public void zoopler_Set_property_type_to_Flats() throws Throwable {
 new Select(driver.findElement(By.id("property_type"))).selectByVisibleText("Flats");
 driver.findElement(By.cssSelector("option[value=\"flats\"]")).click();
    
}
 @Given("^Zoopler - I clicked Bedrooms$")
 public void zoopler_I_clicked_Bedrooms() throws Throwable {
 new Select(driver.findElement(By.id("beds_min"))).selectByVisibleText("Studio+");
 driver.findElement(By.cssSelector("option[value=\"0\"]")).click();
}


@Then("^Zoopler - List of to rent properties should be displayed$")
public void zoopler_List_of_to_rent_properties_should_be_displayed() throws Throwable {
 String ExpectedMessage = "Flats to rent in Portsmouth";
 String ActualMessage = "Flats to rent in Portsmouth";
 System.out.print("Flats to rent in Portsmouth ");  
 Assert.assertEquals(ExpectedMessage, ActualMessage);
 assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-list")).getText());  
}
private void assertEquals(String string, String text) {
	 
}
 @Then("^Zoopler - I selected Grid view$")
 public void zoopler_I_selected_Grid_view() throws Throwable {
 driver.findElement(By.cssSelector("i.icon.icon-grid")).click();
 Thread.sleep(1000);
 assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-grid")).getText());
	   
}
 
		
@Then("^zoopler - Selected Map view$")
 public void zoopler_Selected_Map_view() throws Throwable {
 driver.findElement(By.cssSelector("i.icon.icon-location")).click();
 Thread.sleep(1000);
 assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-location")).getText());
	   
 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(scrFile1, new File ("C:\\Screenshots\\PropertyToRent.jpg")); 
 System.out.println("Property to rent in Portsmouth Saved in C Drive");
 
 driver.close();
}



	
}
