package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.WestWingNowPageObject;

public class WestWingNow extends Base {

    WestWingNowPageObject westWingNowPageObject = new WestWingNowPageObject();
    String LOGIN_EMAIL="harisehsan50@gmail.com";
    String LOGIN_PASSWORD = "harry123";

    boolean LOGIN_FLAG = true;

    public WestWingNow(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, westWingNowPageObject);
    }

    public void goToHomePage(String url)
    {
        goToPage(url);
        waitUntilPageReady();
        checkForAcceptCookie();
    }

    private void checkForAcceptCookie() {
        if (booleanwaitUntilPresentOfElementBy(westWingNowPageObject.cookie_Accept_btn_By,10))
        {
            westWingNowPageObject.cookie_Accept_btn.click();
        }
    }

    public void search(String Keyword)
    {
      waitUntilClickable(westWingNowPageObject.search_txtBox_By);
        westWingNowPageObject.search_txtBox.sendKeys(Keyword);
        westWingNowPageObject.search_txtBox.sendKeys(Keys.ENTER);

    }

    public boolean shouldSeeTheListOfProduct()
    {
        if (booleanwaitUntilPresentOfElementBy(westWingNowPageObject.email_txtBox_By,5))
        {
            Login();
        }
        return booleanwaitUntilPresentOfElementBy(westWingNowPageObject.products_By,10);
    }

    private void Login() {
        westWingNowPageObject.email_txtBox.sendKeys(LOGIN_EMAIL);
        westWingNowPageObject.password_txtBox.sendKeys(LOGIN_PASSWORD);
        westWingNowPageObject.email_News_chkbox.click();
        westWingNowPageObject.login_Submit_btn.click();
        waitLongUntilInvisibilityOf(westWingNowPageObject.email_txtBox_By,10);
        LOGIN_FLAG=false;
    }

    public void selectWishlistOfFirstProduct() throws InterruptedException {
        waitUntilClickable(westWingNowPageObject.wish_List_Icons_By);
        clickOnFirstElement(westWingNowPageObject.wish_List_Icons);
    }

    public void performLoginIfRequire()
    {
        if (LOGIN_FLAG) {
            waitUntilVisibility(westWingNowPageObject.email_txtBox_By,5);
            Login();
        }
    }

    public boolean ProductShouldBeAddedToWishList()
    {
       if (booleanwaitUntilPresentOfElementBy(westWingNowPageObject.wishlist_Header_count_By,5)) {
           return (westWingNowPageObject.wish_List_Icons.get(0).getAttribute(westWingNowPageObject.WISHLIST_HEART_FILL).equalsIgnoreCase("true")
                   && westWingNowPageObject.wishlist_Header_count.getText().equalsIgnoreCase("1"));
       }
       else
           return false;
    }

    public void navigateToWishList(String url)
    {
        goToPage(url);
        waitUntilPageReady();
    }

    public void deleteTheProductFromWishList()
    {
        waitUntilClickable(westWingNowPageObject.wishlist_Delete_btn_By);
        westWingNowPageObject.wishlist_Delete_btn.click();
    }
}
