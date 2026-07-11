import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SearchElementCSSTest {
    //Замена поиска по атрибуту на поиск по CSS-локатору
    @Test
    void test01SearchId01() {
        open("https://slqamsk.github.io/demo/search-demo");

        //Поиск по ID
        $(By.id("submit-button")).shouldBe(visible);
        $("#submit-button").shouldBe(visible);

        $(By.id("user-password")).shouldBe(visible);
        $("#user-password").shouldBe(visible);

        //Поиск по атрибуту name (поиск по имени элемента)
        $("[name=interests]").shouldBe(visible);

        $(By.name("user_email")).shouldBe(visible);
        $("[name=user_email]").shouldBe(visible);

        //Поиск по имени класса элемента
        $(By.className("nav-link")).shouldBe(visible);
        $(".nav-link").shouldBe(visible);

        $(By.className("btn")).shouldBe(visible);
        $(".btn").shouldBe(visible);

        //Поиск по имени тега поля для ввода текста на странице (тег input)
        $(By.tagName("input")).shouldBe(visible);
        $("input").shouldBe(visible);

        //Поиск по имени тега заголовка третьего уровня (тег h3)
        $(By.tagName("h3")).shouldBe(visible);
        $("h3").shouldBe(visible);

        //Поиск по полному тексту ссылки с точным текстом - нет метода
        //$(By.linkText("Контакты и обратная связь")).shouldBe(visible);
        //$(By.linkText("Регистрация нового пользователя в системе")).shouldBe(visible);

        //Поиск по частичному тексту ссылки - нет метода
        //$(By.partialLinkText("длинный")).shouldBe(visible);
        //$(By.partialLinkText("Контакты")).shouldBe(visible);

    }

}
