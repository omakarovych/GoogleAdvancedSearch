package com.omakarovych.tests;

import com.omakarovych.TestAndQuiz;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestAndQuizTest {

    private WebDriver driver;

    private final String chromeVersion = "80.0.3987.106";

    @BeforeTest
    public void beforeTest() {

    ChromeDriverManager.getInstance().version(chromeVersion).setup();
    driver = new ChromeDriver();
    }


    @AfterTest
    public void afterClass(){
        try {
            driver.close();
        } catch (Exception ex){}
    }

    @Test
    public void testAndQuizTest() {

        driver.get("https://www.testandquiz.com/selenium/testing.html");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestAndQuiz actionsOnPage = new TestAndQuiz(driver);

        actionsOnPage.setClickLink();
        driver.navigate().back();

        actionsOnPage.setFillField();
        actionsOnPage.setClickButton();
        actionsOnPage.setFindRadioButton();
        actionsOnPage.setFindCheckbox1();
        actionsOnPage.setFindCheckbox2();
        actionsOnPage.setFindDropDownMenu();
        actionsOnPage.setFindOption();
        actionsOnPage.setDoubleClickWithWait();

        Alert jsConfirm1 = driver.switchTo().alert();
        jsConfirm1.accept();

        actionsOnPage.getAlertBox();

        Alert jsConfirm2 = driver.switchTo().alert();
        jsConfirm2.accept();

        driver.close();

    }
}
