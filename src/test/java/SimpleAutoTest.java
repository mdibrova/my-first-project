import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SimpleAutoTest {
    @Test
    void test01Git() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1500x500";
        Configuration.browserPosition = "100x200";

        open("https://slqa.ru/AT/articles/how-to-install-git.html");
        sleep(1_000);
        getWebDriver().manage().window().maximize();
        sleep(1_000);
        $(By.tagName("body")).shouldHave(text("Git"));

    }

    @Test
    void test02Mercural() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1500x500";
        Configuration.browserPosition = "100x200";

        open("https://slqa.ru/AT/articles/how-to-install-git.html");
        sleep(1_000);
        getWebDriver().manage().window().maximize();
        sleep(1_000);
        $(By.tagName("body")).shouldHave(text("Mercural"));
    }

}
