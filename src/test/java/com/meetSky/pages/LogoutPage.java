package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogoutPage extends BasePage{

    @FindBy(css = "div.avatardiv-shown")
    public WebElement profileSettingTab;

    @FindBy(xpath = "//*[@data-id='logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "(//li[@data-id]/..)[3]//a")
    public List<WebElement> profileSetList;

    public void logOut(){
        logoutButton.click();
    }
}
