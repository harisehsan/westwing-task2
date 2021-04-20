package base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class Base {

    protected WebDriver driver;
    private static final int DEFAULT_TIMEOUT = 60;

    public Base(WebDriver driver) {

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

    protected void goToPage(String url)
    {
        driver.navigate().to(url);
    }

    protected void scrollToView(WebElement ele) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
        Thread.sleep(3000);
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

    protected void HandleBrowserAuthentication() throws IOException {
       Runtime.getRuntime().exec("src\\HandleAuthticationAlert.exe");
    }
}
