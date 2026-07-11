import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTestsEkaterina {
    @Test
    void test01LoginSuccess() {
        open("https://slqamsk.github.io/cases/slflights/v01/");
        $("#username").sendKeys("standard_user");
        $("#password").sendKeys("stand_pass1");
        $("#loginButton").click();
        $("#greeting").shouldBe(visible);
    }
    @Test
    void test02LoginWrongPassword() {
        open("https://slqamsk.github.io/cases/slflights/v01/");
        $("#username").sendKeys("standard_user");
        $("#password").sendKeys("stand_pass1");
        $("#loginButton").click();
        $("#message").shouldBe(visible); //неверно, тест завершается успешно в любом случае
    }
}
