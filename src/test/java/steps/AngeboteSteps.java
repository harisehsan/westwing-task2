package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.AngebotePage;

import java.awt.*;
import java.io.IOException;

public class AngeboteSteps {

    private BaseUtil base;
    AngebotePage angebotePage;
    public AngeboteSteps(BaseUtil base) throws AWTException {
        this.base = base;
        angebotePage = new AngebotePage(base.driver);
    }


    @Given("I goto to url {string}")
    public void iGotoToUrl(String url) {
        angebotePage.goToUrl(url);
    }

    @When("I select Angebote")
    public void iSelectAngebote() {
      angebotePage.selectAngebote();
    }

    @And("I select the Privathaftpflicht option in the Angebote menu")
    public void iSelectThePrivathaftpflicht() {
        angebotePage.selectPrivathaftpflicht();
    }

    @And("I select Angebote anzeigen button on the questionnaire page")
    public void iSelectAngeboteAnzeigenButton() {
        angebotePage.selectAngeboteAnzeigen();
    }

    @And("I select Zum angebote button on the offer request page")
    public void iSelectZumAngeboteButton() {
        angebotePage.selectZumAngeboteButton();
    }

    @And("I select the recommended offer on the available offers page")
    public void iSelectTheRecommendedOffersOnTheAvailableOfferPage() throws InterruptedException, IOException {
        angebotePage.selectTheRecommendedOffer();
    }

    @And("I perform registration with random dummy account")
    public void iPerformRegistrationWithRandomDummyAccount() throws InterruptedException, IOException {
       angebotePage.performRegestrationUsingDummyAccount();
    }

    @And("I enter the personal details on the checkout profile page")
    public void iEnterThePersonalDetailsOnTheCheckoutProfilePage() {
       angebotePage.enterPersonalDetailsonCheckoutProfile();
    }

    @And("I select the start date on the checkout start date page")
    public void iSelectTheStartDateOnTheCheckoutPage() throws InterruptedException {
        angebotePage.selectStartDate();
    }

    @And("I enter the bank details on the checkout payment details page")
    public void iEnterTheBankDetailsOnTheCheckoutPaymentDetailsPage() throws InterruptedException {
        angebotePage.enterTheBankAccountNumber();
    }

    @And("I select the Zum Abschluss button on checkout summary page")
    public void iSelectTheZumAbschlussButtonOnCheckoutSummaryPage() {
        angebotePage.selectZumAbschlussButtonOnAccountSummaryPage();
    }

    @And("I proceed to the manager page")
    public void iProceedToTheManagerPage() {
        angebotePage.proceedToTheManagerPage();
    }

    @Then("I verify the existence of Privathaftpflicht on manager page")
    public void iVerifyTheExistenceOfPrivathaftpflichtOnManagerPage() throws InterruptedException {
        Assert.assertTrue(angebotePage.verifyTheExistenceOfPrivathaftpflichtOnManagerPage(),"Either the Privathaftpflicht is not existed on the manager page or not successfully navigated to manager page!");
    }
}
