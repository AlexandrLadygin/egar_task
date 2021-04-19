package by.zeon.pages;

import by.zeon.loggers.AllureLogger;

import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage extends BasePage {
    private static final String PRODUCT_TITLE_LOCATOR = "//div[@class='pr-card-title']/h1";
    private static final String PRODUCT_PRICE_LOCATOR = "//div[@class='pr-card-price-block']/div[@class='pr-card-price']";
    private static final String ADD_TO_CART_BUTTON = "//a[@id='but_car_main']";

    public String getProductName() {
        String name = $x(PRODUCT_TITLE_LOCATOR).getText();
        AllureLogger.logInfo(String.format("Text from product name: '%s'.", name));
        return name;
    }

    public String getProductPrice() {
        String price = $x(PRODUCT_PRICE_LOCATOR).getText();
        AllureLogger.logInfo(String.format("Text from product price: '%s'.", price));
        return price;
    }

    public SearchResultPage clickAddToCartButton() {
        $x(ADD_TO_CART_BUTTON).click();
        AllureLogger.logInfo("Click cart button.");
        return this;
    }
}
