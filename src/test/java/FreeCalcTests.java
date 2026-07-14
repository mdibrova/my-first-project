import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FreeCalcTests {
    //Проверка страницы: найти поле и вставить в него сумму, сделать расчет, а потом попытаться заменить сумму
    @Test
    //ошибочный тест
    void freeCalcTests() throws InterruptedException {
        open("https://slqa.ru/cases/fc/v01/");
        //Первый расчет
        $(By.name("sum")).sendKeys("200");
        $(By.name("submit")).click();
        sleep(3_000);
        //$(By.name("sum")).clear();

        SelenideElement se = $(By.name("sum"));
        System.out.println("Тег: " + se.getTagName()); //выводит span, уже другое поле
        System.out.println("Текст: " + se.getOwnText());
        System.out.println("Значение: " + se.getValue());
        System.out.println("Атрибут type: " + se.getAttribute("type"));
        se.clear();

        //Второй расчет
        $(By.name("sum")).setValue("500");
        $(By.name("submit")).click();
        sleep(3_000);
        //$(By.name("sum")).clear();

    }
    @Test
        //корректный тест (в CSS)
    void freeCalcTests2() throws InterruptedException {
        open("https://slqa.ru/cases/fc/v01/");
        //Первый расчет
        $("[name=sum]").sendKeys("200");
        $("[name=submit]").click();
        sleep(3_000);
        $("input[name=sum]").clear();

        //Второй расчет
        $("input[name=sum]").sendKeys("500");
        $("[name=submit]").click();
        sleep(3_000);
        // $("input[name=sum]").clear();
    }
}
