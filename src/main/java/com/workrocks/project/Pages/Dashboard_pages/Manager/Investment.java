package com.workrocks.project.Pages.Dashboard_pages.Manager;

public class Investment extends ManagerDashboard {

    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();
    }

    public void searchAssetByInvestor(String investorName){
        setInvestorName(investorName);
        clickSearchButton();
    }
}

