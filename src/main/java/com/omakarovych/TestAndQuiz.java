package com.omakarovych;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAndQuiz {

    @FindBy(tagName = "a")
    private WebElement clickLink;

    @FindBy(id = "fname")
    private WebElement fillField;

    @FindBy(id = "idOfButton")
    private WebElement clickButton;

    @FindBy(id = "female")
    private WebElement findRadioButton;

    @FindBy(xpath = "//input[@class ='Automation']")
    private WebElement findCheckbox1;

    @FindBy(xpath = "//input[@class ='Performance']")
    private WebElement findCheckbox2;

    @FindBy(id = "testingDropdown")
    private WebElement findDropDownMenu;

    @FindBy(xpath = "//option[@id = 'database']")
    private WebElement findOption;

    @FindBy(id = "dblClkBtn")
    private WebElement doubleClick;

    @FindBy(xpath = "//button[contains(text(),'Generate Alert Box')]")
    private WebElement generateAlertBox;

    @FindBy(id = "sourceImage")
    private WebElement sourceImage;

    @FindBy(id = "targetDiv")
    private WebElement targetDiv;

    private Actions action;
    private WebDriverWait wait;


    public TestAndQuiz(WebDriver driver) {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 2);
    }

    public void setClickLink() {
        clickLink.click();
    }

    public void setFillField() {
        fillField.sendKeys("Text example");
    }

    public void setClickButton() {
        clickButton.click();
    }

    public void setFindRadioButton() {
        findRadioButton.click();
    }

    public void setFindCheckbox1() {
        findCheckbox1.click();
    }

    public void setFindCheckbox2() {
        findCheckbox2.click();
    }

    public void setFindDropDownMenu() {
        findDropDownMenu.click();
    }

    public void setFindOption() {
        findOption.click();
    }

    public void setDoubleClickWithWait() {
        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(doubleClick))).doubleClick().perform();
    }

    public void getAlertBox() {
        generateAlertBox.click();
    }
}
