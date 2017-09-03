package com.hitrate.cucumber.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.hitrate.cucumber.EmbeddedTomcat;
import com.hitrate.entity.Hitrate;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHitrateSteps {
	private EmbeddedTomcat tomcat = new EmbeddedTomcat();
	private WebDriver driver;

	@Given("^I have login as below user$")
	public void i_have_login_as_below_user(DataTable arg1) throws Throwable {
		WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("mandy");
		element = driver.findElement(By.name("login"));
		element.click();
	}

	@Given("^I have the following hit rate data$")
	public void i_have_the_following_hit_rate_data(DataTable arg1) throws Throwable {
		List<Hitrate> hitrates = Fixture.from(Hitrate.class).gimme(5, "valid");
	}

	@Given("^I have the following exclusion list$")
	public void i_have_the_following_exclusion_list(DataTable arg1) throws Throwable {
	}

	@When("^I search for hit rate on (\\d+)-(\\d+)-(\\d+)$")
	public void i_search_for_hit_rate_on(int arg1, int arg2, int arg3) throws Throwable {
	}

	@Then("^I should see the following hit rates$")
	public void i_should_see_the_following_hit_rates(DataTable arg1) throws Throwable {
	}
	
	@Before
	public void startUp() {
		tomcat.start();
		tomcat.deploy("hitrate-report");
		driver = new HtmlUnitDriver();
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "/Users/mandyyan/Downloads/geckodriver.exe");
		driver.get(tomcat.getApplicationUrl("hitrate-report"));
		
		FixtureFactoryLoader.loadTemplates("com.hitrate.fixture.templates");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
