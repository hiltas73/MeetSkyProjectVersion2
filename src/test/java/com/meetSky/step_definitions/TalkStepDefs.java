package com.meetSky.step_definitions;

import com.meetSky.pages.DashBoardPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkStepDefs {

    @When("the user click on {string} module")
    public void the_user_click_on_module(String module) {
        new DashBoardPage().navigateToModule(module);
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see all conversation list under Talk module")
    public void the_user_should_see_all_conversation_list_under_Talk_module() {
        System.out.println("");
    }
}
