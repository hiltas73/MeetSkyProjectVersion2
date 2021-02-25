package com.meetSky.pages;

import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String module){
        String Module = module.substring(0,1).toUpperCase()+module.substring(1).toLowerCase();
        String moduleLocator ="//a[@aria-label='"+Module+"']";
        try{
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator),20);
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  10);
        }
    }

    //Change Status method
    public void changeStatus(String statusOptions) {
        String options = statusOptions.toLowerCase();
        String statusOptionsLocator = "//label[@class='user-status-online-select__label icon-user-status-"+options+"']";
        try{
            BrowserUtils.waitForClickablility(By.xpath(statusOptionsLocator),20);
            Driver.get().findElement(By.xpath(statusOptionsLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(statusOptionsLocator)),20 );
        }
    }


}
