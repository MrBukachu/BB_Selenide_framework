import com.workrocks.project.Pages.MainPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite3_UserProfile extends BasicData{
    @Test
    public void test01_setQuestionnaire1Seller() {
        new MainPage()
                .openLogInPage()
                .userLogin("investor1qa@gmail.com","test555")
                .openAssetsList()
                .setQuestionnaire();
        new MainPage()
                .openProfileMainPage()
                .openEditMode()
                .openScreeningQuestionsTab();

    }

    @Test
    public void test02_setQuestionnaire1Investor1() {
        new MainPage()
                .openLogInPage()
                .userLogin("","")
                .openAssetsList()
                .setQuestionnaire();
        new MainPage()
                .openProfileMainPage()
                .openEditMode()
                .openScreeningQuestionsTab();
    }

    @Test
    public void test03_setQuestionnaire1Investor2() {
        new MainPage()
                .openLogInPage()
                .userLogin("investor2qa@gmail.com","test555")
                .openAssetsList()
                .setQuestionnaire();
        new MainPage()
                .openProfileMainPage()
                .openEditMode()
                .openScreeningQuestionsTab();
    }

    @Test
    public void test04_editScreeningQuestionsTab(){
        new MainPage()
                .openProfileMainPage()
                .openEditMode()
                .openScreeningQuestionsTab()
                .editScreeningQuestionsTab();

    }

    @Test
    public void test05_setQuestionnaire2Seller() throws InterruptedException {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"), data.getProperty("password"))
                .openAssetsList()
                .openFirstAssetFromList()
                .setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("seller"));

    }

    @Test
    public void test06_setQuestionnaire2Investor1() throws InterruptedException {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("investor1"), data.getProperty("password"))
                .openAssetsList()
                .openFirstAssetFromList()
                .setQuestionnaire(
                        data.getProperty("dateOfBirth"),
                        data.getProperty("socialSecurityNumber"),
                        data.getProperty("bankRouting"),
                        data.getProperty("profession"),
                        data.getProperty("alternativePhone"),
                        data.getProperty("alternativeEmail"),
                        data.getProperty("residenceAddress"),
                        data.getProperty("bankAccount"),
                        data.getProperty("investor1"));

    }

    @Test
    public void test07_setQuestionnaire2Investor2() throws InterruptedException {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("investor2"), data.getProperty("password"))
                .openAssetsList()
                .openFirstAssetFromList()
                .setQuestionnaire(
                        data.getProperty("dateOfBirth"),
                        data.getProperty("socialSecurityNumber"),
                        data.getProperty("bankRouting"),
                        data.getProperty("profession"),
                        data.getProperty("alternativePhone"),
                        data.getProperty("alternativeEmail"),
                        data.getProperty("residenceAddress"),
                        data.getProperty("bankAccount"),
                        data.getProperty("investor2"));

    }

    @Test
    public void test08_checkInvestmentQuestionnaireTab() throws InterruptedException {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"), data.getProperty("password"))
                .openProfileMainPage()
                .openEditMode();
                //.openInvestmentQuestionnaireTab();

    }

    @Test
    public void test09_editInvestmentQuestionnaireTab() throws InterruptedException {
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"), data.getProperty("password"))
                .openProfileMainPage()
                .openEditMode();
                //.openInvestmentQuestionnaireTab()
             /*  // .editDataOnInvestmentQuestionnaireTab(
                        data.getProperty("editDateOfBirth"),
                        data.getProperty("editSocialSecurityNumber"),
                        data.getProperty("editBankRouting"),
                        data.getProperty("editProfession"),
                        data.getProperty("editUserEmail"),
                        data.getProperty("editAlternativePhone"),
                        data.getProperty("editAlternativeEmail"),
                        data.getProperty("editResidenceAddress"),
                        data.getProperty("editBankAccount"));*/

    }

 /*   @Test
    public void test10_editSettingsTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        Assert.assertTrue(
                webpages.MainInfo().getFullName().equals(data.getProperty("firstName") + " " + data.getProperty("lastName")));
        Assert.assertTrue(
                webpages.MainInfo().getPhone().equals("1(123) 456-7890"));
        Assert.assertTrue(
                webpages.MainInfo().getEmail().equals(data.getProperty("seller")));
        webpages.SettingsTab().editSettingsTab(
                data.getProperty("editFirstName"),
                data.getProperty("editLastName"),
                data.getProperty("editUserPhone"),
                data.getProperty("editNotes"));
        Assert.assertTrue(
                webpages.MainInfo().getFullName().equals(data.getProperty("editFirstName") + " " + data.getProperty("editLastName")));
        Assert.assertTrue(
                webpages.MainInfo().getPhone().equals("1(098) 765-4321"));
        Assert.assertTrue(
                webpages.MainInfo().getNotes().equals(data.getProperty("editNotes")));
    }

    @Test
    public void test11_editAddressTab(){
        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
        webpages.MainPage().openUserProfile();
        webpages.AddressTabProfile().editAddressTab(
                data.getProperty("state"),
                data.getProperty("city"),
                data.getProperty("address1"),
                data.getProperty("address2"),
                data.getProperty("zip"));
        Assert.assertEquals(
                data.getProperty("address1") + ", " + data.getProperty("city") + ", " + data.getProperty("state2") + " " + data.getProperty("zip"), webpages.MainInfo().getLeftLocation());
    }
*/
    @Test
    public void test12_editPasswordTab(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"), data.getProperty("password"))
                .openProfileMainPage()
                .openEditMode()
                .openPasswordTab()
                .editPasswordTab(
                    data.getProperty("password"),
                    data.getProperty("newPassword"),
                    data.getProperty("newPassword"));
        new MainPage()
                .signOut();
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"), data.getProperty("newPassword"))
                .openProfileMainPage()
                .openEditMode()
                .openPasswordTab()
                .editPasswordTab(
                    data.getProperty("newPassword"),
                    data.getProperty("password"),
                    data.getProperty("password"));

    }
}
