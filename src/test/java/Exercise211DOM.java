import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverThreadLocalContainer.*;

public class Exercise211DOM {
    @Test
    void testLogin() {
        //На странице https://slqa.ru/cases/ChatGPTLogin/
        //найти поле для ввода имени пользователя и ввести туда значение "standard_user"
        open("https://slqa.ru/cases/ChatGPTLogin/");
        $(By.id("username")).sendKeys("standard_user");
        sleep(3_000);
    }
}
