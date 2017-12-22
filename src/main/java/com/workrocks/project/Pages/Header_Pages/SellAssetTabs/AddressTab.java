package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Dashboard_pages.Manager.AssetsUnderReview;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AddressTab {
    void clickSaveAndNextButton() {$("#saveNext").click();}
    void clickSaveAndFinishButton() {$("#saveFinish").click();}

    private void setState(String state){
        $(By.xpath("//span[@dir='ltr']/span/input")).setValue(state + Keys.ENTER);}

    private void setCity(String city){
        $("#City").setValue(city);}

    private void setAddress1(String address1){
        $("#Address1").setValue(address1);}

    private void setAddress2(String address2){
        $("#Address2").setValue(address2);}

    private void setZip(String zip){
        $("#Zip").setValue(zip);}

    public BuildingInfoTab fillAddressTab(String state, String city, String address1, String address2, String ZIP){
        $("#select2-ProvinceId-container").click();
        setState(state);
        setCity(city);
        setAddress1(address1);
        setAddress2(address2);
        setZip(ZIP);
        clickSaveAndNextButton();
        return page(BuildingInfoTab.class);
    }

    public ManageTab openManageTab(){
        $(By.linkText("Manage")).click();
        return page(ManageTab.class);
    }

    public AgreeTab openAgreeTab(){
        $(By.linkText("Agree")).click();
        return page(AgreeTab.class);
    }

    public AssetsUnderReview rejectAsset(){
        $(".btn.btn-default.pull-left.btnReject").click();
        return page(AssetsUnderReview.class);
    }

    public AssetsUnderReview approveAsset(){
        $(".btn.btn-primary.pull-right.btnApprove").click();
        return page(AssetsUnderReview.class);
    }
}
