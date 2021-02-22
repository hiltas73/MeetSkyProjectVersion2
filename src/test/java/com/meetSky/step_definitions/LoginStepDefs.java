package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    @Given("user login with valid credentials")
    public void user_login_with_valid_credentials() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();

        BrowserUtils.waitFor(2);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsEmployee();

        BrowserUtils.waitFor(2);
        Assert.assertEquals("Files - Meetsky - QA", Driver.get().getTitle());


    }

}
