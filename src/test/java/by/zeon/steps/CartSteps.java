package by.zeon.steps;

import by.zeon.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartSteps {
    private CartPage cartPage = new CartPage();
    private TestContext testContext;

    public CartSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then("The name of product should be {string}")
    public void verifyName(String expectedName) {
        String searchText = testContext.getSearchText();
        String actualName = cartPage.getProductName(searchText);
        Assert.assertEquals(actualName, expectedName, "The names aren't equals!");

    }

    @And("The price of product should be {string}")
    public void verifyPrice(String expectedPrice) {
        String searchText = testContext.getSearchText();
        String actualPrice = cartPage.getProductPrice(searchText);
        Assert.assertEquals(actualPrice, expectedPrice, "The prices aren't equals!");
    }
}
