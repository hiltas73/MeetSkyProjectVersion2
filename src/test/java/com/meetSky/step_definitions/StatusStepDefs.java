package com.meetSky.step_definitions;


import com.meetSky.pages.DashBoardPage;
import com.meetSky.pages.StatusPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class StatusStepDefs {

    @When("the user click on Profile")
    public void theUserClickOnProfile() {
        DashBoardPage dashboardPage = new DashBoardPage();
        dashboardPage.profileButton.click();
    }

    @Then("the profile name should be employee_username")
    public void theProfileNameShouldBeEmployee_username() {
        BrowserUtils.waitFor(2);
        String actualProfileName = new DashBoardPage().profileName.getText();
        String expectedProfileName = ConfigurationReader.get("employee_username");
        System.out.println("expectedProfileName = " + expectedProfileName);
        System.out.println("actualProfileName = " + actualProfileName);
        Assert.assertEquals(expectedProfileName,actualProfileName);
    }


    @When("the user click on Status")
    public void the_user_click_on_Status() {
        BrowserUtils.waitFor(2);
        new DashBoardPage().statusButton.click();
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String expectedStatusHeaderText) {
        BrowserUtils.waitFor(5);
        String actualStatusHeaderText = new StatusPage().actualStatusHeader.getText();
        System.out.println("expectedStatusHeaderText = " + expectedStatusHeaderText);
        System.out.println("actualStatusHeaderText = " + actualStatusHeaderText);
        Assert.assertEquals(expectedStatusHeaderText,actualStatusHeaderText);

    }


    @And("click on {string}")
    public void clickOn(String statusOptions) {

        new StatusPage().changeStatus(statusOptions);
        BrowserUtils.waitFor(4);
    }

    @Then("click close")
    public void clickClose() {
        BrowserUtils.waitForPageToLoad(20);
        new StatusPage().closeButton.click();

    }

    @Then("the status should be {string}")
    public void theStatusShouldBe(String expectedStatus) {
        BrowserUtils.waitFor(4);
        DashBoardPage dashboardPage = new DashBoardPage();
        dashboardPage.profileButton.click();
        BrowserUtils.waitFor(4);
        String actualStatus = dashboardPage.statusButton.getAttribute("innerHTML").substring(81).trim();
        //String innerHTML = dashboardPage.statusButton.getAttribute("innerHTML");
        //String actualStatus = innerHTML.substring(innerHTML.indexOf("n>")+5).replace("\"", "").trim();
        //String actualStatus = dashboardPage.statusButton2.getText();
        System.out.println("actualStatus = " + actualStatus);
        System.out.println("expectedStatus = " + expectedStatus);
        Assert.assertTrue(actualStatus.contains(expectedStatus));
    }


}
