package com.steps;

import com.pojo.FacebookPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStepDefitionSceOutline extends BaseClass {
	
	    FacebookPojo fbpojo;
		@Given("user need to be in fblogin page")
		public void user_need_to_be_in_fblogin_page() {
			loadUrl("https://www.facebook.com/");
			fbpojo = new FacebookPojo();
			btnClick(fbpojo.getLanguage());

		}

		@When("user enters {string} and {string}")
		public void user_enters_and(String user, String pass) {
			typeInput(fbpojo.getUserName(),user );
			typeInput(fbpojo.getPassword(),pass);

		}

		@When("user clicks fblogin button")
		public void user_clicks_fblogin_button() {
			btnClick(fbpojo.getLogIn());
		}

		@Then("user reenters in fblogin page")
		public void user_reenters_in_fblogin_page() {
			System.out.println("User will navigate to reenter login page");
			pageQuit();
		}




}
