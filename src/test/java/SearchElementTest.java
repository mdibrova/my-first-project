import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SearchElementTest {
    @Test
    void test00SearchId00() {
        open("https://www.saucedemo.com");
        $(By.id("user-name")).sendKeys("Мария");
        sleep(3_000);

    }

    @Test
    void test01SearchId01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.id("submit-button")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test01SearchId02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.id("user-password")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test02SearchName01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.name("interests")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test02SearchName02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.name("user_email")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test03SearchClass01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.className("nav-link")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test03SearchClass02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.className("btn")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test04SearchTagname01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.tagName("input")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test04SearchTagname02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.tagName("h3")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test05SearchLink01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.linkText("Контакты и обратная связь")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test05SearchLink02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.linkText("Регистрация нового пользователя в системе")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test06SearchPartiallink01() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.partialLinkText("длинный")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test06SearchPartiallink02() {
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.partialLinkText("Контакты")).shouldBe(visible);
        sleep(3_000);
    }

}
