package com.steps;

import org.junit.Assert;

import com.pojo.FacebookPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;

public class FbStepDefinition extends BaseClass {
	FacebookPojo fbpojo;
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
		loadUrl("https://www.facebook.com/");
		fbpojo = new FacebookPojo();
		btnClick(fbpojo.getLanguage());

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Exception {
		typeInput(fbpojo.getUserName(), readExcel(1, 0));
		String userValue = getsValue(fbpojo.getUserName());
		Assert.assertTrue(userValue.contains("imsabaris"));
		typeInput(fbpojo.getPassword(),readExcel(1, 1));
		String passValue = getsValue(fbpojo.getPassword());
		Assert.assertEquals("sabaris123", passValue);

	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		btnClick(fbpojo.getLogIn());
	}

	@Then("user reenters in login page")
	public void user_reenters_in_login_page() {
		System.out.println("User will navigate to reenter login page");
		pageQuit();
	}



}
