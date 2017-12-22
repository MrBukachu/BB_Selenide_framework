package com.workrocks.project.Pages.Asset_details_page;

import com.workrocks.project.Pages.Dashboard_pages.User.UserDashboard;

import static com.codeborne.selenide.Selenide.*;

public class PaymentPage {

    private void clickPlus(){
        $("#plus").click();}

    private void clickMinus(){
        $("#minus").click();}

    private void clickOfferPlus(){
        $(".input-group-addon.btn.btn-primary.increment-step").click();
    }

    private void clickOfferMinus(){
        $(".input-group-addon.btn.btn-primary.decrement-step").click();
    }

    private void clickDiscountRadio() {$$(".iradio_minimal-orange").get(0).click();}
    private void clickPromoCodeRadio() {$$(".iradio_minimal-orange").get(1).click();}
    private void clickUseButton() {$("#use").click();}

    private void setInvestmentAmount(String amount){
        $("#Amount").setValue(amount);}

    private void setPromoCodeField(String promoCode){
        $(".form-control.pull-left").setValue(promoCode);}

    private void setUserName(String userName){
        $("#SignaturePrintName").setValue(userName);}


    public PaymentPage setInvestmentAmount(String amount, String name){
        setInvestmentAmount(amount);
        clickPlus();
        clickMinus();
        clickPlus();
        setUserName(name);
        $(".jSignature").click();
        return this;
    }

    public PaymentPage confirmPayment(){
        $("#investment").click();
        return this;}

    public PaymentPage setPromoCode(String promoCode){
        clickPromoCodeRadio();
        setPromoCodeField(promoCode);
        clickUseButton();
        return this;}

    public UserDashboard openUserDashboard(){
        $("#dashboard").click();
        return page(UserDashboard.class);
    }

    public void buyBitsViaFixedPrice(String userName) {
        setUserName(userName);
        confirmPayment();
    }

    public void buyBitsViaAuction(String userName) {
        clickOfferPlus();
        clickOfferPlus();
        clickOfferMinus();
        setUserName(userName);
        confirmPayment();
    }

}
