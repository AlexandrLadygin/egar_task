package by.zeon.pages;

import by.zeon.loggers.AllureLogger;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    protected static final String BASE_URL = "https://www.777555.by/";
    protected static final String CART_BUTTON_LOCATOR = ("//a[@class='h-cart']");
    protected static final String SEARCH_FIELD_LOCATOR = ("//input[@name='q']");
    protected static final String SEARCH_BUTTON_LOCATOR = ("//input[@class='button_search']");

    public BasePage typeTextToSearchField(String textForSearch) {
        $x(SEARCH_FIELD_LOCATOR).setValue(textForSearch);
        AllureLogger.logInfo(String.format("Type text '%s' into search field.", textForSearch));
        return this;
    }

    public SearchResultPage clickSearchButton() {
        $x(SEARCH_BUTTON_LOCATOR).click();
        AllureLogger.logInfo("Click search button.");
        return new SearchResultPage();
    }

    public CartPage clickCartButton() {
        $x(CART_BUTTON_LOCATOR).click();
        AllureLogger.logInfo("Click cart button.");
        return new CartPage();
    }
}
