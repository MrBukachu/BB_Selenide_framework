package com.workrocks.project.Pages.Header_Pages.Profile;

import com.workrocks.project.Pages.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class ProfileMainPage {
    
    WebDriver wd;
    WebDriverWait wait;


    public ProfileMainPage(WebDriver driver) {
        wd = driver;
        wait = new WebDriverWait(wd, 30, 500);
        PageFactory.initElements(wd, this);

    }

    @FindBy(xpath = "//div[@class='box-body']/p[1]") private WebElement leftLocation;
    @FindBy(xpath = "//div[@class='box-body']/div[1]/div[1]/p") private WebElement bitsAmount;
    @FindBy(xpath = "//div[@class='box-body']/div[1]/div[2]/p") private WebElement bonus;

    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/p[1]") private WebElement fullName;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p") private WebElement phone;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p") private WebElement email;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/p[4]") private WebElement notesField;

    void clickEditIcon(){wd.findElement(By.id("edit")).click();}

    public String getFullName(){
        return fullName.getText();}

    public String getPhone(){
        return phone.getText();}

    public String getEmail(){
        return email.getText();}

    public String getLeftLocation(){
        return leftLocation.getText();}

    public String getNotes(){
        return notesField.getText();}

    public String getBitsAmount(){
        return bitsAmount.getText();}

    public String getBonus(){
        return bonus.getText();}

    private String getReferralLink(){
        $(".shareWrapper>a").click();
        return $(".form-control.txtShareCode").getAttribute("value");
    }

    public Register gotoRegerralLink(){
        open(getReferralLink());
        return page(Register.class);
    }

    public SettingsTab openEditMode() {

        return page(SettingsTab.class);
    }
}
