package by.zeon;


import by.zeon.listeners.TestListener;
import by.zeon.pages.CartPage;
import by.zeon.pages.HomePage;
import by.zeon.pages.SearchResultPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners({TestListener.class})
public class CartTest {

    @Test
    public void selenideTestPO() {
        String productName = "Apple iPhone XR 128GB";
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.typeTextToSearchField(productName);
        SearchResultPage searchResultPage = homePage.clickSearchButton();
        String name = searchResultPage.getProductName();
        String price = searchResultPage.getProductPrice();
        searchResultPage.clickAddToCartButton();
        CartPage cartPage = searchResultPage.clickCartButton();
        String resultName = cartPage.getProductName(productName);
        String resultPrice = cartPage.getProductPrice(productName);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(name, resultName, "The names aren't equals!");
        softAssert.assertEquals(price, resultPrice, "The prices aren't equals!");
        softAssert.assertAll();
    }
}
