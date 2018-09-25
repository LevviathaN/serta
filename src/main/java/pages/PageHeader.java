package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class PageHeader {

    private static PageHeader instance;
    public static PageHeader Instance = (instance != null) ? instance : new PageHeader();

    /** UI Mapping for Header **/

    public static SelenideElement

    mattresses = $x(".//a[@role='navigation'][text()='Mattresses']");

    /** Header methods **/
}
