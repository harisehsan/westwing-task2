package base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {

    protected WebDriver driver;
    private static final int DEFAULT_TIMEOUT = 60;

    public Base() {

    }

    protected void waitUntilPageReady(){
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    protected void hover(WebElement ele){
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }

    protected void waitUntilClickable(By by) {
        waitUntilClickable(by,DEFAULT_TIMEOUT);
    }

    protected void waitUntilClickable(By by, int timeOutInSeconds) {
        new WebDriverWait(driver, timeOutInSeconds)
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void waitUntilVisible(WebElement ele) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOf(ele));
    }

    protected void waitUntilVisibility(By by, int timeOutInSeconds) {
        new WebDriverWait(driver, timeOutInSeconds)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void goToPage(String url)
    {
        driver.navigate().to(url);
    }

    protected void waitLongUntilInvisibilityOf(By by, int time) {
        new WebDriverWait(driver, time)
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    protected void clickOnFirstElement (List<WebElement> ele) { // This method is used to click on the element by avoiding any kind of exception of interception

            try {
               ele.get(0).click();

            } catch (Exception ex) {
                ex.printStackTrace();
                waitUntilVisible(ele.get(0));
                Actions action = new Actions(driver);
                hover(ele.get(0));
                action.click(ele.get(0));
                Action ob = action.build();
                ob.perform();
            }
    }

    protected boolean booleanwaitUntilPresentOfElementBy(By by, int timeout) {
        try {
            new WebDriverWait(driver, timeout)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
