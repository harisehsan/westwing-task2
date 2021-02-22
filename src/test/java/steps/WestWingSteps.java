package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.WestWingNow;

public class WestWingSteps {

    private BaseUtil base;
    WestWingNow westWingNow;
    public WestWingSteps(BaseUtil base) {
        this.base = base;
        westWingNow = new WestWingNow(base.driver);
    }



    @Given("I am on the WestwingNow home page {string}")
    public void iAmOnTheWestwingNowHomePage(String url) {
        westWingNow.goToHomePage(url);
    }

    @When("I search for {string}")
    public void iSearchFor(String searchKeyword) {
       westWingNow.search(searchKeyword);
    }

    @Then("I should see product listing page with a list of products")
    public void iShouldSeeProductListingPageWithAListOfProducts() {
        Assert.assertTrue(westWingNow.shouldSeeTheListOfProduct(),"Either The required product is not existed or not searched correctlty!");
    }

    @When("I click on wishlist icon of the first found product")
    public void iClickOnWishlistIconOfTheFirstFoundProduct() throws InterruptedException {
      westWingNow.selectWishlistOfFirstProduct();
    }

    @And("I perform login if not already done")
    public void iShouldSeeTheLoginRegistrationOverlay() {
     westWingNow.performLoginIfRequire();
    }


    @Then("product should be added to the wishlist")
    public void theProductShouldBeAddedToTheWishlist() {
     Assert.assertTrue(westWingNow.ProductShouldBeAddedToWishList(),"The Product is not successfully added to wishlist!");
    }

    @And("I go to the wishlist page {string}")
    public void iGoToTheWishlistPage(String url) {
        westWingNow.navigateToWishList(url);
    }

    @And("I delete the product from my wishlist")
    public void iDeleteTheProductFromMyWishlist() {
        westWingNow.deleteTheProductFromWishList();
    }
}
