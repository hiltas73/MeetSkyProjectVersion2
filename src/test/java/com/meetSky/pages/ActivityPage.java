package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityTab;

    @FindBy(css = ".activitysubject")
    public List<WebElement> allActivityList;

    @FindBy(css = ".live-relative-timestamp")
    public List<WebElement> orderedList;
}
