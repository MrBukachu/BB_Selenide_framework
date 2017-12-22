package com.workrocks.project.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Login{

    private MainPage clickLoginButton(){
        $(By.xpath("//button[@class='button button--default button--raised_orange button--login']")).click();
        return page(MainPage.class);
    }

    public ForgotPassword clickRecoveryPasswordLink(){
        $(By.linkText("I forgot my password")).click();
        return page(ForgotPassword.class);
    }

    private void setUserEmail(String userEmail){
        $(By.id("Email")).setValue(userEmail);}

    private void setUserPassword(String userPassword){
        $(By.id("Password")).setValue(userPassword);}

    public MainPage userLogin(String name, String password){
        setUserEmail(name);
        setUserPassword(password);
        clickLoginButton();
        return page(MainPage.class);
    }


}

