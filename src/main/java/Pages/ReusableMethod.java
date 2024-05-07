package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethod {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static int defaultWaitTime = 5;
    public ReusableMethod(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param locator
     */

    public static void waitUntilElementIsVisible(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(defaultWaitTime));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    /**
     *
     * @param locator
     */
    public static void clickElement(By locator) {
        waitUntilElementIsVisible(locator);
        driver.findElement(locator).click();
    }

    /**
     *
     * @param locator
     * @return
     * @throws InterruptedException
     */
    public static boolean isElementDisplayed(By locator) throws InterruptedException {
        Thread.sleep(1000);
        waitUntilElementIsVisible(locator);
        return driver.findElement(locator).isDisplayed();
    }

    /***
     *
     * @param driver
     * @param locator
     */
    public static void performMouseHover(WebDriver driver, By locator) {
        WebElement targetElement = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(targetElement).build().perform();
    }

    /***
     *
     * @param locator
     * @return
     */
    public String getTextOfElement(By locator) {
        waitUntilElementIsVisible(locator);
        return driver.findElement(locator).getText();
    }

    /***
     *
     * @param locator
     * @param inputText
     */
    public void sendKeysToElement(By locator, String inputText) {
        waitUntilElementIsVisible(locator);
        driver.findElement(locator).sendKeys(inputText);
    }
}
