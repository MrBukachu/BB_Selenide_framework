import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.workrocks.project.Pages.MainPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Suite2_Login extends BasicData{

    @Test
    public void test01_loginWithValidData(){
        new MainPage()
                .openLogInPage()
                .userLogin(data.getProperty("seller"),data.getProperty("password"));
        $(By.id("dashboard")).shouldHave(text("Dashboard"));
    }

    @Test
    public void test02_loginWithEmptyFields(){
        new MainPage()
                .openLogInPage()
                .userLogin("", "");
        ElementsCollection resultMessage = $$(".lowercase");

        $(withText("Please")).shouldBe(Condition.visible);
//        resultMessage.shouldHaveSize(2);
//        resultMessage.get(0).shouldHave(text("email"));
//        resultMessage.get(1).shouldHave(text("password"));
    }

    @Test
    public void test03_loginWithIncorrectEmail(){
        new MainPage()
                .openLogInPage()
                .userLogin("rregression@yopmail.com","test555");
        $(".field-validation-error.text-danger").shouldHave(text("Please check your email or password"));
    }


    @Test
    public void test04_loginWithInvalidEmailAndPassword(){
        new MainPage()
                .openLogInPage()
                .userLogin("regression","test555");
        $(".text-danger.field-validation-error>span").shouldHave(text("Please enter a valid email address."));
    }
}
