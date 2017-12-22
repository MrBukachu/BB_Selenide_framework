package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.RobotAction;

import static com.codeborne.selenide.Selenide.$;

public class Trades extends ManagerDashboard {

    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();
    }

    public void searchAssetBySeller(String sellerName){
        setSellerName(sellerName);
        clickSearchButton();
    }

    public Trades sortByNewStatus() {
        $("#select2-statusSelectList-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public Trades sortByInProgressStatus() {
        $("#select2-statusSelectList-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public Trades sortBySoldStatus() {
        $("#select2-statusSelectList-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }
}
