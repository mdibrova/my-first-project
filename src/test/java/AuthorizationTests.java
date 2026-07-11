import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests {
    @Test
    void test01Authorization01(){
        //Успешная авторизация
        open("https://slqamsk.github.io/cases/slflights/v01/");
        $(By.id("username")).sendKeys("problem_user");
        $(By.id("password")).sendKeys("prob_pass3");
        $(By.id("loginButton")).click();
        $(By.id("message")).shouldHave(text("Вход в систему выполнен успешно"));
        sleep(3_000);
    }

    @Test
    void test01Authorization02(){
        //Неуспешная авторизация
        open("https://slqamsk.github.io/cases/slflights/v01/");
        $(By.id("username")).sendKeys("problem_user");
        $(By.id("password")).sendKeys("stand_pass12");
        $(By.id("loginButton")).click();
        $(By.id("message")).shouldHave(text("Неверное имя пользователя или пароль"));
        sleep(3_000);
    }
}
