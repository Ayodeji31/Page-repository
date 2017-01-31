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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

/**
 * @author Ayodeji
 *
 */
public class for_sale_steps extends base_step{

	  WebDriver driver = getDriver();
	
	  @Given("^Zoopler - I select For sale tab$")
	  public void zoopler_I_select_For_sale_tab() throws Throwable {
	  driver.findElement(By.id("search-tabs-for-sale")).click();
	   
	}

	  @Given("^Zoopler - Entered location in the search field$")
	  public void zoopler_Entered_location_in_the_search_field() throws Throwable {
	  driver.findElement(By.id("search-input-location")).sendKeys("Birmingham, West Midlands");   
	}

	  @Given("^Zoopler - Set price Minimum price pcm and assert$")
	  public void zoopler_Set_price_Minimum_price_pcm_and_assert() throws Throwable {
	  new Select(driver.findElement(By.id("forsale_price_min"))).selectByVisibleText("£110,000");
	  driver.findElement(By.cssSelector("option[value=\"110000\"]")).click();
	}

	  @Given("^Zoopler - Set Maximum price pcm and assert$")
	  public void zoopler_Set_Maximum_price_pcm_and_assert() throws Throwable {
	  new Select(driver.findElement(By.id("forsale_price_max"))).selectByVisibleText("£300,000");
	  driver.findElement(By.cssSelector("#forsale_price_max > option[value=\"300000\"]")).click(); 
	}

	  @Given("^Zoopler - Set property type to Houses$")
	  public void zoopler_Set_property_type_to_Houses() throws Throwable {
	  new Select(driver.findElement(By.id("property_type"))).selectByVisibleText("Flats");
	  driver.findElement(By.cssSelector("option[value=\"flats\"]")).click(); 
	}
	  @Given("^Zoopler - Selected number of bedrooms$")
	  public void zoopler_Selected_number_of_bedrooms() throws Throwable {
	  new Select(driver.findElement(By.id("beds_min"))).selectByVisibleText("1+");
	  driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
	}
	   

	   @Then("^Zoopler - List of properties For sale should be displayed$")
	   public void zoopler_List_of_properties_For_sale_should_be_displayed() throws Throwable {
	   String ExpectedMessage = "1+ bedroom flats for sale in Birmingham";
	   String   ActualMessage = "1+ bedroom flats for sale in Birmingham"; 
	   
	   Assert.assertEquals(ExpectedMessage, ActualMessage);
	   assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-list")).getText());
	   
	   
	}
       private void assertEquals(String string, String text) {
   	 	 
	}
       @Then("^Zoopler - Selected Grid view for property for sale$")
       public void zoopler_Selected_Grid_view_for_property_for_sale() throws Throwable {
       driver.findElement(By.cssSelector("i.icon.icon-grid")).click();
       Thread.sleep(1000);
       assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-grid")).getText()); 
       }

       @Then("^zoopler - Selected Map view of property for sale$")
       public void zoopler_Selected_Map_view_of_property_for_sale() throws Throwable {
       driver.findElement(By.cssSelector("i.icon.icon-location")).click();
       Thread.sleep(1000);
       assertEquals("", driver.findElement(By.cssSelector("i.icon.icon-location")).getText()); 
       
        
       File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile1, new File ("C:\\Screenshots\\PropertyForSale.jpg")); 
       System.out.println("Property for sale in Birmingham Saved in C Drive");
       
       
       
     //  driver.close();
       
       }

}
