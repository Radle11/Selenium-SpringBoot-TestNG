package springBootSelenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class PageObject {

    protected By by;
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 3);


    public WebElement waitElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public List<WebElement> waitElements() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public WebElement getElement() {
        return driver.findElement(by);
    }

    public List<WebElement> getElements() {
        return driver.findElements(by);
    }


    public void sendKeys(String text) {
        waitElement().sendKeys(text);
    }

    public PageObject click() {
        waitElement().click();
        return this;
    }


    public String getText() {
        return waitElement().getText();
    }

    public List<String> getTexts() {
        return waitElements().stream().map(WebElement::getText).collect(Collectors.toList());
    }


}
