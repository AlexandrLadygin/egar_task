package by.zeon.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    protected static final String BASE_URL = "https://www.777555.by/";
    protected static final By CART_BUTTON_LOCATOR = By.xpath("//a[@class='h-cart']");
    protected static final By SEARCH_FIELD_LOCATOR = By.xpath("//input[@name='q']");
    protected static final By SEARCH_BUTTON_LOCATOR = By.xpath("//input[@class='button_search']");

    public BasePage typeTextToSearchField(String textForSearch) {
        $(SEARCH_FIELD_LOCATOR).setValue(textForSearch);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        $(SEARCH_BUTTON_LOCATOR).click();
        return new SearchResultPage();
    }

    public CartPage clickCartButton() {
        $(CART_BUTTON_LOCATOR).click();
        return new CartPage();
    }
}
