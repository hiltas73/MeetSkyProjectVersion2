package com.meetSky.pages;

import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String module) {
        String Module = module.substring(0, 1).toUpperCase() + module.substring(1).toLowerCase();
        String moduleLocator = "//a[@aria-label='" + Module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 20);
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 10);
        }
    }

    public void ViewFolder(String module) {
        String Module = module.substring(0, 1).toUpperCase() + module.substring(1).toLowerCase();
        String moduleLocator = "//span[text()='" + Module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 20);
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 10);
        }

    }
}
