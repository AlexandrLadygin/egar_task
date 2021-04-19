package by.zeon.steps;

import by.zeon.pages.HomePage;
import by.zeon.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchSteps {
    private HomePage homePage = new HomePage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private TestContext testContext;

    public SearchSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("I type {string} into search field")
    public void typeTextToSearchField(String searchText) {
        homePage.typeTextToSearchField(searchText);
        this.testContext.setSearchText(searchText);
    }

    @And("I click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("I click add product to cart button")
    public void iClickAddProductToCartButton() {
        searchResultPage.clickAddToCartButton();
    }
}
