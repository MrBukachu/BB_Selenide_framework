import com.workrocks.project.Pages.Header_Pages.AssetsList;
import com.workrocks.project.Pages.MainPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Suite8_UserAction extends BasicData{
    @Before
    public void userLogin(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@yopmail.com", "test555");
    }

    @Test
    public void test01_checkLastDividends(){
        new MainPage()
                .openUserDashboard()
                .openDividendsList()
                .checkPresentElements();
        $$(".userRow>td").get(1).shouldHave(text("3124.00"));
        $$(".label.label-danger").get(0).shouldHave(text("Distributions"));
    }

    @Test
    public void test02_checkFavoriteAssets(){
        new MainPage()
                .openAssetsList()
                .checkFavouritesAsset();
        new MainPage().openUserDashboard()
                .openViewAllMyFavouritesAssets()
                .checkPresentElements();
        $$(".text-black").get(0).shouldHave(text(AssetsList.nameOfFirstAsset));
    }

    @Test
    public void test03_checkInvestmentReport(){
        new MainPage()
                .openUserDashboard()
                .openTransactionsList()
                .checkPresentElements();
        $$(".userRow>td").get(1).shouldHave(text("3124.00"));
        $$(".label.label-danger").get(0).shouldHave(text("Distributions"));
    }
}
