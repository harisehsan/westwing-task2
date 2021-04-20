package pages;

import Properties.AngeboteInitilizeProperties;
import Properties.AngeboteProperties;
import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobject.AngebotePageObject;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AngebotePage extends Base {


    AngebotePageObject angebotePageObject = new AngebotePageObject();
    AngeboteProperties angeboteProperties = new AngeboteProperties();
    AngeboteInitilizeProperties angeboteInitilizeProperties = new AngeboteInitilizeProperties();
    Random rand = new Random();


    public AngebotePage(WebDriver driver) throws AWTException {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, angebotePageObject);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void goToUrl(String url)
    {
        int tries =0;
        do {
            goToPage(url);
            waitUntilPageReady();
            tries++;
        } while (driver.getCurrentUrl().contains("login") && tries < 3);
        checkForAcceptCookie();
    }

    private void checkForAcceptCookie() {
        if (booleanwaitUntilPresentOfElementBy(angebotePageObject.cookie_Accept_btn_By,10))
        {
            angebotePageObject.cookie_Accept_btn.click();
        }
    }

    public void selectAngebote() {
        waitUntilClickable(angebotePageObject.angebote_lnktxt_By);
        angebotePageObject.angebote_lnktxt.click();
    }

    public void selectPrivathaftpflicht()
    {
        waitUntilClickable(angebotePageObject.privathaftpflicht_wgt_By);
        angebotePageObject.privathaftpflicht_wgt.click();
    }

    public void selectAngeboteAnzeigen()
    {
        waitUntilPageReady();
        waitUntilClickable(angebotePageObject.losLogen_btn_By);
        angebotePageObject.losLogen_btn.click();
        waitUntilClickable(angebotePageObject.angebote_anzeigen_btn_By);
        angebotePageObject.angebote_anzeigen_btn.click();
    }

    public void selectZumAngeboteButton()
    {
        waitUntilClickable(angebotePageObject.zum_angebote_btn_By);
        angebotePageObject.zum_angebote_btn.click();
    }

    public void selectTheRecommendedOffer() throws InterruptedException, IOException {
        waitUntilClickable(angebotePageObject.select_Recommended_offer_btn_By);
        angebotePageObject.select_Recommended_Offer_btn.click();
    }

    public void performRegestrationUsingDummyAccount() throws InterruptedException, IOException {
        angeboteInitilizeProperties.initiliazeProperties();
        waitUntilPageReady();
        HandleBrowserAuthentication();
        waitUntilClickable(angebotePageObject.email_Address_txtbox_By);
        angebotePageObject.email_Address_txtbox.clear();
        angebotePageObject.email_Address_txtbox.sendKeys(angeboteProperties.getDummyID()+"."+rand.nextInt(10000)+"@stagging.clark.de");
        angebotePageObject.password_txtbox.clear();
        angebotePageObject.password_txtbox.sendKeys(angeboteProperties.getPassword());
        angebotePageObject.register_btn.click();
    }

    public void enterPersonalDetailsonCheckoutProfile()
    {
       waitUntilPageReady();
       waitUntilClickable(angebotePageObject.herr_rdobtn_By);
       angebotePageObject.herr_rdobtn.click();
       angebotePageObject.vorname_txtBox.sendKeys(angeboteProperties.getFirstName());
       angebotePageObject.nachname_txtbox.sendKeys(angeboteProperties.getLastName());
       angebotePageObject.straße_txtbox.sendKeys(angeboteProperties.getStreet());
       angebotePageObject.hausnr_txtbox.sendKeys(angeboteProperties.getHouseNumber());
       angebotePageObject.plz_txtbox.sendKeys(angeboteProperties.getPostCode());
       angebotePageObject.ort_txtbox.sendKeys(angeboteProperties.getPlace());
       angebotePageObject.geburtsdatum_txtbox.sendKeys(angeboteProperties.getDateOfBirth());
       angebotePageObject.telefonenummer_txtbox.sendKeys(angeboteProperties.getTelephoneNumber());
       waitUntilClickable(angebotePageObject.weiter_btn_By);
       angebotePageObject.weiter_btn.click();
    }

    public void selectStartDate() throws InterruptedException {
        waitUntilVisible(angebotePageObject.start_Date_Page_lbl);
        waitUntilClickable(angebotePageObject.start_Date_rdobtn_By);
        angebotePageObject.start_Date_rdobtn.get(0).click();
        scrollToView(angebotePageObject.five_Years_damage_lbl);
        waitUntilClickable(angebotePageObject.start_Date_rdobtn_By);
        angebotePageObject.start_Date_rdobtn.get(2).click();
        waitUntilClickable(angebotePageObject.weiter_btn_By);
        angebotePageObject.weiter_btn.click();
    }

    public void enterTheBankAccountNumber() throws InterruptedException {
        waitUntilClickable(angebotePageObject.iban_txtbox_By);
        angebotePageObject.iban_txtbox.sendKeys(AngeboteProperties.getIban());
        scrollToView(angebotePageObject.direct_Debit_txtBox);
        angebotePageObject.direct_Debit_txtBox.click();
        waitUntilClickable(angebotePageObject.weiter_btn_By);
        angebotePageObject.weiter_btn.click();
    }

    public void selectZumAbschlussButtonOnAccountSummaryPage()
    {
        waitUntilClickable(angebotePageObject.zum_Abschluss_btn_By);
        angebotePageObject.zum_Abschluss_btn.click();
    }

    public void proceedToTheManagerPage()
    {
      waitUntilClickable(angebotePageObject.zur_Vertragsübersicht_btn_By);
      angebotePageObject.zur_Vertragsübersicht_btn.click();
      waitUntilClickable(angebotePageObject.feedback_Close_btn_By);
      angebotePageObject.feedback_Close_btn.click();
    }

    public boolean verifyTheExistenceOfPrivathaftpflichtOnManagerPage() throws InterruptedException {
        waitUntilVisible(angebotePageObject.insurance_Type_lbl);
        return (angebotePageObject.insurance_Type_lbl.getText().equalsIgnoreCase("Privathaftpflicht")
                && driver.getCurrentUrl().contains("staging.clark.de/de/app/manager"));
    }
}
