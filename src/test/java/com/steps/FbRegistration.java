package com.steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pojo.FbRegistrationPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

public class FbRegistration extends BaseClass {
	FbRegistrationPojo fbRegPojo;
	@Given("user has to be in login page")
	public void user_has_to_be_in_login_page() {
		loadUrl("https://www.facebook.com/");
		fbRegPojo = new FbRegistrationPojo();
		btnClick(fbRegPojo.getLanguage());
	}

	@Given("user has to click new account")
	public void user_has_to_click_new_account() {
		btnClick(fbRegPojo.getNewAccount());
	}

	@When("user has to enter firstname")
	public void user_has_to_enter_firstname(DataTable d) {
		Map<String, String> map = d.asMap(String.class, String.class);
		typeInput(fbRegPojo.getFirstName(), map.get("firstname"));
	    
	}

	@When("user has to enter lastname")
	public void user_has_to_enter_lastname(DataTable d) {
	    List<List<String>> lists = d.asLists();
	    List<String> value2 = lists.get(1);
	    typeInput(fbRegPojo.getLastName(),value2.get(0));
	}

	@When("user has to enter email or mobile")
	public void user_has_to_enter_email_or_mobile(DataTable d) {
	    List<Map<String,String>> list = d.asMaps();
	    Map<String, String> map = list.get(1);
	    String value = map.get("mobileoremail");
	    typeInput(fbRegPojo.getEmailOrMobile(), value);
	    Assert.assertTrue(value.contains("Greens@gmail.com"));	    
	}

	@When("user has to enter password")
	public void user_has_to_enter_password(DataTable d) {
	    List<String> list = d.asList();
	    typeInput(fbRegPojo.getPassword(), list.get(0));
	}

	@When("user has to select date of birth")
	public void user_has_to_select_date_of_birth() {
	    selectByText(fbRegPojo.getDay(), "25");
	    selectByText(fbRegPojo.getMonth(),"Aug");
	    selectByText(fbRegPojo.getYear(), "1994");
	}

	@When("user has to click gender")
	public void user_has_to_click_gender() {
		btnClick(fbRegPojo.getGender());	    
	}

	@When("user has to click signup")
	public void user_has_to_click_signup() throws IOException {
	   btnClick(fbRegPojo.getSignUp());
	   snapShot("C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/Screenshots/fbregister.png");
	}

	@Then("user enters the homepage")
	public void user_enters_the_homepage() throws IOException {
	    System.out.println("User enters into new page");
	    snapShot("C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/Screenshots/afterregister.png");
	}
}
