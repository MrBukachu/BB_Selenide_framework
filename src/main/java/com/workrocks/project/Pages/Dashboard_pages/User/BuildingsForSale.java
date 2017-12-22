package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class BuildingsForSale extends UserDashboard{

    public AddressTab openFirstAssetFromList(){
        $$(".table.table-hover.table-striped>tbody").get(0).$(".glyphicon.glyphicon-pencil").click();
        return page(AddressTab.class);
    }
}
