package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.RobotAction;

import static com.codeborne.selenide.Selenide.$;

public class TransactionList extends ManagerDashboard {

    public void searchTransactionByUserName(String userName){
        setUserName(userName);
        clickSearchButton();
    }

    public void searchTransactionByAmount(String amount){
        setAmount(amount);
        clickSearchButton();
    }

    public TransactionList sortByFundingType() {
        $("#select2-TransactionType-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public TransactionList sortByDistributionsType() {
        $("#select2-TransactionType-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }

    public TransactionList sortByInvestmentType() {
        $("#select2-TransactionType-container").click();
        RobotAction.selectItemInDropdown();
        clickSearchButton();
        return this;
    }
}

