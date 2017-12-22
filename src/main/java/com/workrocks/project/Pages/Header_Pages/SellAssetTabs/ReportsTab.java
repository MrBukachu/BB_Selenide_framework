package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReportsTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();


    @FindBy (xpath = "//div[@id='reportItem_7']/div[4]/a/span") private WebElement plusOrDeleteIcon;

    private void clickPlusOrDeleteIcon() {plusOrDeleteIcon.click();}

    private void setAppraisedValue(String appraisedValue){
        $("#report-manage-appraisalprice").setValue(appraisedValue);}

    private void setAddNewReport(String newReport) {
        $("#reportItem_7>div>input").setValue(newReport);}


    public AgreeTab fillReportsTab(String appraisedValue, String newReport){
        setAppraisedValue(appraisedValue);
        $(By.name("ReportItems[0].MediaFile")).uploadFile(new File(data.getProperty("report1")));
        $(By.name("ReportItems[1].MediaFile")).uploadFile(new File(data.getProperty("report2")));
        $(By.name("ReportItems[2].MediaFile")).uploadFile(new File(data.getProperty("report3")));
        $(By.name("ReportItems[3].MediaFile")).uploadFile(new File(data.getProperty("report4")));
        $(By.name("ReportItems[4].MediaFile")).uploadFile(new File(data.getProperty("report5")));
        $(By.name("ReportItems[5].MediaFile")).uploadFile(new File(data.getProperty("report6")));
        $(By.name("ReportItems[6].MediaFile")).uploadFile(new File(data.getProperty("report7")));
        $(By.name("ReportItems[7].MediaFile")).uploadFile(new File(data.getProperty("report8")));
        setAddNewReport(newReport);
        clickPlusOrDeleteIcon();
        clickSaveAndNextButton();
        return page(AgreeTab.class);
    }
}
