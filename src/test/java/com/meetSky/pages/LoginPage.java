package com.meetSky.pages;


import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//input[@name='user']")
    public WebElement userNameBlock;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWordBlock;
    @FindBy(css = "#submit-form")
    public WebElement loginBtn;




    public void loginAsEmployee(){
        String userName = ConfigurationReader.get("employee_username");
        String passWord = ConfigurationReader.get("employee_password");
        userNameBlock.sendKeys(userName);
        passWordBlock.sendKeys(passWord);
        loginBtn.click();
    }
}
