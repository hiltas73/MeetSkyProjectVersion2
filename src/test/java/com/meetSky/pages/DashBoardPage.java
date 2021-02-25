package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{
    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement profileButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement profileName;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement statusButton;
}
