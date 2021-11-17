package com.openlyCrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {



    @FindBy(name = "USER_LOGIN" )
    public WebElement username;

    @FindBy(name = "USER_LOGIN" )
    public WebElement usernameInvalid;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInvalid;

    @FindBy(className = "login-btn")
    public WebElement loginButton;



    public void loginUsername(String userName){
        username.sendKeys(userName);
    }

    public void loginpassword(String passWord){

        password.sendKeys(passWord);


    }



    public void Invalidpassword(String invalidpassword){

        passwordInvalid.sendKeys(invalidpassword);


    }

    public void clickButton(){

        loginButton.click();
    }

    public void usernameInvalid(String username) {

        usernameInvalid.sendKeys(username);
    }
}



