import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TestFRP {
    @Test
    void test01() {
        open("https://frprf.ru");
        sleep(10_000);
        $(By.tagName("body")).shouldHave(text("заявки на заём"));

    }

    @Test
    void test02() {
        open("https://frprf.ru");
        sleep(10_000);
        $(By.tagName("body")).shouldHave(text("цена яблок"));
    }
}