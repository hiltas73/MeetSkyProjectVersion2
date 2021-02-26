package com.meetSky.step_definitions;

import com.meetSky.pages.ActivityPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActivityStepDefs {

    ActivityPage activityPage = new ActivityPage();

    @Then("the user should see all activity list")
    public void the_user_should_see_all_activity_list() {
        List<WebElement> allActivityList = activityPage.allActivityList;
        for (WebElement webElement : allActivityList) {

            Assert.assertTrue(webElement.isDisplayed());
        }
        BrowserUtils.waitFor(2);
    }

}
