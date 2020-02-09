package com.omakarovych.tests;

import com.omakarovych.GoogleAdvancedSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleAdvancedSearchTest {

    private WebDriver webDriver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Chromdriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

    }

    @Test
    public void advancedSearchTest() {

        webDriver.get("https://www.google.com/advanced_search");

        GoogleAdvancedSearch googleAdvancedSearch = new GoogleAdvancedSearch(webDriver);

        googleAdvancedSearch.inputAllWords("Automation");
        googleAdvancedSearch.inputExactWord("Java");
        googleAdvancedSearch.inputAnyOfWords("Selenium");
        googleAdvancedSearch.inputNoneOfWords("Games");
        googleAdvancedSearch.inputNumber("1", "100");

        googleAdvancedSearch.selectLanguage();
        googleAdvancedSearch.selectRegion();
        googleAdvancedSearch.selectLastUpdate();

        googleAdvancedSearch.inputDomain("https://java.com/");

        googleAdvancedSearch.selectTermsAppearing();
        googleAdvancedSearch.selectFileType();
        googleAdvancedSearch.selectUsageRights();
        googleAdvancedSearch.clickAdvancedSearchButton();

        webDriver.close();
    }
}
