package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AgreeTab extends AddressTab{

    private void click1Agree() {$(By.xpath("//h4[@id='agreeBB30DaysExclusivity']/div")).click();}
    private void click2Agree() {$(By.xpath("//div[@id='isProfessionalPhoto']/div")).click();}
    private void click3Agree() {$(By.xpath("//div[@id='agreeTermsBeforeFirst30Days']/div")).click();}
    private void click4Agree() {$(By.xpath("//div[@id='agreeTermsBeforeSecond30Days']/div")).click();}
    private void click5Agree() {$(By.xpath("//div[@id='agreeTermsBefore45Days']/div")).click();}

    private void clickSaveAndSendToReviewButton() {$("#sendToReview").click();}

    public void fillAgreeTab(){
        click1Agree();
        click2Agree();
        click3Agree();
        click4Agree();
        click5Agree();
        clickSaveAndSendToReviewButton();
    }

    public void sendAssetToApprove(){
        clickSaveAndSendToReviewButton();
    }

}
