package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BuildingInfoTab extends AddressTab{

    private void setBuildingName(String buildingName){
        $("#Title").setValue(buildingName);}

    private void setSalePrice(String salePrice){
        $("#Price").setValue(salePrice);}

    public Double getSalePrice(){
        return Double.valueOf($("#Price").getAttribute("value").replaceAll(",", ""));}

    private void setNOI(String NOI){
        $("#NOI").setValue(NOI);}

    private void setNumberOfFloors(String numberOfFloors){
        $("#NumberOfFloors").setValue(numberOfFloors);}

    private void setNumberOfUnits(String numberOfUnits){
        $("#NumberOfUnits").setValue(numberOfUnits);}

    private void setSquareFootage(String squareFootage){
        $("#SquareFootage").setValue(squareFootage);}

    private void setYearBuilt(String yearBuilt){
        $("#YearBuilt").setValue(yearBuilt);}

    public PhotosTab fillBuildingInfoTab(String buildingName, String salesPrice, String NOI, String numberOfFloors, String numberOfUnits,
                                    String squareFootage, String yearBuilt){
        setBuildingName(buildingName);
        setSalePrice(salesPrice);
        setNOI(NOI);
        setNumberOfFloors(numberOfFloors);
        setNumberOfUnits(numberOfUnits);
        setSquareFootage(squareFootage);
        setYearBuilt(yearBuilt);
        $$("#selectedConstructionTypes>option").get(0).click();
        $$("#selectedConstructionTypes>option").get(1).click();
        $$("#selectedConstructionTypes>option").get(2).click();
        $$("#selectedConstructionTypes>option").get(3).click();
        $$("#selectedConstructionTypes>option").get(4).click();
        $$("#selectedPropertyTypes>option").get(0).click();
        $$("#selectedPropertyTypes>option").get(1).click();
        $$("#selectedPropertyTypes>option").get(2).click();
        $$("#selectedPropertyTypes>option").get(3).click();
        $(By.xpath("//div[@class='form-group']/div/div[1]/div/div")).click();
        $(By.xpath("//div[@class='form-group']/div/div[2]/div/div")).click();
        $(By.xpath("//div[@class='form-group']/div/div[3]/div/div")).click();
        clickSaveAndNextButton();
        return page(PhotosTab.class);
    }
}
