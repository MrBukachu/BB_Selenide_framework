package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import static com.codeborne.selenide.Selenide.page;

public class PhotosTab extends AddressTab{
    
    public RentRollTab fillPhotosTab(){
        //$(".mediaPathToInsertWrapper>input").uploadFile(new File("d:\\GitHub\\BuildingBits\\src\\main\\resources\\1.jpg"));
        clickSaveAndNextButton();
        return page(RentRollTab.class);
    }
}
