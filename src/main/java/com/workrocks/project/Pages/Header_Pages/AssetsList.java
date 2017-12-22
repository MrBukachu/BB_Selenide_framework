package com.workrocks.project.Pages.Header_Pages;

import com.workrocks.project.Pages.Asset_details_page.AssetDetails;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class AssetsList {
    public static String nameOfFirstAsset;

    public AssetDetails openFirstAssetFromList(){
        $$(".item-th-list.col-md-12").get(0).$(".btn.buttonTransparent.clearfix").click();
        return page(AssetDetails.class);
    }

    public AssetDetails openSecondAssetFromList(){
        $$(".item-th-list.col-md-12").get(1).$(".btn.buttonTransparent.clearfix").click();
        return page(AssetDetails.class);
    }

    private AssetDetails openThirdAssetFromList(){
        $$(".item-th-list.col-md-12").get(2).$(".btn.buttonTransparent.clearfix").click();
        return page(AssetDetails.class);
    }

    private AssetDetails openFourthAssetFromList(){
        $$(".item-th-list.col-md-12").get(3).$(".btn.buttonTransparent.clearfix").click();
        return page(AssetDetails.class);
    }

    public AssetDetails openTradeWithFixedPrice() {
        if($$(".progress-description").get(0).getText().equals("Fixed Price")){
            openFirstAssetFromList();
        } else if ($$(".progress-description").get(1).getText().equals("Fixed Price")){
            openSecondAssetFromList();
        } else if ($$(".progress-description").get(2).getText().equals("Fixed Price")){
            openThirdAssetFromList();
        } else if ($$(".progress-description").get(3).getText().equals("Fixed Price")){
            openFourthAssetFromList();
        }
        return page(AssetDetails.class);
    }

    public AssetDetails openTradeWithAuction(){
        if($$(".progress-description").get(0).getText().equals("Action")){
            openFirstAssetFromList();
        } else if ($$(".progress-description").get(1).getText().equals("Action")){
            openSecondAssetFromList();
        } else if ($$(".progress-description").get(2).getText().equals("Action")){
            openThirdAssetFromList();
        } else if ($$(".progress-description").get(3).getText().equals("Action")){
            openFourthAssetFromList();
        }
        return page(AssetDetails.class);
    }

    public void checkFavouritesAsset(){
        if ($(By.xpath("//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/a")).getAttribute("title").equals("Delete from My Favorites")){
            nameOfFirstAsset = $(By.xpath("//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/h4/a")).getText();
        }else{
            nameOfFirstAsset = $(By.xpath("//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/h4/a")).getText();
            $(By.xpath("//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/a")).click();
        }
    }

    public AssetsList setQuestionnaire() {
        $$(".iradio_minimal-orange").get(3).click();
        $$(".iradio_minimal-orange").get(2).click();
        $$(".iradio_minimal-orange").get(1).click();
        $$(".iradio_minimal-orange").get(0).click();
        $$(".iradio_minimal-orange").get(9).click();
        $$(".iradio_minimal-orange").get(8).click();
        $$(".iradio_minimal-orange").get(7).click();
        $$(".iradio_minimal-orange").get(6).click();
        $$(".iradio_minimal-orange").get(5).click();
        $$(".iradio_minimal-orange").get(4).click();
        $$(".iradio_minimal-orange").get(13).click();
        $$(".iradio_minimal-orange").get(12).click();
        $$(".iradio_minimal-orange").get(11).click();
        $$(".iradio_minimal-orange").get(10).click();
        $$(".iradio_minimal-orange").get(17).click();
        $$(".iradio_minimal-orange").get(16).click();
        $$(".iradio_minimal-orange").get(15).click();
        $$(".iradio_minimal-orange").get(14).click();
        return this;
    }
}


