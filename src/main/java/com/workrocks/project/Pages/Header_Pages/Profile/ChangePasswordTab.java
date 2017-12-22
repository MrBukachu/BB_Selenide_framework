package com.workrocks.project.Pages.Header_Pages.Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordTab extends ProfileMainPage {

    public ChangePasswordTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "OldPassword") private WebElement oldPassword;
    @FindBy(id = "NewPassword") private WebElement newPassword;
    @FindBy(id = "ConfirmPassword") private WebElement confirmPassword;

    private void clickChangePasswordTab() {wd.findElement(By.linkText("Change Password")).click();}
    private void clickSaveChangePassword() {wd.findElement(By.xpath(".//*[@id='change-password']/form/div[5]/div/input")).click();}

    private void setOldPassword(String oldPassword){
        this.oldPassword.clear();
        this.oldPassword.sendKeys(oldPassword);}

    private void setNewPassword(String newPassword){
        this.newPassword.clear();
        this.newPassword.sendKeys(newPassword);}

    private void setConfirmPassword(String confirmPassword){
        this.confirmPassword.clear();
        this.confirmPassword.sendKeys(confirmPassword);}

    public void editPasswordTab(String oldPassword, String newPassword, String confirmPassword){
        clickEditIcon();
        clickChangePasswordTab();
        setOldPassword(oldPassword);
        setNewPassword(newPassword);
        setConfirmPassword(confirmPassword);
        clickSaveChangePassword();
   //     webpages.MainPage().signOut();
    }
}
