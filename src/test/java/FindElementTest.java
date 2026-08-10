import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FindElementTest {
    @Test
    void testFindElement(){
        open("https://slqa.ru/tools/exam/student.php");
        $("#studentName")
                .shouldBe(visible)
                .setValue("Диброва Мария");
        sleep(5_000);

    }
}
