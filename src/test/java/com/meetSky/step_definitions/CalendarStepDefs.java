package com.meetSky.step_definitions;

import com.meetSky.pages.CalendarViewPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {

    CalendarViewPage calendarViewPage = new CalendarViewPage();

    @When("the user clicks on Calendar Module")
    public void the_user_clicks_on_Calendar_Module() {
        calendarViewPage.calendarModuleBtn.click();
    }

    @When("the user clicks on view options button")
    public void the_user_clicks_on_view_options_button() {
        calendarViewPage.viewOptionsBtn.click();
    }

    @When("the user clicks on the {string} option")
    public void the_user_clicks_on_the_option(String viewOption) {
        calendarViewPage.clickViewOption(viewOption);
        BrowserUtils.waitFor(2);
    }

    @Then("the app should display the Daily Calendar view")
    public void the_app_should_display_the_Daily_Calendar_view() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("Day"));
    }

    @Then("the app should display the Weekly Calendar view")
    public void the_app_should_display_the_Weekly_Calendar_view() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("Week"));
    }

    @Then("the app should display the Monthly Calendar view")
    public void the_app_should_display_the_Monthly_Calendar_view() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("Month"));
    }

    @Then("the app should display the {string} Calendar view")
    public void the_app_should_display_the_Calendar_view(String expectedViewOption) {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(expectedViewOption));
    }
}
