package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;

import static com.codeborne.selenide.Selenide.*;

public class AssetsUnderReview extends ManagerDashboard {

    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();

    }

    public void searchAssetBySeller(String sellerName){
        setSellerName(sellerName);
        clickSearchButton();

    }

    public AddressTab openFirstAssetFromList(){
        $$(".table.table-hover.table-striped>tbody>tr").get(0).$(".glyphicon.glyphicon-cog").click();
        return page(AddressTab.class);
    }
}

