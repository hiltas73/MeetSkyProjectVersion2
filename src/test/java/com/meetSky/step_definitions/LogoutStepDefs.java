package com.meetSky.step_definitions;

import com.meetSky.pages.DashBoardPage;
import com.meetSky.pages.LogoutPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogoutStepDefs {

    @When("the user click on Profile Settings")
    public void the_user_click_on_Profile_Settings() {
        new LogoutPage().profileSettingTab.click();
        BrowserUtils.waitFor(2);
    }

    @Given("the user should see all profile settings list")
    public void the_user_should_see_all_profile_settings_list(List<String> profileSettingMenu) {

        List<String> actualList = BrowserUtils.getElementsText(new LogoutPage().profileSetList);

        Assert.assertEquals(profileSettingMenu,actualList);
    }

    @Then("the user should be able to logout")
    public void the_user_should_be_able_to_logout() {
        new LogoutPage().logOut();
        BrowserUtils.waitFor(2);

    }
}
