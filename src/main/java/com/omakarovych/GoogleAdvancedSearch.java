package com.omakarovych;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class GoogleAdvancedSearch {

    @FindBy(id = "xX4UFf")
    private WebElement allWordsField;

    @FindBy(id = "CwYCWc")
    private WebElement exactWordField;

    @FindBy(id = "mSoczb")
    private WebElement anyOfWordsField;

    @FindBy(id = "t2dX1c")
    private WebElement noneOfWordsField;

    @FindBy(name = "as_nlo")
    private WebElement fromNumbersField;

    @FindBy(name = "as_nhi")
    private WebElement toNumbersField;

    @FindBy(id = "lr_button")
    private WebElement dropDownMenuSelectLanguage;

    @FindBy(id = ":1")
    private WebElement language;

    @FindBy(id = "cr_button")
    private WebElement dropDownMenuSelectRegion;
    @FindBy(id = ":6i")
    private WebElement region;

    @FindBy(id = "as_qdr_button")
    private WebElement dropDownMenuLastUpdate;

    @FindBy(id = ":84")
    private WebElement lastUpdate;

    @FindBy(id = "NqEkZd")
    private WebElement siteOrDomainField;

    @FindBy(id = "as_occt_button")
    private WebElement termsAppearingDropDownMenu;

    @FindBy(id = ":86")
    private WebElement termsAppearing;

    @FindBy(id = "as_safesearch_button")
    private WebElement safeSearchDropDownMenu;

    @FindBy(id = ":8v")
    private WebElement safeSearch;

    @FindBy(id = "as_filetype_button")
    private WebElement fileTypeDropDownMenu;

    @FindBy(id = ":8s")
    private WebElement fileType;

    @FindBy(id = "as_rights_button")
    private WebElement usageRightsDropDownMenu;

    @FindBy(id = ":8b")
    private WebElement usageRights;

    @FindBy(className = "jfk-button-action")
    private WebElement searchButton;

    public GoogleAdvancedSearch(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void inputAllWords(String allWords) {
        allWordsField.sendKeys(allWords);
    }

    public void inputExactWord(String exactWord) {
        exactWordField.sendKeys(exactWord);
    }

    public void inputAnyOfWords(String anyOfWords) {
        anyOfWordsField.sendKeys(anyOfWords);
    }

    public void inputNoneOfWords(String noneOfWords) {
        noneOfWordsField.sendKeys(noneOfWords);
    }

    public void inputNumber(String fromNumber, String toNumber) {
        fromNumbersField.sendKeys(fromNumber);
        toNumbersField.sendKeys(toNumber);
    }

    public void selectLanguage() {
        dropDownMenuSelectLanguage.click();
        language.click();
    }

    public void selectRegion() {
        dropDownMenuSelectRegion.click();
        region.click();
    }

    public void selectLastUpdate() {
        dropDownMenuLastUpdate.click();
        lastUpdate.click();
    }

    public void inputDomain(String domain) {
        siteOrDomainField.sendKeys(domain);
    }

    public void selectTermsAppearing() {
        termsAppearingDropDownMenu.click();
        termsAppearing.click();
    }

    public void selectFileType() {
        fileTypeDropDownMenu.click();
        fileType.click();
    }

    public void selectUsageRights() {
        usageRightsDropDownMenu.click();
        usageRights.click();
    }

    public void clickAdvancedSearchButton() {
        searchButton.click();
    }
}
