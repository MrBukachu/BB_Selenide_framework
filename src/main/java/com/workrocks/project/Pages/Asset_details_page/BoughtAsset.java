package com.workrocks.project.Pages.Asset_details_page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BoughtAsset {

    private BoughtAsset clickSellMyBits(){
        $("#sellMyBITs").click();
        return this;
    }

    private void clickFixedRadio(){
        $$(".iradio_minimal-orange").get(0).click();
    }

    private void clickAuctionRadio(){
        $$(".iradio_minimal-orange").get(1).click();
    }

    private void clickPlusIcon(){
        $("#plus1").click();
    }

    private void clickMinusIcon(){
        $("#minus1").click();
    }

    private void clickBitsPlusIcon(){
        $("#plus2").click();
    }

    private void clickBitsMinusIcon(){
        $("#minus2").click();
    }

    private void clickStartDateCheckbox(){
        $$(".icheckbox_minimal-orange").get(0).click();
    }

    private void clickEndDateCheckbox(){
        $$(".icheckbox_minimal-orange").get(1).click();
    }

    private void clickSubmitCheckbox(){
        $$(".icheckbox_minimal-orange").get(2).click();
    }

    private void clickOkBtn(){
        $("#addOrUpdateResellAssetBtn").click();
    }

    private void setBitsForSale(String bitsForSale){
        $("#BitsAmount").setValue(bitsForSale);
    }

    private void setPrice(String price){
        $("#price").setValue(price);
    }

    private void setBidStep(String bidStep){
        $("#BidStep").clear();
        $("#BidStep").setValue(bidStep);
    }

    private void setStartPrice(String startPrice){
        $("#startPrice").clear();
        $("#startPrice").setValue(startPrice);
    }

    private void setReserveBid(String reserveBid){
        $("#reserveBid").clear();
        $("#reserveBid").setValue(reserveBid);
    }

    private void setBuyNowPrice(String buyNowPrice){
        $("#endPrice").clear();
        $("#endPrice").setValue(buyNowPrice);
    }

    public void createFixedPriceBITsSale(String bitsForSale, String price) {
        clickSellMyBits();
        setBitsForSale(bitsForSale);
        clickPlusIcon();
        clickMinusIcon();
        clickStartDateCheckbox();
        clickEndDateCheckbox();
        setPrice(price);
        clickSubmitCheckbox();
        clickOkBtn();
    }

    public void createAuctionBITsSale(String bitsForSale, String bidStep, String startPrice, String reserveBid, String buyNowPrice) {
        clickSellMyBits();
        clickAuctionRadio();
        setBitsForSale(bitsForSale);
        clickPlusIcon();
        clickMinusIcon();
        setBidStep(bidStep);
        clickBitsPlusIcon();
        clickBitsMinusIcon();
        clickStartDateCheckbox();
        clickEndDateCheckbox();
        setStartPrice(startPrice);
        setReserveBid(reserveBid);
        setBuyNowPrice(buyNowPrice);
        clickSubmitCheckbox();
        clickOkBtn();
    }
}
