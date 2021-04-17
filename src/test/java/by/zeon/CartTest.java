package by.zeon;


import by.zeon.pages.CartPage;
import by.zeon.pages.HomePage;
import by.zeon.pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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

        Assert.assertEquals(name, resultName, "The names aren't equals!");
        Assert.assertEquals(price, resultPrice, "The prices aren't equals!");
    }
}
