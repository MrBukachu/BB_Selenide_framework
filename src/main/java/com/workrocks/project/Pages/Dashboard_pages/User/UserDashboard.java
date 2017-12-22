package com.workrocks.project.Pages.Dashboard_pages.User;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class UserDashboard {

    public BuildingsForSale openBuildingsForSale(){
        $(By.linkText("View All My BITS for sale")).click();
        return page(BuildingsForSale.class);
    }

    public MyBITsHoldings openMyBitsHoldings(){
        $("#viewAll").click();
        return page(MyBITsHoldings.class);
    }

    public LatestTransactions openTransactionsList(){
        $(By.linkText("View All Transactions")).click();
        return page(LatestTransactions.class);
    }

    public Dividends openDividendsList() {
        $(By.linkText("View All Dividends")).click();
        return page(Dividends.class);
    }

    public MyFavoriteBuildings openViewAllMyFavouritesAssets(){
        $(By.linkText("View All My Favorite Buildings")).click();
        return page(MyFavoriteBuildings.class);
    }
}
