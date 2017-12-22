import com.workrocks.project.Pages.MainPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite4_CreateAsset extends BasicData{

   @Test
    public void test01_createAssetBySeller(){
        new MainPage()
                .openLogInPage()
                .userLogin("workrocksqa@gmail.com", "test555")
                .openSellAssetPage()
                .fillAddressTab("Nebraska",
                                "Omaha",
                                "Ames Ave, 5",
                                "10 avenue",
                                "NE 68134")
                .fillBuildingInfoTab("Test building 1",
                                "200000",
                                "20000",
                                "5",
                                "55",
                                "5000",
                                "2005")
                .fillPhotosTab()
                .fillRentRollTab("Tenant1",
                                "1000",
                                "01/01/2016",
                                "31/12/2018",
                                "50000",
                                "50000",
                                "250000",
                                "10000",
                                "10000",
                                "10000",
                                "10000",
                                "10000",
                                "10000")
                .fillReportsTab("250000",
                                "Test report")
                .fillAgreeTab();
        $(".asset-title").shouldHave(text("NewestAsset"));
    }

    @Test
    public void test02_fillManageTab(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openAssetsUnderReviewPage()
                .openFirstAssetFromList()
                .openManageTab()
                .fillManageTab("50000", data.getProperty("videoLink"));
        $(By.xpath(".//*[@id='tabManage']/div/div/h4")).shouldBe(visible).shouldHave(text("Success"));
    }

    @Test
    public void test03_rejectAsset(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openAssetsUnderReviewPage()
                .openFirstAssetFromList()
                .rejectAsset();

        $$(".table.table-hover.table-striped>tbody>tr").get(0).$(".label.label-primary").shouldHave(text("Rejected"));

    }

    @Test
    public void test04_sendAssetToApprove(){
        new MainPage()
                .openLogInPage()
                .userLogin("regression@yopmail.com", "test555")
                .openUserDashboard()
                .openBuildingsForSale()
                .openFirstAssetFromList()
                .openAgreeTab()
                .sendAssetToApprove();
    }

    @Test
    public void test05_approveAsset(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openDashboard()
                .openAssetsUnderReviewPage()
                .openFirstAssetFromList()
                .approveAsset();
        $$(".table.table-hover.table-striped>tbody>tr").get(0).$(".label.label-primary").shouldNotHave(text("Rejected"));
    }
}
