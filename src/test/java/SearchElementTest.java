import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SearchElementTest {
    @Test
    void test00SearchId00() {
        //На странице https://www.saucedemo.com/ в поле Username ввести своё имя.
        open("https://www.saucedemo.com");
        $(By.id("user-name")).sendKeys("Мария");
        sleep(3_000);
    }

    //На странице https://slqamsk.github.io/demo/search-demo/ найти сначала в DevTools,
    // а потом с помощью автотеста указанные элементы, проверить, что они видимы на странице,
    // используя команду (метод): .shouldBe(visible);
    @Test
    void test01SearchId01() {
        //Поиск по ID элемента с идентификатором submit-button
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.id("submit-button")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test01SearchId02() {
        //Поиск по ID элемента с идентификатором user-password
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.id("user-password")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test02SearchName01() {
        //Поиск по атрибуту name (поиск по имени элемента) по атрибуту name="interests"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.name("interests")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test02SearchName02() {
        //Поиск по атрибуту name (поиск по имени элемента) по атрибуту name="user_email"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.name("user_email")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test03SearchClass01() {
        //Поиск по имени класса элемента с классом nav-link
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.className("nav-link")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test03SearchClass02() {
        //Поиск по имени класса элемента с классом btn
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.className("btn")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test04SearchTagname01() {
        //Поиск по имени тега поля для ввода текста на странице (тег input)
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.tagName("input")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test04SearchTagname02() {
        //Поиск по имени тега заголовка третьего уровня (тег h3)
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.tagName("h3")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test05SearchLink01() {
        //Поиск по полному тексту ссылки с точным текстом "Контакты и обратная связь"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.linkText("Контакты и обратная связь")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test05SearchLink02() {
        //Поиск по полному тексту ссылки с точным текстом "Регистрация нового пользователя в системе"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.linkText("Регистрация нового пользователя в системе")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test06SearchPartiallink01() {
        //Поиск по частичному тексту ссылки, содержащему слово "длинный"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.partialLinkText("длинный")).shouldBe(visible);
        sleep(3_000);
    }

    @Test
    void test06SearchPartiallink02() {
        //Поиск по частичному тексту ссылки, содержащему слово "Контакты"
        open("https://slqamsk.github.io/demo/search-demo");
        $(By.partialLinkText("Контакты")).shouldBe(visible);
        sleep(3_000);
    }

}
