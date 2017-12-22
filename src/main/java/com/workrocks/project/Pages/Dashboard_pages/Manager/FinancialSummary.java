package com.workrocks.project.Pages.Dashboard_pages.Manager;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FinancialSummary extends ManagerDashboard {

    public FinancialSummary addReport(String rentalIncome, String reimbursements, String propertyTaxes, String insurance, String utilities, String repairsANDMaintenance, String otherExpenses, String month) {
        $(".add-report.btn").click();
        $("#Month").setValue(month);
        $("#RentalIncome").setValue(rentalIncome);
        $("#Reimbursements").setValue(reimbursements);
        $("#PropertyTaxes").setValue(propertyTaxes);
        $("#Insurance").setValue(insurance);
        $("#Utilities").setValue(utilities);
        $("#RepairsANDMaintenance").setValue(repairsANDMaintenance);
        $("#OtherExpenses").setValue(otherExpenses);
        $("#manageByMonthBtn").click();
        return this;
    }

    public FinancialSummary confirmReport(){
        $$(".fa.fa-calculator.margin-r-5").get(0).click();
        return this;
    }
}