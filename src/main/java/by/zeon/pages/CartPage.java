package by.zeon.pages;

import by.zeon.loggers.AllureLogger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CartPage extends BasePage {
    private static final String CART_PAGE_URL = "/cart.php?id";
    private static final String PRODUCT_NAME_PATH = "//div[@class='cart-items']" +
            "//div[@class='cart-item flex valign-center']" +
            "//div[@class='cart-item-product-title']/a[contains(text(),'%s')]";
    private static final String PRODUCT_PRICE_PATH = "//div[@class='cart-items']" +
            "//div[@class='cart-item flex valign-center']//div[@class='cart-item-product-title']" +
            "/a[contains(text(),'%s')]/ancestor::div[@class='cart-item flex valign-center']" +
            "//div[@class='cart-item-price']";

    public String getProductName(String name) {
        String resultName = $(By.xpath(String.format(PRODUCT_NAME_PATH, name))).getText();
        AllureLogger.logInfo(String.format("Text from product name: '%s'.", resultName));
        return resultName;
    }

    public String getProductPrice(String name) {
        String resultPrice = $(By.xpath(String.format(PRODUCT_PRICE_PATH, name))).getText();
        AllureLogger.logInfo(String.format("Text from product price: '%s'.", resultPrice));
        return resultPrice;
    }

    public CartPage openPage() {
        String cartPageUrl = String.format(BASE_URL.concat(CART_PAGE_URL));
        open(cartPageUrl);
        AllureLogger.logInfo(String.format("Open Cart Page: '%s'.", cartPageUrl));
        return this;
    }
}
