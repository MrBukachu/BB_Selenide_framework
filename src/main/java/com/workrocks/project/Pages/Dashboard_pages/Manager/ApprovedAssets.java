package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.RobotAction;

import static com.codeborne.selenide.Selenide.$;

public class ApprovedAssets extends ManagerDashboard {

    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();
    }

    public void searchAssetBySeller(String sellerName){
        setSellerName(sellerName);
        clickSearchButton();
    }

    public ApprovedAssets sortByPhaseA() {
        $("#select2-SelectedPhase-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public ApprovedAssets sortByPhaseB() {
        $("#select2-SelectedPhase-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public ApprovedAssets sortByPhaseC() {
        $("#select2-SelectedPhase-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }
}