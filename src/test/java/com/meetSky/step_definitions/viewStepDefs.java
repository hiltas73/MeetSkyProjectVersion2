package com.meetSky.step_definitions;

import com.meetSky.pages.DashBoardPage;
import com.meetSky.pages.FilesPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class viewStepDefs {


    FilesPage filesPage= new FilesPage();
    String actualNameOrderBeforeClick= filesPage.FirstRowOfName.getText();
    String actualSizeOrderBeforeClick= filesPage.FirstRowOfSize.getText();
    String actualModifiedOrderBeforeClick = filesPage.FirstRowOfModified.getText();

    @When("the user clicks on {string}")
    public void theUserClicksOn(String viewOption) {

        if(viewOption.equals("Name")){
            String actualListOrderBeforeClick= filesPage.FirstRowOfName.getText();
            System.out.println("actualNameOrderBeforeClick = " + actualListOrderBeforeClick);
        }else if (viewOption.equals("Size")){
            String actualSizeOrderBeforeClick= filesPage.FirstRowOfSize.getText();
            System.out.println("actualSizeOrderBeforeClick = " + actualSizeOrderBeforeClick);

        }else if(viewOption.equals("Modified")) {
            String actualModifiedOrderBeforeClick = filesPage.FirstRowOfModified.getText();
            System.out.println("actualModifiedOrderBeforeClick = " + actualModifiedOrderBeforeClick);
        }

        filesPage.ViewFolder(viewOption);
        BrowserUtils.waitFor(1);

        }

    @Then("the folder view should be changed by Name")
    public void the_folder_view_should_be_changed_by_Name() {


        String actualNameOrderAfterClick= filesPage.FirstRowOfName.getText();
        System.out.println("actualListOrderAfterClick = " + actualNameOrderAfterClick);

        Assert.assertNotEquals(actualNameOrderBeforeClick,actualNameOrderAfterClick);

    }


    @Then("the folder view should be changed by Size")
    public void theFolderViewShouldBeChangedBySize() {

        String actualSizeOrderAfterClick= filesPage.FirstRowOfSize.getText();
        System.out.println("actualSizeOrderAfterClick = " + actualSizeOrderAfterClick);

        Assert.assertNotEquals(actualSizeOrderBeforeClick,actualSizeOrderAfterClick);

    }

    @Then("the folder view should be changed by Modified")
    public void theFolderViewShouldBeChangedByModified() {

        String actualModifiedOrderAfterClick= filesPage.FirstRowOfModified.getText();
        System.out.println("actualModifiedOrderAfterClick = " + actualModifiedOrderAfterClick);

        Assert.assertNotEquals(actualModifiedOrderBeforeClick,actualModifiedOrderAfterClick);
    }
}
