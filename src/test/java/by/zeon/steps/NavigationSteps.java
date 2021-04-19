package by.zeon.steps;

import by.zeon.pages.CartPage;
import by.zeon.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class NavigationSteps {
    private HomePage homePage = new HomePage();
    private CartPage cartPage = new CartPage();

    @Given("I open Home Page")
    public void openHomePage() {
        homePage.openPage();
    }

    @And("I open Cart Page")
    public void clickCartButton() {
        cartPage.openPage();
    }
}
