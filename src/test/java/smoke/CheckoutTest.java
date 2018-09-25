package smoke;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import pages.PageHeader;
import utils.BaseTest;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkout_Test() {

        PageHeader header = PageHeader.Instance;
        open("https://www.serta.com/");

    }

}
