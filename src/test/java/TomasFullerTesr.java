import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TomasFullerTesr {
    @Test
    void testSimpleForm(){
        open("https://slqa.ru/cases/SimpleForm/");
        $(byText("Томас Фуллер")).shouldBe(visible);
    }

}
