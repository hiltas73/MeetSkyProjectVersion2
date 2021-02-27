package com.meetSky.step_definitions;

import com.meetSky.pages.CalendarViewPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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

    @When("the user clicks on the New Event Button")
    public void the_user_clicks_on_the_New_Event_Button() {
        calendarViewPage.newEventBtn.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user enters the Event Title as {string}")
    public void the_user_enters_the_Event_Title_as(String title) {
        calendarViewPage.evenTitle.sendKeys(title);
    }

    @When("the user enters {string} as from date and enters {string} as toDate")
    public void the_user_enters_as_from_date_and_enters_as_toDate(String fdate, String tDate) {

        calendarViewPage.fromDateInput.click();
        Integer dayNumber = Integer.valueOf(fdate.substring(0,2));
        calendarViewPage.clickDay(dayNumber);
        Integer hour =  Integer.valueOf(fdate.substring(14,16));
        calendarViewPage.clickHour(hour);

        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);
        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);

        BrowserUtils.waitFor(2);

        calendarViewPage.toDateInput.click();
        int dayNumber2 = Integer.parseInt(tDate.substring(0,2));
        calendarViewPage.clickDay(28);
        int hour2 =  Integer.parseInt(tDate.substring(14,16));
        calendarViewPage.clickHour(10);

        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);
        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);
        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);
        calendarViewPage.fromDateInput.sendKeys(Keys.TAB);

    }

    @When("the user clicks on the Save button")
    public void the_user_clicks_on_the_Save_button() {
        calendarViewPage.saveBtn.click();
        BrowserUtils.waitFor(4);
    }

    @Then("user should see new Event Icon and Event Title as {string} on the {int} day on Monthly Calendar")
    public void user_should_see_new_Event_Icon_and_Event_Title_as_on_the_day_on_Monthly_Calendar(String eventTitle, Integer dayNumber) {
        WebElement newEventDot = calendarViewPage.findEventDot(dayNumber);
        BrowserUtils.waitForClickablility(newEventDot,10);
        Assert.assertTrue(newEventDot.isDisplayed());

        WebElement newEventTitle = calendarViewPage.findEventTitle(dayNumber);
        Assert.assertEquals(eventTitle,newEventTitle.getText());
        System.out.println("Expected result = " + eventTitle);
        System.out.println("Actual result   = " + newEventTitle.getText());


    }


}
