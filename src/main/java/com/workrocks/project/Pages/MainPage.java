package com.workrocks.project.Pages;

import com.codeborne.selenide.SelenideElement;
import com.workrocks.project.Pages.Dashboard_pages.Manager.ManagerDashboard;
import com.workrocks.project.Pages.Dashboard_pages.User.UserDashboard;
import com.workrocks.project.Pages.Header_Pages.AssetsList;
import com.workrocks.project.Pages.Header_Pages.Profile.ProfileMainPage;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class MainPage {


    private SelenideElement sellMenu = $("#sell");
    private SelenideElement dashboard = $("#dashboard");
    private SelenideElement investMenu = $("#invest");

    private MainPage openMainPage(){
        open("/");
        return this;
    }

    public ManagerDashboard openDashboard(){
        dashboard.click();
        return page(ManagerDashboard.class);
    }

    public UserDashboard openUserDashboard(){
       dashboard.click();
        return page(UserDashboard.class);
    }

    public AddressTab openSellAssetPage(){
        sellMenu.click();
        $("#yourBuilding").click();
        return page(AddressTab.class);
    }

    public AssetsList openAssetsList(){
        investMenu.click();
        $("#buyBuildings").click();
        return page(AssetsList.class);
    }

    public AssetsList openSecondaryMarket() {
        investMenu.click();
        $(By.linkText("Buy Bits")).click();
        return page(AssetsList.class);
    }

    public Login openLogInPage(){
        openMainPage();
        $("#loginLink").click();
        return page(Login.class);
    }

    public Register openJoinFreePage(){
        openMainPage();
        $("#registerLink").click();
        return page(Register.class);
    }

    public ProfileMainPage openProfileMainPage(){
        $(By.xpath("//li[@class='dropdown user user-menu']/a[1]/span")).click();
        $("#profile").click();
        return page(ProfileMainPage.class);
    }

    public void signOut(){
        $(".dropdown-toggle").click();
        $("#signOut").click();
    }


}

