package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.BaseClass;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
	@Before
	public static void broswer() {
		browserLaunch();
	}
	@After
	public static void close(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}
		pageQuit();
	}

}
