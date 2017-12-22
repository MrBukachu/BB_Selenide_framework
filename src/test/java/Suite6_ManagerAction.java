import com.workrocks.project.Pages.Dashboard_pages.Manager.*;
import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Settings.ReadMail;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Suite6_ManagerAction extends BasicData {
    @Before
    public void managerLogin() {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"));
    }

    @Test
    public void test01_searchAssetByNameOnUnderReviewPage() {
        new MainPage()
                .openDashboard()
                .openAssetsUnderReviewPage()
                .searchAssetByName("UnderReview Don't touch");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("UnderReview Don't touch"));
    }


    @Test
    public void test02_searchAssetBySellerOnUnderReviewPage() {
        new MainPage()
                .openDashboard()
                .openAssetsUnderReviewPage()
                .searchAssetBySeller("Test account");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a").get(1).shouldHave(text("Test account"));
    }


    @Test
    public void test03_searchAssetByNameOnApprovedAssetList() {
        new MainPage()
                .openDashboard()
                .openApprovedAssetsList()
                .searchAssetByName("Approved Don't touch");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("Approved Don't touch"));
    }


    @Test
    public void test04_searchAssetBySellerOnApprovedAssetList() {
        new MainPage()
                .openDashboard()
                .openApprovedAssetsList()
                .searchAssetBySeller("Regression account");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a").get(1).shouldHave(text("Regression account"));
    }

    @Test
    public void test05_sortAssetByPhasesOnApprovedAssetList() {
        new MainPage()
                .openDashboard()
                .openApprovedAssetsList()
                .sortByPhaseA();
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td").get(6).shouldHave(text("A (Pre-Acquisition)"));
        new ApprovedAssets()
                .sortByPhaseB();
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td").get(6).shouldHave(text("B (Due Diligence)"));
        new ApprovedAssets()
                .sortByPhaseC();
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td").get(6).shouldHave(text("C (Closing)"));
    }

    @Test
    public void test06_searchAssetByNameOnTrades() {
        new MainPage()
                .openDashboard()
                .openTrades()
                .searchAssetByName("Sold don't touch");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("Sold don't touch"));
    }

    @Test
    public void test07_searchAssetBySellerOnTrades() {
        new MainPage()
                .openDashboard()
                .openTrades()
                .searchAssetBySeller("Regression account");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a>ins").get(1).shouldHave(text("Regression account"));
    }

    @Test
    public void test08_sortAssetByStatusOnTrades(){
        new MainPage()
                .openDashboard()
                .openTrades()
                .sortByNewStatus();
        new Trades()
                .sortByInProgressStatus();
        new Trades()
                .sortBySoldStatus();
    }


    @Test
    public void test09_searchAssetByNameOnSoldOutAssetsList() {
        new MainPage()
                .openDashboard()
                .openSoldOutAssetsList()
                .searchAssetByName("Sold don't touch");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("Sold don't touch"));
    }

    @Test
    public void test10_searchAssetBySellerOnSoldOutAssetsList() {
        new MainPage()
                .openDashboard()
                .openSoldOutAssetsList()
                .searchAssetBySeller("Sergey account");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a").get(1).shouldHave(text("Sergey account"));
    }


    @Test
    public void test11_addReportOnFinancialSummaryPage(){
        new MainPage()
                .openDashboard()
                .openSoldOutAssetsList()
                .openFinancialSummaryPage()
                .addReport(
                        "10000",
                        "10000",
                        "1000",
                        "1000",
                        "1000",
                        "1000",
                        "1000",
                        "02/2017");
        $$(".userRow").get(0).$$(".userRow>td").get(1).shouldHave(text("$10,000.00"));
        $$(".userRow").get(0).$$(".userRow>td").get(2).shouldHave(text("$20,000.00"));
        $$(".userRow").get(0).$$(".userRow>td").get(3).shouldHave(text("$15,000.00"));
        $$(".userRow").get(0).$$(".userRow>td").get(4).shouldHave(text("$5,000.00"));
        $$(".userRow").get(0).$$(".userRow>td").get(5).shouldHave(text("02-2017"));
        new FinancialSummary()
                .confirmReport();
        $(".label.label-info").shouldHave(text("Distribute"));
    }


    @Test
    public void test12_searchInvestmentByAssetOnInvestmentList(){
        new MainPage()
                .openDashboard()
                .openInvestmentList()
                .searchAssetByName("Sold don't touch");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("Sold don't touch"));
    }


    @Test
    public void test13_searchInvestmentByInvestorOnInvestmentList() {
        new MainPage()
                .openDashboard()
                .openInvestmentList()
                .searchAssetByInvestor("Regression account");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a").get(1).shouldHave(text("Regression account"));
    }

 /*   @Ignore
    @Test
    /**
     * At the moment all types do not exist in the system.
     *//*
    public void test14_sortInvestmentByStatusOnInvestmentList() {
        webpages.ManagerDashboard().openInvestmentList();
        webpages.Investment().selectInvestmentStatusInDropdown();
        Assert.assertEquals(
                "New", webpages.Investment().getStatus());
        webpages.Investment().selectInvestmentStatusInDropdown();
        Assert.assertEquals(
                "Paid", webpages.Investment().getStatus());
        webpages.Investment().selectInvestmentStatusInDropdown();
        Assert.assertEquals(
                "Cancel", webpages.Investment().getStatus());
        webpages.Investment().selectInvestmentStatusInDropdown();
        Assert.assertEquals(
                "Overdue", webpages.Investment().getStatus());
        webpages.Investment().selectInvestmentStatusInDropdown();
        Assert.assertEquals(
                "Rejected", webpages.Investment().getStatus());
    }
*/
    @Test
    public void test15_searchUserByFirstNameOnUserList() {
        new MainPage()
                .openDashboard()
                .openUserList()
                .searchUserByFirstName("first");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("first"));
    }

    @Test
    public void test16_searchUserByLastNameOnUserList() {
        new MainPage()
                .openDashboard()
                .openUserList()
                .searchUserByLastName("last");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("last"));
    }


    @Test
    public void test17_searchUserByEmailOnUserList() {
        new MainPage()
                .openDashboard()
                .openUserList()
                .searchUserByEmail("referaluser2@yopmail.com");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".table.table-hover.table-striped>tbody>tr>td>a").get(1).shouldHave(text("referaluser2@yopmail.com"));
    }

    @Test
    public void test18_sortUserByRolesOnUserList() {
        new MainPage().openDashboard().openUserList().sortUserByManagerRole();
        new UserList().sortUserBySellerRole();
        new UserList().sortUserByInvestorRole();
        new UserList().sortUserByAdminRole();
        new UserList().sortUserByMemberRole();
        new UserList().sortUserBySellerInvestorName();
    }

    @Test
    public void test19_sendEmailToUserFromUserList() throws InterruptedException {
        new ReadMail()
                .clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
        new MainPage()
                .openDashboard()
                .openUserList()
                .sendMessageToUser("Test subject", data.getProperty("textOfSendMessage"));
        Thread.sleep(10000);
        new ReadMail()
                .readFirstMessageFromList(data.getProperty("seller"), data.getProperty("gmailpassword"));
        //Assert.assertEquals(ReadMail.verify, data.getProperty("textOfSendMessage"));
        Assert.assertEquals(data.getProperty("textOfSendMessage"), ReadMail.verify);
        new ReadMail()
                .clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
    }


    @Test
    public void test21_searchTransactionByUserNameOnTransactionList(){
        new MainPage()
                .openDashboard()
                .openTransactionList()
                .searchTransactionByUserName("sergey");
        $$(".table.table-hover.table-striped>tbody").get(0).$(".table.table-hover.table-striped>tbody>tr>td>a>ins").shouldHave(text("sergey"));
    }


    @Test
    public void test22_searchTransactionByAmountOnTransactionList() {
        new MainPage()
                .openDashboard()
                .openTransactionList()
                .searchTransactionByAmount("2760.00");
        $$(".table.table-hover.table-striped>tbody").get(0).$$(".userRow>td").get(1).shouldHave(text("$2,760.00"));
    }

    @Test
    public void test23_sortTransactionByTypesOnTransactionList() {
        new MainPage().openDashboard()
                .openTransactionList()
                .sortByFundingType();
        new TransactionList()
                .sortByDistributionsType();
        new TransactionList()
                .sortByInvestmentType();
        /**
         * At the moment the "Withdrawal" and "Disposal" types do not exist in the system
         */
        /*
        new TransactionList().sortByWithdrawalType();
        new TransactionList().sortByDisposalType();
        */
    }


    @Test
    public void test24_searchCommentByUserNameOnCommentsList() {
        new MainPage()
                .openDashboard()
                .openCommentList()
                .searchCommentByUserName("Regression");
        $$(".commentRow>td>a>ins").get(0).shouldHave(text("Regression"));

    }

    @Test
    public void test25_searchCommentByAssetNameOnCommentsList() {
        new MainPage()
                .openDashboard()
                .openCommentList()
                .searchCommentByBuildingName("Approved Don't touch");
        $$(".commentRow>td>a>ins").get(1).shouldHave(text("Approved Don't touch"));
    }

    @Test
    public void test26_searchCommentByMessageOnCommentsList() {
        new MainPage()
                .openDashboard()
                .openCommentList()
                .searchCommentByMessage("first");
        $$(".comment-message").get(0).shouldHave(text("first"));
    }

    @Test
    public void test27_editCommentOnCommentsList() {
        new MainPage()
                .openDashboard()
                .openCommentList()
                .editLastComment("edit comment");
        $$(".comment-message").get(0).shouldHave(text("edit comment"));
    }

    @Test
    public void test28_deleteCommentFromCommentsList() {
        new MainPage()
                .openDashboard()
                .openCommentList()
                .deleteLastComment();
        $$(".comment-message").get(0).shouldNotHave(text("edit comment"));

    }

    @Test
    public void test29_searchEventByUserNameOnEventsList() {
        new MainPage()
                .openDashboard()
                .openEventsList()
                .searchEventByUserName("firstname lastname");

    }

    @Test
    public void test30_searchEventByIPOnEventsList() {
        new MainPage()
                .openDashboard()
                .openEventsList()
                .searchEventByIP("10.47.100.56");

    }

    @Test
    public void test31_checkPresentElementsOnTopPages(){
        new MainPage()
                .openDashboard()
                .openTopInvestors()
                .checkPresentElementsOnTopPages();
        new MainPage()
                .openDashboard()
                .openTopReferrals()
                .checkPresentElementsOnTopPages();
        new MainPage()
                .openDashboard()
                .openTopSellers()
                .checkPresentElementsOnTopPages();

    }

}