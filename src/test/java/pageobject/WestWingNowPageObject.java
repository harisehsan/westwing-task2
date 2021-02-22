package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class WestWingNowPageObject {
    @FindBy(xpath = "//*[@placeholder='Produktsuche...']") public WebElement search_txtBox;
    @FindBy(css=".GenericProduct__StyledProductWrapper-sc-6ow56k-0 .ProductInfoBox__StyledBrandText-nojqor-2") public List<WebElement> products;
    @FindBy(css = "*[class='ww-uikit_StyledHeartIcon-sc-1jh2r08 bAkSCb']") public List<WebElement> wish_List_Icons;
    @FindBy(id ="onetrust-accept-btn-handler") public WebElement cookie_Accept_btn;
    @FindBy(name = "email") public WebElement email_txtBox;
    @FindBy(name = "password") public WebElement password_txtBox;
    @FindBy(className = "StyledCheckbox__StyledInput-sc-19upj2m-0") public WebElement email_News_chkbox;
    @FindBy(className = "ww-uikit_ActionButton-sc-a4ep1m") public WebElement login_Submit_btn;
    @FindBy(className = "CountBubble__StyledBadgeCount-sc-15yuxo7-0") public WebElement wishlist_Header_count;
    @FindBy(className = "blockListProduct__delete") public WebElement wishlist_Delete_btn;

    public By search_txtBox_By = By.xpath("//*[@placeholder='Produktsuche...']");
    public By products_By = By.cssSelector(".GenericProduct__StyledProductWrapper-sc-6ow56k-0 .ProductInfoBox__StyledBrandText-nojqor-2");
    public By wish_List_Icons_By = By.cssSelector("*[class='ww-uikit_StyledHeartIcon-sc-1jh2r08 bAkSCb']");
    public By cookie_Accept_btn_By = By.id("onetrust-accept-btn-handler");
    public By email_txtBox_By = By.name("email");
    public By wishlist_Delete_btn_By = By.className("blockListProduct__delete");
    public By wishlist_Header_count_By = By.className("CountBubble__StyledBadgeCount-sc-15yuxo7-0");

   public String WISHLIST_HEART_FILL ="data-is-selected";
}
