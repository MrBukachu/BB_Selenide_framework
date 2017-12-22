package com.workrocks.project.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Register {

    private void clickSubmitCheckbox(){
        $(".icheckbox_minimal-orange").click();}

    private void clickJoinFreeButton(){
        $(By.xpath("//button[@id='register']")).click();}

    private void setFirstName(String userFirstName){
        $(By.id("FirstName")).setValue(userFirstName);}

    private void setLastName(String userLastName){
        $(By.id("LastName")).setValue(userLastName);}

    private void setPhoneNumber(String userPhoneNumber) {
        $(By.id("Phone")).setValue(userPhoneNumber);}

    private void setEmailField(String userEmail){
        $(By.id("Email")).setValue(userEmail);}

    private void setPasswordField(String userPassword){
        $(By.id("Password")).setValue(userPassword);}

    private void setConfirmPassword(String userConfirmPassword){
        $(By.id("ConfirmPassword")).setValue(userConfirmPassword);}


    public void setUserData(String firstName, String lastName, String phoneNumber, String email, String password, String confirmPassword){
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setEmailField(email);
        setPasswordField(password);
        setConfirmPassword(confirmPassword);
        clickSubmitCheckbox();
        clickJoinFreeButton();
    }

    public void deleteUserFromBase(String email){
        open("/Home/HardDelete?email="+email);
    }
}
