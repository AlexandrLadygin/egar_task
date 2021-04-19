package by.zeon.steps;

import by.zeon.pages.CartPage;
import by.zeon.pages.HomePage;
import by.zeon.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {
    private String searchText;
    private HomePage homePage = new HomePage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private CartPage cartPage = new CartPage();

    @Given("I open Home Page")
    public void openHomePage() {
        homePage.openPage();
    }

    @When("I type {string} into search field")
    public void typeTextToSearchField(String searchText) {
        homePage.typeTextToSearchField(searchText);
        this.searchText = searchText;
    }

    @And("I click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("I click add product to cart button")
    public void iClickAddProductToCartButton() {
        searchResultPage.clickAddToCartButton();
    }

    @And("I click cart button")
    public void clickCartButton() {
        searchResultPage.clickCartButton();
    }

    @Then("The name of product should be {string}")
    public void verifyName(String expectedName) {
        String actualName = cartPage.getProductName(searchText);
        Assert.assertEquals(actualName, expectedName, "The names aren't equals!");

    }

    @And("The price of product should be {string}")
    public void verifyPrice(String expectedPrice) {
        String actualPrice = cartPage.getProductPrice(searchText);
        Assert.assertEquals(actualPrice, expectedPrice, "The prices aren't equals!");
    }
}
