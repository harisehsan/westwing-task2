package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AngebotePageObject {
    @FindBy(className = "cucumber-cookie-banner-accept-btn") public WebElement cookie_Accept_btn;
    @FindBy(linkText = "Angebote") public WebElement angebote_lnktxt;
    @FindBy(xpath = "//span[contains(.,'Privathaftpflicht')]") public WebElement privathaftpflicht_wgt;
    @FindBy(id = "ember19") public WebElement losLogen_btn;
    @FindBy (id = "ember26") public WebElement angebote_anzeigen_btn;
    @FindBy (id = "ember28") public WebElement zum_angebote_btn;
    @FindBy (id = "ember36") public WebElement select_Recommended_Offer_btn;
    @FindBy (id = "ember59") public WebElement email_Address_txtbox;
    @FindBy (id = "ember60") public WebElement password_txtbox;
    @FindBy (id = "ember61") public WebElement register_btn;
    @FindBy (name = "firstName") public WebElement vorname_txtBox;
    @FindBy (className = "_radio-button_1xh103") public WebElement herr_rdobtn;
    @FindBy (name = "street") public WebElement straße_txtbox;
    @FindBy (name ="houseNumber") public WebElement hausnr_txtbox;
    @FindBy (name ="lastName") public WebElement nachname_txtbox;
    @FindBy (name ="zipcode") public WebElement plz_txtbox;
    @FindBy (name ="city") public WebElement ort_txtbox;
    @FindBy (name = "birthdate") public WebElement geburtsdatum_txtbox;
    @FindBy (name ="phoneNumber") public WebElement telefonenummer_txtbox;
    @FindBy (xpath ="//text()[contains(.,'Weiter')]/ancestor::button[1]") public WebElement weiter_btn;
    @FindBy (className = "_radio-button_1xh103") public List <WebElement> start_Date_rdobtn;
    @FindBy (name = "iban") public WebElement iban_txtbox;
    @FindBy (className = "_checkbox_qoz8b6") public WebElement direct_Debit_txtBox;
    @FindBy (xpath = "//text()[contains(.,'Zum Abschluss')]/ancestor::button[1]") public WebElement zum_Abschluss_btn;
    @FindBy (xpath = "//text()[contains(.,'Zur Vertragsübersicht')]/ancestor::a[1]") public WebElement zur_Vertragsübersicht_btn;
    @FindBy (className = "_icon_l85hl6") public WebElement feedback_Close_btn;
    @FindBy (className = "_title_niboal") public WebElement insurance_Type_lbl;
    @FindBy (className = "_title_y7l2mq") public WebElement start_Date_Page_lbl;
    @FindBy (className = "_text_y7l2mq") public WebElement five_Years_damage_lbl;


    public By cookie_Accept_btn_By = By.className("cucumber-cookie-banner-accept-btn");
    public By angebote_lnktxt_By = By.linkText("Angebote");
    public By privathaftpflicht_wgt_By = By.xpath("//span[contains(.,'Privathaftpflicht')]");
    public By losLogen_btn_By = By.id("ember19");
    public By angebote_anzeigen_btn_By = By.id("ember26");
    public By zum_angebote_btn_By = By.id("ember28");
    public By select_Recommended_offer_btn_By = By.id("ember36");
    public By email_Address_txtbox_By = By.id("ember59");
    public By herr_rdobtn_By = By.className("_radio-button_1xh103");
    public By weiter_btn_By = By.xpath("//text()[contains(.,'Weiter')]/ancestor::button[1]");
    public By start_Date_rdobtn_By = By.className("_radio-button_1xh103");
    public By iban_txtbox_By = By.name("iban");
    public By zum_Abschluss_btn_By = By.xpath("//text()[contains(.,'Zum Abschluss')]/ancestor::button[1]");
    public By zur_Vertragsübersicht_btn_By = By.xpath("//text()[contains(.,'Zur Vertragsübersicht')]/ancestor::a[1]");
    public By feedback_Close_btn_By = By.className("_icon_l85hl6");

}
