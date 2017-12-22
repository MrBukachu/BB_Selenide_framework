package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import static com.codeborne.selenide.Selenide.$;

public class ManageTab extends AddressTab{

    private void setDebt(String debt){
        $("#Debt").setValue(debt);}

    private void setVideo(String videoLink){
        $("#Video").setValue(videoLink);}

    public void fillManageTab(String debt, String videoLink){
        setDebt(debt);
        setVideo(videoLink);
        clickSaveAndFinishButton();
    }
}
