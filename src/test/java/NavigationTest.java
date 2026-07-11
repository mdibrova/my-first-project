import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class NavigationTest {
    @Test
    void test_browser_properties() throws InterruptedException {
        open("https://frprf.ru/");
        sleep(3_000);
        open("https://gisp.gov.ru/");
        sleep(3_000);
        open("https://minpromtorg.gov.ru/");
        sleep(3_000);
        back();
        sleep(3_000);
        back();
        sleep(3_000);
        forward();
        sleep(10_000);

    }
}
