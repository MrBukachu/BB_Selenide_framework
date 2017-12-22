package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Asset_details_page.BoughtAsset;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class MyBITsHoldings extends UserDashboard {
    public BoughtAsset openFirstAsset() {
        $$(".label.label-primary.pull-right").get(0).click();
        return page(BoughtAsset.class);
    }
}
