package com.meetSky.pages;

import com.meetSky.utilities.BrowserUtils;
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

    @FindBy(css = "button.button.primary.new-event")
    public WebElement newEventBtn;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement evenTitle;

    @FindBy(xpath = "(//input[@name='date'])[2]")
    public WebElement fromDateInput;

    //clicks the day given on the monthly calendar
    public void clickDay(Integer dayNumber){
        String dayLocator = "//div[text()="+ dayNumber +"]";
        WebElement day = Driver.get().findElement(By.xpath(dayLocator));
        BrowserUtils.waitForClickablility(day,10);
        day.click();
    }

    //clicks the hour given on the day
    public void clickHour(Integer hourGiven){
        String hourLocator = "//ul[@data-type='hour']/li[.="+ hourGiven +"]";
        WebElement hour = Driver.get().findElement(By.xpath(hourLocator));
        BrowserUtils.waitForClickablility(hour,10);
        Driver.get().findElement(By.xpath(hourLocator)).click();
    }

    @FindBy(xpath = "(//input[@name='date'])[3]")
    public WebElement toDateInput;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    public WebElement saveBtn;

    //returns the related event dot after creation
    public WebElement findEventDot(Integer dayNumber){
        String dotLocator = "//a[@class='fc-daygrid-day-number' and .="+ dayNumber +"]/../..//div[@class='fc-daygrid-event-dot']";
        BrowserUtils.waitForClickablility(By.xpath(dotLocator),10);
        WebElement newEventDot = Driver.get().findElement(By.xpath(dotLocator));
        return newEventDot;
    }

    public WebElement findEventTitle(int dayNumber){
        String dotLocator = "//a[@class='fc-daygrid-day-number' and .="+ dayNumber +"]/../..//div[@class='fc-event-title']";
        WebElement newEventTitle = Driver.get().findElement(By.xpath(dotLocator));
        return newEventTitle;
    }





}
