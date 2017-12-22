package com.workrocks.project.Pages.Dashboard_pages.Manager;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class SoldOutAssets extends ManagerDashboard {

    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();
    }

    public void searchAssetBySeller(String sellerName){
        setSellerName(sellerName);
        clickSearchButton();
    }

    public FinancialSummary openFinancialSummaryPage(){
        $$(".fa.fa-calculator").get(0).click();
        switchTo().window(1);
        return page(FinancialSummary.class);
    }
}

