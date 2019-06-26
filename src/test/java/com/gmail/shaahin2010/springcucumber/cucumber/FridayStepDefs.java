package com.gmail.shaahin2010.springcucumber.cucumber;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FridayStepDefs extends SpringIntegrationTest {

	private String today;
	private String actualDay;

	@Given("^today is Sunday$")
	public void today_is_Sunday() throws Throwable {
		today = "Sunday";
	}

	@When("^I ask whether it's Friday yet$")
	public void i_ask_whether_it_s_Friday_yet() throws Throwable {
		actualDay = isItFridayService.isTodayFriday(today);
	}

	@Then("^I should be told \"([^\"]*)\"$")
	public void i_should_be_told(String arg1) throws Throwable {
		assertThat(arg1, equalTo(actualDay));
	}

	@Given("^today is Friday$")
	public void today_is_Friday() throws Throwable {
		today = "Friday";
	}

	@Given("^today is \"([^\"]*)\"$")
	public void today_is(String arg1) throws Throwable {
		today = arg1;
	}

}
