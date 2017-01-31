/**
 * 
 */
package com.cucumber.Zoopler;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Ayodeji
 *
 */


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/html/"},
		features = "src/test/resource"
		)

public class Runner_Class {

}
