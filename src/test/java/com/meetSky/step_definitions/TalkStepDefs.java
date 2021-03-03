package com.meetSky.step_definitions;

import com.meetSky.pages.DashBoardPage;
import com.meetSky.pages.TalkPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

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

    @Then("the user should be able to create {string} conversation")
    public void the_user_should_be_able_to_create_conversation(String name) {
        Random random = new Random();
        int rand = random.nextInt(100);
        String conversationName = name + rand;
        TalkPage talkPage = new TalkPage();
        talkPage.createButton.click();
        BrowserUtils.waitFor(1);
        talkPage.conversationName.sendKeys(conversationName);
        talkPage.addButton.click();
        BrowserUtils.waitFor(1);
        talkPage.create.click();
        BrowserUtils.waitFor(1);
        String actualConversationName = talkPage.conversations.get(0).getText();
        Assert.assertEquals(conversationName,actualConversationName);
    }

    @Then("the user should be able to add any selected participant to any conversation")
    public void the_user_should_be_able_to_add_any_selected_participant_to_any_conversation() {
       TalkPage talkPage = new TalkPage();
       Random random = new Random();
       talkPage.conversations.get(random.nextInt(talkPage.conversations.size())).click();
       BrowserUtils.waitFor(3);
     //  talkPage.addPersonMenu.click();
        BrowserUtils.waitFor(1);
       String anyEmployeeNameLocator = "//h6[contains(.,'"+talkPage.putAnyName()+"')]";
        BrowserUtils.waitFor(1);
       Assert.assertTrue(Driver.get().findElement(By.xpath(anyEmployeeNameLocator)).isDisplayed());
       }

    @Then("the user should be able to start a call with any participant and leave the call")
    public void the_user_should_be_able_to_start_a_call_with_any_participant_and_leave_the_call()  {
        TalkPage talkPage = new TalkPage();
        Random random = new Random();
        talkPage.conversations.get(random.nextInt(talkPage.conversations.size()-1)).click();
        BrowserUtils.waitFor(3);
        int beginingStartCount = talkPage.startCount.size();
        int beginingLeaveCount = talkPage.leaveCount.size();
        talkPage.startCall.click();
        BrowserUtils.waitFor(10);

/*
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = Driver.get().switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }*/
        BrowserUtils.waitFor(10);
        talkPage.leaveCall.click();
        BrowserUtils.waitFor(10);
        int endingStartCount = talkPage.startCount.size();
        int endingLeaveCount = talkPage.leaveCount.size();
        Assert.assertTrue((endingStartCount-beginingStartCount) == 1);
        Assert.assertTrue((endingLeaveCount-beginingLeaveCount) == 1);
    }

    //Random random = new Random();
    // int rand = random.nextInt(payeeOptions.getOptions().size())

    /*
    US:

As a user, I should be able to add, edit or delete a task under Tasks module

AC:

Display all tasks as a list

User can add a sub-task to any selected task

User can edit any selected task

User can delete any selected task

     */
}
