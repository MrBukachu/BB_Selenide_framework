package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.MainPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ManagerDashboard{


    ManagerDashboard clickSearchButton(){
        $("#search").click();
        return this;}

    public AssetsUnderReview openAssetsUnderReviewPage(){
        $(By.linkText("Assets for Sale")).click();
        $(By.linkText("Assets Under Review")).click();
        return page(AssetsUnderReview.class);}

    public ApprovedAssets openApprovedAssetsList(){
        $(By.linkText("Assets for Sale")).click();
        $(By.linkText("Approved Assets List")).click();
        return page(ApprovedAssets.class);}

    public Trades openTrades(){
        $(By.linkText("Assets for Sale")).click();
        $(By.linkText("Trades")).click();
        return page(Trades.class);}

    public SoldOutAssets openSoldOutAssetsList(){
        $(By.linkText("Assets for Sale")).click();
        $(By.linkText("Sold Out Assets List")).click();
        return page(SoldOutAssets.class);}

    public Investment openInvestmentList(){
        $(By.linkText("Investment")).click();
        $(By.linkText("Investment List")).click();
        return page(Investment.class);}

    public UserList openUserList(){
        $(By.linkText("Users")).click();
        $(By.linkText("User List")).click();
        return page(UserList.class);}

    public TransactionList openTransactionList(){
        $(By.linkText("Transaction")).click();
        $(By.linkText("Transaction List")).click();
        return page(TransactionList.class);}

    public PromoCode openPromoCodeList(){
        $(By.linkText("Promo")).click();
        $(By.linkText("Promo Code List")).click();
        return page(PromoCode.class);}

    public Comments openCommentList(){
        $(By.linkText("Comments")).click();
        $(By.linkText("Comments List")).click();
        return page(Comments.class);}

    public TopInvestors openTopInvestors(){
        $(By.linkText("Top List")).click();
        $(By.linkText("Top Investors")).click();
        return page(TopInvestors.class);}

    public TopReferrals openTopReferrals(){
        $(By.linkText("Top List")).click();
        $(By.linkText("Top Referrals")).click();
        return page(TopReferrals.class);}

    public TopSellers openTopSellers(){
        $(By.linkText("Top List")).click();
        $(By.linkText("Top Sellers")).click();
        return page(TopSellers.class);}

    public EventsList openEventsList(){
        $(By.linkText("Event Log")).click();
        $(By.linkText("Events List")).click();
        return page(EventsList.class);}

    void setBuildingName(String buildingName){
        $("#BuildingName").setValue(buildingName);}

    void setUserName(String userName){
        $("#UserName").setValue(userName);}

    void setSellerName(String sellerName){
        $("#Seller").setValue(sellerName);}

    void setInvestorName(String investorName){
        $("#Investor").setValue(investorName);}

    void setAmount(String amount){
        $("#Amount").setValue(amount);}

    void setFirstName(String firstName){
        $("#FirstName").setValue(firstName);}

    void setLastName(String lastName){
        $("#LastName").setValue(lastName);}

    void setEmail(String email){
        $("#Email").setValue(email);}

    public MainPage signOut(){
        $(".dropdown-toggle").click();
        $("#signOut").click();
        return page(MainPage.class);}
}

