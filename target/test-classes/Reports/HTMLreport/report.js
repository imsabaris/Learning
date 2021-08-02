$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/fbregistration.feature");
formatter.feature({
  "name": "To validate the facebook registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the new account using credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FbRegistration.user_has_to_be_in_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_INTERNET_DISCONNECTED\n  (Session info: chrome\u003d92.0.4515.107)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RIYAZ\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.107, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\riyaz\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62019}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7cbba28e88eb443179ada5713932d7b1\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.utilities.BaseClass.loadUrl(BaseClass.java:66)\r\n\tat com.steps.FbRegistration.user_has_to_be_in_login_page(FbRegistration.java:19)\r\n\tat ✽.user has to be in login page(file:src/test/resources/Features/fbregistration.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to click new account",
  "keyword": "But "
});
formatter.match({
  "location": "FbRegistration.user_has_to_click_new_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter firstname",
  "rows": [
    {
      "cells": [
        "firstname",
        "Greens"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_enter_firstname(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter lastname",
  "rows": [
    {
      "cells": [
        "Tech"
      ]
    },
    {
      "cells": [
        "Technology"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_enter_lastname(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter email or mobile",
  "rows": [
    {
      "cells": [
        "mobileoremail"
      ]
    },
    {
      "cells": [
        "8667300000"
      ]
    },
    {
      "cells": [
        "Greens@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_enter_email_or_mobile(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter password",
  "rows": [
    {
      "cells": [
        "Greens12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_enter_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to select date of birth",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_select_date_of_birth()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to click gender",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.user_has_to_click_gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to click signup",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.user_has_to_click_signup()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "FbRegistration.user_enters_the_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});