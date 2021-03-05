package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class TalkPage extends BasePage{

    @FindBy(xpath = "//span[@class='acli__content__line-one__title']")
    public List<WebElement> conversations;

    @FindBy(xpath = "(//button)[1]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationName;

    @FindBy(xpath = "//button[contains(text(),'Add participants')]")
    public WebElement addButton;

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement create;

    @FindBy(xpath = "//button[@close-after-click='true']")
    public WebElement addPersonMenu;

    @FindBy(xpath = "(//input[@class='app-navigation-search__input'])[2]")
    public WebElement enterNameBox;

    @FindBy(xpath = "//button[contains(.,'Start')]")
    public WebElement startCall;

    @FindBy(xpath = "//button[contains(.,'Leave')]")
    public WebElement leaveCall;

    @FindBy(xpath = "//div[@class='rich-text--wrapper'][contains(.,'You started a call')]")
    public List<WebElement> startCount;

    @FindBy(xpath = "//div[@class='rich-text--wrapper'][contains(.,'You left the call')]")
    public List<WebElement> leaveCount;


    public String putAnyName(){
        Random random = new Random();
        String anyName = "Employee"+random.nextInt(300);
        enterNameBox.sendKeys(anyName);
        Driver.get().findElement(By.xpath("//span[contains(.,'"+anyName+"')]")).click();
        return anyName;
    }



}
