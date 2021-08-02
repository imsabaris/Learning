package com.pojo;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class FbRegistrationPojo extends BaseClass{
	public FbRegistrationPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='English (UK)']")
	private WebElement language;

	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement newAccount;

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailOrMobile;

	@FindBy(xpath="//input[@data-type='password']")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;

	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;

	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;

	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signUp;


	public WebElement getLanguage() {
		return language;
	}

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailOrMobile() {
		return emailOrMobile;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	
}
