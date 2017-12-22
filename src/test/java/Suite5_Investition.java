import com.workrocks.project.Pages.Asset_details_page.PaymentPage;
import com.workrocks.project.Pages.Dashboard_pages.Manager.PromoCode;
import com.workrocks.project.Pages.MainPage;
import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Suite5_Investition extends BasicData{

    @Test
    public void test01_buyAssetWithoutDiscount_Investor2(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openFirstAssetFromList()
                .clickInvestNowButton()
                .setInvestmentAmount("13000", "Sergey");
        new PaymentPage()
                .confirmPayment()
                .openUserDashboard()
                .openMyBitsHoldings();
    }

    @Ignore
    @Test
    public void test02_buyAssetWithDiscount_Investor1(){

    }

    @Test
    public void test03_createFixedBonusPromoCodeAndBuyAsset_Investor1(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openPromoCodeList()
                .createFixedBonus(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfFixedBonus"))
                .signOut();
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openFirstAssetFromList()
                .clickInvestNowButton()
                .setInvestmentAmount("2000", "Sergey")
                .setPromoCode(PromoCode.promo);
        new PaymentPage()
                .confirmPayment()
                .openUserDashboard()
                .openMyBitsHoldings();
        new MainPage()
                .openUserDashboard()
                .openTransactionsList();
    }

    @Test
    public void test04_createPurchasePriceDiscountPromoCodeAndBuyAsset_Investor2(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openPromoCodeList()
                .createPurchasePriceDiscount(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfPriceDiscount"))
                .signOut();
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openFirstAssetFromList()
                .clickInvestNowButton()
                .setInvestmentAmount("2000", "Sergey")
                .setPromoCode(PromoCode.promo);
        $("#Subtotal").shouldHave(text("$3,000.00"));
        $("#FeeAmount").shouldHave(text("$60.00"));
        $("#Total").shouldHave(text("$2,760.00"));
        new PaymentPage()
                .confirmPayment()
                .openUserDashboard()
                .openTransactionsList();
        $$(".userRow").get(0).$$(".userRow>td").get(1).shouldHave(text("2760.00"));

    }


    @Test
    public void test05_createPromoCodeWithFreeDiscountAndBuyAsset_Investor2(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openPromoCodeList()
                .createFreeDiscount(data.getProperty("quantityOfPromoCode"))
                .signOut();
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openFirstAssetFromList()
                .clickInvestNowButton()
                .setInvestmentAmount("2000", "Sergey")
                .setPromoCode(PromoCode.promo);
        $("#Subtotal").shouldHave(text("$3,000.00"));
        $("#FeeAmount").shouldHave(text("$0.00"));
        $("#Total").shouldHave(text("$3,000.00"));
        new PaymentPage()
                .confirmPayment()
                .openUserDashboard()
                .openTransactionsList();
        $$(".userRow").get(0).$$(".userRow>td").get(1).shouldHave(text("3000.00"));
    }

    @Test
    public void test06_addCommentOnFirstAsset_Investor1(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openFirstAssetFromList()
                .openCommentsTab()
                .addComment(data.getProperty("comment1"));
        $$(".comment-message").get(0).shouldHave(text(data.getProperty("comment1")));
    }

    @Test
    public void test07_addCommentOnSecondAsset_Investor2(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555")
                .openAssetsList()
                .openSecondAssetFromList()
                .openCommentsTab()
                .addComment(data.getProperty("comment2"));
        $$(".comment-message").get(0).shouldHave(text(data.getProperty("comment2")));
    }

}
