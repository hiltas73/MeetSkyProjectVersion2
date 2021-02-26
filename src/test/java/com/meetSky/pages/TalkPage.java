package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkPage extends BasePage{

    @FindBy(xpath = "//span[@class='acli__content__line-one__title']")
    public List<WebElement> conversations;
}
