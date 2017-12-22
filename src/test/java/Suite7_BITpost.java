import com.workrocks.project.Pages.MainPage;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Suite7_BITpost extends BasicData{

    @Test
    public void test01_sellBITsFromFixedPrice_Investor1(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openUserDashboard()
                .openMyBitsHoldings()
                .openFirstAsset()
                .createFixedPriceBITsSale(
                        "2",
                        "1100");
        new MainPage()
                .openSecondaryMarket();
        $$(".info-box-icon.bg-orange").get(0).shouldHave(text("2"));
        $$(".info-box-number>span").get(1).shouldHave(text("$1,100"));
        $$(".progress-description").get(0).shouldHave(text("Fixed Price"));

    }

    @Test
    public void test02_sellBITsFromAuction_Investor1(){
        new MainPage().openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openUserDashboard()
                .openMyBitsHoldings()
                .openFirstAsset()
                .createAuctionBITsSale(
                        "3",
                        "50",
                        "1150",
                        "1500",
                        "2000");
        new MainPage()
                .openSecondaryMarket();
        $$(".info-box-icon.bg-orange").get(0).shouldHave(text("3"));
        $$(".info-box-number>span").get(3).shouldHave(text("$1,150"));
        $$(".progress-description").get(0).shouldHave(text("Auction"));

    }

    @Test
    public void test03_buyBitsWithFixedPrice_Seller(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("investor2"), data.getProperty("password"))
                .openSecondaryMarket()
                .openTradeWithFixedPrice()
                .clickBuyButton()
                .buyBitsViaFixedPrice("Workrocksqa");

    }

    @Test
    public void test04_buyBitsFromAuction_Investor2(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("investor2"), data.getProperty("password"))
                .openSecondaryMarket()
                .openTradeWithAuction()
                .clickBuyButton()
                .buyBitsViaAuction("Workrocksqa");
    }
}
