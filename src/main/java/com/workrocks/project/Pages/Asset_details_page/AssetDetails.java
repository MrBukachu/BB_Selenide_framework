package com.workrocks.project.Pages.Asset_details_page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class AssetDetails {

    private AssetDetails clickSendBtn(){
        $(".fa.fa-send").click();
        return this;}

    public PaymentPage clickInvestNowButton(){
        $(".btn.btn-primary.btn-rounded.invest-btn").click();
        return page(PaymentPage.class);}

    public PaymentPage clickBuyButton(){
        $(".btn.btn-primary.btn-rounded.invest-btn").click();
        return page(PaymentPage.class);}

    public AssetDetails openCommentsTab(){
        $$(".nav.nav-tabs>li>a").get(2).click();
        return this;}

    public void addComment(String comment){
        $(".form-control.input-sm").setValue(comment);
        clickSendBtn();}

    public void setQuestionnaire(String dateOfBirth, String socialSecurityNumber, String bankRouting, String profession, String alternativePhone, String alternativeEmail, String residenceAddress, String bankAccount, String seller) {
    }

/*
    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "DOB") private WebElement dateOfBirth;
    @FindBy(id = "SSN") private WebElement socialSecurityNumber;
    @FindBy(id = "BankRouting") private WebElement bankRouting;
    @FindBy(id = "Profession") private WebElement profession;
    @FindBy(id = "Phone") private WebElement phone;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "AlternativePhone") private WebElement alternativePhone;
    @FindBy(id = "AlternativeEmail") private WebElement alternativeEmail;
    @FindBy(id = "ResidenceAddress") private WebElement residenceAddress;
    @FindBy(id = "BankAccount") private WebElement bankAccount;
    @FindBy(name = "Message") private WebElement commentField;
    @FindBy(xpath = "//div[@class='box-body comments-list']/div[1]/p") private WebElement comment;

    private void clickCommentsTab(){wd.findElement(By.linkText("Comments")).click();}
    private void clickSend(){wd.findElement(By.id("send")).click();}

    private void clickSingleStatus() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[1]/div/ins")).click();}
    private void clickMarriedStatus() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[2]/div")).click();}
    private void clickDevorsedStatus() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[3]/div")).click();}

    private void clickYesRadio() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[2]/div[1]/div")).click();}
    private void clickNoRadio() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[2]/div[2]/div")).click();}

    private void clickRadio11() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div")).click();}
    private void clickRadio12() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/div")).click();}
    private void clickRadio13() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[3]/div")).click();}
    private void clickRadio14() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[4]/div")).click();}
    private void clickRadio21() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div")).click();}
    private void clickRadio22() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div")).click();}
    private void clickRadio23() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[3]/div")).click();}
    private void clickRadio24() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[4]/div")).click();}
    private void clickRadio31() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[1]/div")).click();}
    private void clickRadio32() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/div")).click();}
    private void clickRadio33() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[3]/div")).click();}
    private void clickRadio34() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[4]/div")).click();}
    private void clickRadio35() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[5]/div")).click();}
    private void clickRadio41() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[1]/div")).click();}
    private void clickRadio42() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[2]/div")).click();}
    private void clickRadio43() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[3]/div")).click();}
    private void clickRadio44() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[4]/div")).click();}
    private void clickRadio45() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[5]/div")).click();}
    private void clickRadio51() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div")).click();}
    private void clickRadio52() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[2]/div")).click();}
    private void clickRadio53() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[3]/div")).click();}
    private void clickRadio54() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[4]/div")).click();}
    private void clickRadio61() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/div")).click();}
    private void clickRadio62() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div")).click();}
    private void clickRadio63() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/div")).click();}
    private void clickRadio64() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[4]/div")).click();}
    private void clickRadio71() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[2]/div/div[1]/div")).click();}
    private void clickRadio72() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/div")).click();}

    private void clickSaveAndNext() {wd.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[2]/ul/li[2]/button")).click();}
    private void clickSaveAndFinishButton() {wd.findElement(By.xpath("//form[@id='investmentQuestionnaire']/div[2]/ul/li[3]/button")).click();}
    public void clickInvestNowButton() {wd.findElement(By.cssSelector(".btn.btn-primary.btn-rounded.invest-btn")).click();}
    public void clickBuyButton(){wd.findElement(By.xpath("//*[@id='makeOffer']/div[2]/div[1]/a")).click();}


    private void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth.sendKeys(Keys.ENTER);
        this.dateOfBirth.clear();
        this.dateOfBirth.sendKeys(dateOfBirth);}

    private void setSocialSequrityNumber(String socialSecurityNumber){
        this.socialSecurityNumber.clear();
        this.socialSecurityNumber.sendKeys(socialSecurityNumber);}

    private void setBankRouting(String bankRouting){
        this.bankRouting.clear();
        this.bankRouting.sendKeys(bankRouting);}

    private void setProfession(String profession){
        this.profession.clear();
        this.profession.sendKeys(profession);}

    private void setAlternativePhone(String alternativePhone){
        this.alternativePhone.clear();
        this.alternativePhone.sendKeys(alternativePhone);}

    private void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail.clear();
        this.alternativeEmail.sendKeys(alternativeEmail);}

    private void setResidenceAddress(String residenceAddress){
        this.residenceAddress.clear();
        this.residenceAddress.sendKeys(residenceAddress);}

    private void setBankAccount(String bankAccount){
        this.bankAccount.clear();
        this.bankAccount.sendKeys(bankAccount);}

    private void setComment(String comment){
        this.commentField.clear();
        this.commentField.sendKeys(comment);}

    private String getFirstName(){return firstName.getAttribute("value");}

    private String getLastName(){return lastName.getAttribute("value");}

    private String getPhone(){return phone.getAttribute("value");}

    public String getEmail() {return email.getAttribute("value");}

    public String getComment(){return comment.getText();}

//-----------------------------------------------------------------------------------------------------------------------------------------------
    public void setQuestionnaire(String dateOfBirth, String socialSecurityNumber, String bankRouting, String profession,
                                 String alternativePhone, String alternativeEmail, String residenceAddress, String bankAccount, String checkEmail) throws InterruptedException {
        Assert.assertEquals(data.getProperty("firstName"), getFirstName());
        Assert.assertEquals(data.getProperty("lastName"), getLastName());
        setDateOfBirth(dateOfBirth);
        setSocialSequrityNumber(socialSecurityNumber);
        setBankRouting(bankRouting);
        clickSingleStatus();
        clickMarriedStatus();
        clickDevorsedStatus();
        clickYesRadio();
        clickNoRadio();
        setProfession(profession);
        Assert.assertEquals(data.getProperty("phone"), getPhone());
        Assert.assertEquals(checkEmail, getEmail());
        setAlternativePhone(alternativePhone);
        setAlternativeEmail(alternativeEmail);
        setResidenceAddress(residenceAddress);
        setBankAccount(bankAccount);
        clickSaveAndNext();
        Thread.sleep(1000);
        clickRadio11();
        clickRadio12();
        clickRadio13();
        clickRadio14();
        clickRadio21();
        clickRadio22();
        clickRadio23();
        clickRadio24();
        clickRadio31();
        clickRadio32();
        clickRadio33();
        clickRadio34();
        clickRadio35();
        clickRadio41();
        clickRadio42();
        clickRadio43();
        clickRadio44();
        clickRadio45();
        clickRadio51();
        clickRadio52();
        clickRadio53();
        clickRadio54();
        clickRadio61();
        clickRadio62();
        clickRadio63();
        clickRadio64();
        clickRadio71();
        clickRadio72();
        clickSaveAndFinishButton();
    }

   */
}
