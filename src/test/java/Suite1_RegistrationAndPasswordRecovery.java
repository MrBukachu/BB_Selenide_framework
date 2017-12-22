import com.codeborne.selenide.ElementsCollection;
import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Register;
import com.workrocks.project.Pages.Settings.ReadMail;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite1_RegistrationAndPasswordRecovery extends BasicData {

    @Test
    public void test01_sellerRegistration() throws InterruptedException {
        new ReadMail().clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
        new Register().deleteUserFromBase(data.getProperty("seller"));
        new MainPage()
                .openJoinFreePage()
                .setUserData(
                        data.getProperty("firstName"),
                        data.getProperty("lastName"),
                        data.getProperty("userPhone"),
                        data.getProperty("seller"),
                        data.getProperty("password"),
                        data.getProperty("password"));
        $(".login-box-body>p").shouldHave(text("Thank you for joining BuildingBits. A verification email has been sent"));
        $("#next").click();
        Thread.sleep(3000);
        new ReadMail().openConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
        new ReadMail().deleteConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test02_investor1Registration() throws InterruptedException {
        new ReadMail().clearAllMessages(data.getProperty("investor1"), data.getProperty("gmailpassword"));
        new Register().deleteUserFromBase(data.getProperty("investor1"));
        new MainPage()
                .openJoinFreePage()
                .setUserData(
                        data.getProperty("firstName"),
                        data.getProperty("lastName"),
                        data.getProperty("userPhone"),
                        data.getProperty("investor1"),
                        data.getProperty("password"),
                        data.getProperty("password"));
        $(".login-box-body>p").shouldHave(text("Thank you for joining BuildingBits. A verification email has been sent"));
        $("#next").click();
        Thread.sleep(3000);
        new ReadMail().openConfirmationMessage(data.getProperty("investor1"), data.getProperty("gmailpassword"));
        new ReadMail().deleteConfirmationMessage(data.getProperty("investor1"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test03_investor2RegistrationViaReferralLink() throws InterruptedException {
        new ReadMail()
                .clearAllMessages(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        new Register()
                .deleteUserFromBase(data.getProperty("investor2"));
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("investor1"), data.getProperty("password"))
                .openProfileMainPage()
                .gotoRegerralLink()
                .setUserData(
                        data.getProperty("firstName"),
                        data.getProperty("lastName"),
                        data.getProperty("userPhone"),
                        data.getProperty("investor2"),
                        data.getProperty("password"),
                        data.getProperty("password"));
        $(".login-box-body>p").shouldHave(text("Thank you for joining BuildingBits. A verification email has been sent"));
        $("#next").click();
        Thread.sleep(3000);
        new ReadMail().openConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        new ReadMail().deleteConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
    }

    @Test
    public void test04_checkUsersHaveRegistered(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("manager"),data.getProperty("managerPassword"))
                .openDashboard()
                .openUserList();
        ElementsCollection userList = $$(".userRow");
        userList.shouldHaveSize(10);
        userList.get(0).$(".vertical-center.userEmail>a").shouldHave(text("investor2qa@gmail.com"));
        userList.get(1).$(".vertical-center.userEmail>a").shouldHave(text("investor1qa@gmail.com"));
        userList.get(2).$(".vertical-center.userEmail>a").shouldHave(text("workrocksqa@gmail.com"));
    }

    @Test
    public void test05_passwordRecovery() throws InterruptedException {
        new ReadMail()
                .clearAllMessages(data.getProperty("seller"), data.getProperty("gmailpassword"));
        new MainPage()
                .openLogInPage()
                .clickRecoveryPasswordLink()
                .setUserData(data.getProperty("seller"));
        $("#title_forgot_password_conf").shouldHave(text("Forgot Password Confirmation."));
        $(".login-box-body>div>p").shouldHave(text("Please check your email to reset your password."));
        Thread.sleep(3000);
        new ReadMail()
                .openConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"))
                .setNewPassword(
                        data.getProperty("seller"),
                        data.getProperty("password"),
                        data.getProperty("password"));
        $("#title_forgot_password_conf").shouldHave(text("Reset password confirmation."));
        $(".login-box-body>div>p").shouldHave(text("Your password has been reset"));
    }
}
