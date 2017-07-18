package cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
//	private WebDriver driver;

	@Given("^there are the following valid users$")
	public void there_are_the_following_valid_users(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@When("^I login with below user$")
	public void i_login_with_below_user(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@Then("^I should go to Hit Rate report$")
	public void i_should_go_to_Hit_Rate_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I cannot access Hit Rate report$")
	public void i_cannot_access_Hit_Rate_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
//	@Before
//	public void startUp() {
//		driver = new FirefoxDriver();
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
}
