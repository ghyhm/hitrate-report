package com.hitrate.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.hitrate.cucumber.EmbeddedTomcat;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private EmbeddedTomcat tomcat = new EmbeddedTomcat();
	private WebDriver driver;

	@Given("^there are the following valid users$")
	public void there_are_the_following_valid_users(DataTable arg1) throws Throwable {
	}

	@When("^I login with below user$")
	public void i_login_with_below_user(DataTable arg1) throws Throwable {
	}

	@Then("^I should go to Hit Rate report$")
	public void i_should_go_to_Hit_Rate_report() throws Throwable {
	}

	@Then("^I cannot access Hit Rate report$")
	public void i_cannot_access_Hit_Rate_report() throws Throwable {
	}
	
	@Before
	public void startUp() {
		tomcat.start();
		tomcat.deploy("hitrate-report");
		driver = new HtmlUnitDriver();
		driver.get(tomcat.getApplicationUrl("hitrate-report"));
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
