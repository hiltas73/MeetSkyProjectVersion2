package com.meetSky.step_definitions;

import com.meetSky.pages.DashBoardPage;
import com.meetSky.pages.TalkPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TalkStepDefs {

    @When("the user click on {string} module")
    public void the_user_click_on_module(String module) {
        new DashBoardPage().navigateToModule(module);
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see all conversation list under Talk module")
    public void the_user_should_see_all_conversation_list_under_Talk_module() {

        List<WebElement> allTalkConversationList = new TalkPage().conversations;
        for (WebElement webElement : allTalkConversationList) {

            Assert.assertTrue(webElement.isDisplayed());
        }
        BrowserUtils.waitFor(2);

    }
}
