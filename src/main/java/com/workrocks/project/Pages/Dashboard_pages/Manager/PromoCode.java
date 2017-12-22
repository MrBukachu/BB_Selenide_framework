package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.codeborne.selenide.SelenideElement;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PromoCode extends ManagerDashboard {
    private Date today = new Date();
    public static String promo = "";

    private SelenideElement quantityOfNewCode = $("#promo-count");
    private SelenideElement startPromoDate = $("#promo-start-date");
    private SelenideElement expiredPromoDate = $("#promo-expired-date");
    private SelenideElement promoValue = $("#promo-value");

    private SelenideElement promoCode = $$(".userRow").get(0).$$(".userRow>td").get(1);


    private void clickNewPromoCode(){$("#generatePromoCodes").click();}
    private void clickQuantityField(){quantityOfNewCode.click();}
    private void clickPurchasePriceDiscount(){$$(".iradio_minimal-orange").get(1).click();}
    private void clickFreeDiscount(){$$(".iradio_minimal-orange").get(2).click();}
    private void clickGenerate(){$("#genereateCodeBtn").click();}

    private void setQuantityOfNewPromoCodes(String quantity){
        quantityOfNewCode.setValue(quantity);}

    private void setStartDate(String startDate){
        startPromoDate.setValue(startDate);}

    private void setEndDate(String endDate){
        expiredPromoDate.setValue(endDate);}

    private void setPromoValue(String promoValue){
        this.promoValue.setValue(promoValue);}

    private String getDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(today);
    }

    public PromoCode createFixedBonus(String quantity, String promoValue){
        clickNewPromoCode();
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        setPromoValue(promoValue);
        clickGenerate();
        $$(".userRow").get(0).$$(".userRow>td").get(4).shouldHave(text("Fixed Bonus"));
        promo = promoCode.getText();
        return this;
    }

    public PromoCode createPurchasePriceDiscount(String quantity, String promoValue){
        clickNewPromoCode();
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        clickPurchasePriceDiscount();
        setPromoValue(promoValue);
        clickGenerate();
        $$(".userRow").get(0).$$(".userRow>td").get(4).shouldHave(text("Purchase Price Discount"));
        promo = promoCode.getText();
        return this;
    }

    public PromoCode createFreeDiscount(String quantity){
        clickNewPromoCode();
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        clickPurchasePriceDiscount();
        clickFreeDiscount();
        clickGenerate();
        $$(".userRow").get(0).$$(".userRow>td").get(4).shouldHave(text("Free Discount"));
        promo = promoCode.getText();
        return this;
    }
}

