package com.workrocks.project.Pages.Header_Pages.Profile;


import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class SettingsTab extends ProfileMainPage {
    ConfigProperties data = new ConfigProperties();

    public SettingsTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Phone") private WebElement phoneEdit;
    @FindBy(id = "Notes") private WebElement notes;

    private void clickSettingsTab() {wd.findElement(By.linkText("Settings")).click();}

    private void clickSaveSettingsButton() {wd.findElement(By.xpath(".//*[@id='settings']/form/div/div/button")).click();}

    private void setFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);}

    private void setLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);}

    private void setPhone(String phone){
        this.phoneEdit.clear();
        this.phoneEdit.sendKeys(phone);}

    private void setNotes(String notes){
        this.notes.clear();
        this.notes.sendKeys(notes);}

    public String getFirstName(){return firstName.getAttribute("value");}

    public String getLastName(){return lastName.getAttribute("value");}

    public String getPhoneEdit(){
        return phoneEdit.getAttribute("value");
    }

    public String getNotesEdit(){
        return notes.getText();
    }

    public void editSettingsTab(String firstName, String lastName, String phone, String notes){
        clickEditIcon();
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setNotes(notes);
        clickSaveSettingsButton();
   //     webpages.MainPage().openUserProfile();
    }

    public ScreeningQuestionsTab openScreeningQuestionsTab() {

        return page(ScreeningQuestionsTab.class);
    }

    /*public InvestmentQuestionnaireTab openInvestmentQuestionnaireTab() {

        return page(InvestmentQuestionnaireTab.class);
    }*/

    public ChangePasswordTab openPasswordTab() {

        return page(ChangePasswordTab.class);
    }
}
