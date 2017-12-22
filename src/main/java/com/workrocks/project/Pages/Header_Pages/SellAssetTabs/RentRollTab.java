package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class RentRollTab extends AddressTab{

    private void clickPlusIcon() {$("#plus").click();}
    private void clickMinusIcon() {$("#minus").click();}
    private void clickTenantDropdown() {$("#tenantQuality").click();}

    private void setTenantField(String tenantField){
        $("#Items_0__Tenant").setValue(tenantField);
    }

    private void setSqFt9(String sqFt){
        $("#Items_0__SF").setValue(sqFt);}

    private void setTermStart(String startDate){
        $("#Items_0__TermStart").setValue(startDate);}

    private void setTermEnd(String endDate){
        $("#Items_0__TermEnd").setValue(endDate);}

    private void setAnnualRent(String annualRent){
        $("#Items_0__AnnualRent").setValue(annualRent);}

    private void setRentPSF(String rentOfYear){
        $("#Items_0__RentPSFYear").setValue(rentOfYear);}

    private void setAnnualCAM(String annualCAM){
        $("#Items_0__AnnualCAM").setValue(annualCAM);}

    private void setReimbursements(String reimbursements){
        $("#Reimbursements").setValue(reimbursements);}

    private void setPropertyTaxes(String propertyTaxes){
        $("#PropertyTaxes").setValue(propertyTaxes);}

    private void setInsurance(String insurance){
        $("#Insurance").setValue(insurance);}

    private void setUtilities(String utilities){
        $("#Utilities").setValue(utilities);}

    private void setRepairsANDMaintenance(String repairsANDMaintenance){
        $("#RepairsANDMaintenance").setValue(repairsANDMaintenance);}

    private void setOtherExpenses(String otherExpenses){
        $("#OtherExpenses").setValue(otherExpenses);}


    public ReportsTab fillRentRollTab(String tenant, String SqFt, String termStart, String termEnd, String annualRent, String rentPSF, String annualCAM, String reimbursements,
                                String propertyTaxes, String insurance, String utilities, String repairsANDMaintenance, String otherExpenses){
        $(By.xpath("//div[@id='tabRentRoll']/form/div[2]/div/div/div[1]/div/div")).click();
        $(By.xpath("//div[@id='tabRentRoll']/form/div[2]/div/div/div[2]/div/div")).click();

        clickPlusIcon();
        clickMinusIcon();
        clickPlusIcon();

        setTenantField(tenant);
        setSqFt9(SqFt);
        setTermStart(termStart);
        setTermEnd(termEnd);
        setAnnualRent(annualRent);
        setRentPSF(rentPSF);
        setAnnualCAM(annualCAM);

        clickTenantDropdown();
        clickTenantDropdown();

        $$("#tenantQuality>option").get(0).click();
        $$("#tenantQuality>option").get(1).click();
        $$("#tenantQuality>option").get(2).click();
        $$("#tenantQuality>option").get(3).click();
        $$("#tenantQuality>option").get(4).click();
        $$("#tenantQuality>option").get(5).click();
        $$("#tenantQuality>option").get(6).click();
        $$("#tenantQuality>option").get(7).click();
        $$("#tenantQuality>option").get(8).click();
        $$("#tenantQuality>option").get(0).click();

        setReimbursements(reimbursements);
        setPropertyTaxes(propertyTaxes);
        setInsurance(insurance);
        setUtilities(utilities);
        setRepairsANDMaintenance(repairsANDMaintenance);
        setOtherExpenses(otherExpenses);
        clickSaveAndNextButton();
        return page(ReportsTab.class);
    }
}
