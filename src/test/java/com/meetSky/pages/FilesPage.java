package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends BasePage {
    public FilesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.='Name']")
    public WebElement NameIndicator;

    @FindBy(xpath = "(//span[.='Size']")
    public WebElement SizeIndicator;

    @FindBy(xpath = "(//span[text()='Modified']")
    public WebElement ModifiedIndicator;

    @FindBy(xpath ="//span[@class='innernametext']")
    public WebElement FirstRowOfName;

    @FindBy(xpath = "//td[@class='filesize']")
    public WebElement FirstRowOfSize;

    @FindBy(xpath = "//span[@class='modified live-relative-timestamp']")
    public WebElement FirstRowOfModified;
}
