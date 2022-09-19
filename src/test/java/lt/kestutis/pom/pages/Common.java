package lt.kestutis.pom.pages;

import lt.kestutis.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {

    public static void openUrl(String url){

        Driver.setDriver();
        Driver.getDriver().get(url);
    }
    public static WebElement getElement(By locator) {

        return Driver.getDriver().findElement(locator);
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }
    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void closeDriver() {
        Driver.quitDriver();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(
                Driver.getDriver(),
                Duration.ofSeconds(10)
        );
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }
        public static void clickElementByAction(By locator) {
            WebElement element = getElement(locator);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(element);
            actions.click();
            actions.perform();
        }

    public static void close() {
        Common.closeDriver();
    }
    }

