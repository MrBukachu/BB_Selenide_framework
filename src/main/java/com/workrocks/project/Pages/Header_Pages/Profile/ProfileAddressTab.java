package com.workrocks.project.Pages.Header_Pages.Profile;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileAddressTab extends ProfileMainPage {

    public ProfileAddressTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "select2-ProvinceId-container") private WebElement state;
    @FindBy(xpath = "/html/body/span/span/span[1]/input") private WebElement stateField;
    @FindBy(id = "City") private WebElement city;
    @FindBy(id = "Address1") private WebElement address1;
    @FindBy(id = "Address2") private WebElement address2;
    @FindBy(id = "Zip") private WebElement zip;

    private void clickAddressTab() {wd.findElement(By.linkText("Address")).click();}
    private void clickState() {state.click();}
    private void clickSaveAddressTab() {wd.findElement(By.xpath("//div[@id='address']/form/div[2]/div[1]/button")).click();}

    private void setState(String state){
        this.stateField.clear();
        this.stateField.sendKeys(state + Keys.ENTER);}

    private void setCity(String city){
        this.city.clear();
        this.city.sendKeys(city);}

    private void setAddress1(String address1){
        this.address1.clear();
        this.address1.sendKeys(address1);}

    private void setAddress2(String address2){
        this.address2.clear();
        this.address2.sendKeys(address2);}

    private void setZip(String zip){
        this.zip.clear();
        this.zip.sendKeys(zip);}


    public void editAddressTab(String state, String city, String address1, String address2, String zip){
        clickEditIcon();
        clickAddressTab();
        clickState();
        setState(state);
        setCity(city);
        setAddress1(address1);
        setAddress2(address2);
        setZip(zip);
        clickSaveAddressTab();
       // webpages.MainPage().openUserProfile();
    }
}
