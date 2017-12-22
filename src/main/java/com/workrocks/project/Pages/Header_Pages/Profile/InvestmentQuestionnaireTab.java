package com.workrocks.project.Pages.Header_Pages.Profile;

/*
public class InvestmentQuestionnaireTab extends ProfileMainPage {
    ConfigProperties data = new ConfigProperties();

    public InvestmentQuestionnaireTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='questionnairStep1']/div[1]/div[1]/div[1]/input") private WebElement firstNameField;
    @FindBy(xpath = "//div[@class='questionnairStep1']/div[1]/div[2]/div[1]/input") private WebElement lastNameField;
    @FindBy(id = "DOB") private WebElement dateOfBirth;
    @FindBy(id = "SSN") private WebElement socialSecurityNumber;
    @FindBy(id = "BankRouting") private WebElement bankRouting;
    @FindBy(id = "CitizenshipId") private WebElement citizenship;
    @FindBy(xpath = "//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[1]/div[1]/div/ins") private WebElement singleStatus;
    @FindBy(xpath = "//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[1]/div[2]/div") private WebElement marriedStatus;
    @FindBy(xpath = "//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[1]/div[3]/div") private WebElement devorsedStatus;
    @FindBy(xpath = "//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[2]/div[1]/div/ins") private WebElement yesRadio;
    @FindBy(xpath = "//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[2]/div[2]/div") private WebElement noRadio;
    @FindBy(id = "Profession") private WebElement profession;
    @FindBy(id = "Email") private WebElement emailInput;
    @FindBy(xpath = "//div[@class='questionnairStep1']/div[5]/div[2]/div[1]/input") private WebElement phoneEdit;
    @FindBy(id = "AlternativePhone") private WebElement alternativePhone;
    @FindBy(id = "AlternativeEmail") private WebElement alternativeEmail;
    @FindBy(id = "ResidenceAddress") private WebElement residenceAddress;
    @FindBy(id = "BankAccount") private WebElement bankAccount;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[1]/div[1]/div[1]/div[1]/ins") private WebElement radio11;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[1]/div[1]/div[2]/div[1]/ins") private WebElement radio12;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[1]/div[1]/div[3]/div[1]/ins") private WebElement radio13;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[1]/div[1]/div[4]/div[1]/ins") private WebElement radio14;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[1]/div[1]/div[1]/div[1]/ins") private WebElement radio21;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[1]/div[1]/div[2]/div[1]/ins") private WebElement radio22;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[1]/div[1]/div[3]/div[1]/ins") private WebElement radio23;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[1]/div[1]/div[4]/div[1]/ins") private WebElement radio24;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[1]/div[1]/div[1]/div[1]/ins") private WebElement radio31;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[1]/div[1]/div[2]/div[1]/ins") private WebElement radio32;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[1]/div[1]/div[3]/div[1]/ins") private WebElement radio33;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[1]/div[1]/div[4]/div[1]/ins") private WebElement radio34;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[1]/div[1]/div[5]/div[1]/ins") private WebElement radio35;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[4]/div[1]/div[1]/div[1]/div[1]/ins") private WebElement radio41;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[4]/div[1]/div[1]/div[2]/div[1]/ins") private WebElement radio42;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[4]/div[1]/div[1]/div[3]/div[1]/ins") private WebElement radio43;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[4]/div[1]/div[1]/div[4]/div[1]/ins") private WebElement radio44;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[4]/div[1]/div[1]/div[5]/div[1]/ins") private WebElement radio45;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[2]/div[1]/div[1]/div[1]/ins") private WebElement radio51;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[2]/div[1]/div[2]/div[1]/ins") private WebElement radio52;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[2]/div[1]/div[3]/div[1]/ins") private WebElement radio53;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[1]/div[2]/div[1]/div[4]/div[1]/ins") private WebElement radio54;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[2]/div[1]/div[1]/div[1]/ins") private WebElement radio61;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[2]/div[1]/div[2]/div[1]/ins") private WebElement radio62;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[2]/div[1]/div[3]/div[1]/ins") private WebElement radio63;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[2]/div[2]/div[1]/div[4]/div[1]/ins") private WebElement radio64;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[2]/div[1]/div[1]/div[1]/ins") private WebElement radio71;
    @FindBy(xpath = "//div[@class='questionnairStep2']/div[3]/div[2]/div[1]/div[2]/div[1]/ins") private WebElement radio72;
    @FindBy(xpath = ".//*[@id='investmentQuestionnaire']/div[2]/ul/li[2]/button") private WebElement saveInvestment;
    @FindBy(xpath = ".//*[@id='investmentQuestionnaire']/div[2]/ul/li[3]/button") private WebElement saveAndFinish;
    @FindBy(xpath = "//div[@class='callout callout-success']/span") private WebElement confirmationMessage;

    private void clickInvestmentQuestionnaireTab() {wd.findElement(By.linkText("Investment Questionnaire")).click();}
    private void clickSingleStatus() {singleStatus.click();}
    private void clickMarriedStatus() {wd.findElement(By.xpath("//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[1]/div[2]/div/ins")).click();}
    private void clickYesRadio() {yesRadio.click();}
    private void clickNoRadio() {wd.findElement(By.xpath("//*[@id=\"investmentQuestionnaire\"]/div[1]/div/div[2]/div[4]/div[2]/div[2]/div")).click();}
    private void clickRadio11() {radio11.click();}
    private void clickRadio12() {radio12.click();}
    private void clickRadio13() {radio13.click();}
    private void clickRadio14() {radio14.click();}
    private void clickRadio21() {radio21.click();}
    private void clickRadio22() {radio22.click();}
    private void clickRadio23() {radio23.click();}
    private void clickRadio24() {radio24.click();}
    private void clickRadio31() {radio31.click();}
    private void clickRadio32() {radio32.click();}
    private void clickRadio33() {radio33.click();}
    private void clickRadio34() {radio34.click();}
    private void clickRadio35() {radio35.click();}
    private void clickRadio41() {radio41.click();}
    private void clickRadio42() {radio42.click();}
    private void clickRadio43() {radio43.click();}
    private void clickRadio44() {radio44.click();}
    private void clickRadio45() {radio45.click();}
    private void clickRadio51() {radio51.click();}
    private void clickRadio52() {radio52.click();}
    private void clickRadio53() {radio53.click();}
    private void clickRadio54() {radio54.click();}
    private void clickRadio61() {radio61.click();}
    private void clickRadio62() {radio62.click();}
    private void clickRadio63() {radio63.click();}
    private void clickRadio64() {radio64.click();}
    private void clickRadio71() {radio71.click();}
    private void clickRadio72() {radio72.click();}
    private void clickSaveAndNextButton() {saveInvestment.click();}
    private void clickSaveAndFinishButton() {saveAndFinish.click();}

    private void setFirstName(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);}

    private void setLastName(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);}

    private void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth.clear();
        this.dateOfBirth.sendKeys(dateOfBirth);}

    private void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber.clear();
        this.socialSecurityNumber.sendKeys(socialSecurityNumber);}

    private void setBankRouting(String bankRouting){
        this.bankRouting.clear();
        this.bankRouting.sendKeys(bankRouting);}

    private void setProfession(String profession){
        this.profession.clear();
        this.profession.sendKeys(profession);}

    private void setPhone(String phone){
        this.phoneEdit.clear();
        this.phoneEdit.sendKeys(phone);}

    private void setEmail(String email){
        this.emailInput.clear();
        this.emailInput.sendKeys(email);}

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

    public String getFirstName(){return firstNameField.getAttribute("value");}

    public String getLastName(){return lastNameField.getAttribute("value");}

    public String getEmailEdit() {return emailInput.getAttribute("value");}

    public String getPhoneEdit(){
        return phoneEdit.getAttribute("value");
    }

    public String getDateOfBirth() {return dateOfBirth.getAttribute("value");}

    public String getSocialSecurityNumber() {return socialSecurityNumber.getAttribute("value");}

    public String getBankRouting() {return bankRouting.getAttribute("value");}

    public String getCitizenship(){
        return citizenship.getAttribute("value");
    }

    public String getProfession(){
        return profession.getAttribute("value");
    }

    public String getAlternativePhone(){return alternativePhone.getAttribute("value");
    }

    public String getAlternativeEmail(){
        return alternativeEmail.getAttribute("value");
    }

    public String getResidenceAdress(){
        return residenceAddress.getAttribute("value");
    }

    public String getBankAccount(){
        return bankAccount.getAttribute("value");
    }

    public String getRadio11Status(){return String.valueOf(singleStatus.getAttribute("class"));}
    public String getRadio12Status(){return String.valueOf(marriedStatus.getAttribute("class"));}
    public String getRadio13Status(){return String.valueOf(devorsedStatus.getAttribute("class"));}
    public String getYesStatus(){ return String.valueOf(yesRadio.getAttribute("class"));}
    public String getNoStatus(){ return String.valueOf(noRadio.getAttribute("class"));}

    public void openInvestmentQuestionnaireTab(){
        clickEditIcon();
        clickInvestmentQuestionnaireTab();
    }

    public void editDataOnInvestmentQuestionnaireTab(String dateOfBirth, String ssn, String bankRouting, String profession,
                String email, String alternativePhone, String alternativeEmail, String residenceAddress, String bankAccount){
        //setDateOfBirth(dateOfBirth);
        setSocialSecurityNumber(ssn);
        setBankRouting(bankRouting);
        clickMarriedStatus();
        clickNoRadio();
        setProfession(profession);
        setEmail(email);
        setAlternativePhone(alternativePhone);
        setAlternativeEmail(alternativeEmail);
        setResidenceAddress(residenceAddress);
        setBankAccount(bankAccount);
        clickSaveAndNextButton();
        clickRadio13();
        clickRadio12();
        clickRadio11();
        clickRadio23();
        clickRadio22();
        clickRadio21();
        clickRadio34();
        clickRadio33();
        clickRadio32();
        clickRadio31();
        clickRadio44();
        clickRadio43();
        clickRadio42();
        clickRadio41();
        clickRadio53();
        clickRadio52();
        clickRadio51();
        clickRadio63();
        clickRadio62();
        clickRadio61();
        clickRadio72();
        clickRadio71();
        clickSaveAndFinishButton();
        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
    }

    public void returnDataOnInvestmentQuestionnaireTab(String dateOfBirth, String ssn, String bankRouting, String profession, String phone,
                                                       String email, String alternativePhone, String alternativeEmail, String residenceAddress, String bankAccount){
        //setDateOfBirth(dateOfBirth);
        setSocialSecurityNumber(ssn);
        setBankRouting(bankRouting);
        clickSingleStatus();
        clickYesRadio();
        setProfession(profession);
        setPhone(phone);
        setEmail(email);
        setAlternativePhone(alternativePhone);
        setAlternativeEmail(alternativeEmail);
        setResidenceAddress(residenceAddress);
        setBankAccount(bankAccount);
        clickSaveAndNextButton();
        clickRadio14();
        clickRadio24();
        clickRadio35();
        clickRadio45();
        clickRadio54();
        clickRadio64();
        clickRadio72();
        clickSaveAndFinishButton();
        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
    }
}*/
