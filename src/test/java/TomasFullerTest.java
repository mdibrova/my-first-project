import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TomasFullerTest {
    @Test
    void testSimpleForm(){
        open("https://slqa.ru/cases/SimpleForm/");
        $(byText("Томас Фуллер")).shouldBe(visible);
    }

}
