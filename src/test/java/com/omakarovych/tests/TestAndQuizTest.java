package com.omakarovych.tests;

import com.omakarovych.TestAndQuiz;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAndQuizTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {

        driver = new ChromeDriver();

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
