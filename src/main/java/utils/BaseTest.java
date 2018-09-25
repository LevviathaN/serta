package utils;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeMethod
    public void beforeWithData(Object[] data, Method method) {

        try {
            WebDriverRunner.setWebDriver(DriverProvider.getDriver());
            BasePage.driver.set(DriverProvider.getDriver());
        }catch (Exception e) {
            Assert.fail();
        }

    }

    @BeforeTest
    public void beforeTest(){
    }

    @BeforeClass
    public static void setup(){
    }

    @AfterMethod
    public void endTest(ITestResult testResult) {
    }

}
