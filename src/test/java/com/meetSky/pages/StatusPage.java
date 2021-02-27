package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatusPage extends BasePage {
    public StatusPage(){PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath = "(//*[@class='set-status-modal__header']//.)[2]")
    public WebElement actualStatusHeader;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement closeButton;


}
