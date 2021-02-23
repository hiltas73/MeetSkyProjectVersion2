package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarViewPage {

    public CalendarViewPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//li[@data-id='calendar']")
    public WebElement calendarModuleBtn;

    @FindBy(css = "a.app-navigation-toggle")
    public WebElement navigationToggleBtn;

    @FindBy(xpath = "//button[contains(@class,'item__menutoggle')]")
    public WebElement viewOptionsBtn;

    public void clickViewOption(String viewOption){
        String locator = "//span[.='"+ viewOption +"']";
        WebElement viewOptionBtn = Driver.get().findElement(By.xpath(locator));
        viewOptionBtn.click();
    }





}
