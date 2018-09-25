package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

}
