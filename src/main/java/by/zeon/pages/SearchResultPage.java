package by.zeon.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends BasePage {
    private static final By PRODUCT_TITLE_LOCATOR = By.xpath("//div[@class='pr-card-title']/h1");
    private static final By PRODUCT_PRICE_LOCATOR = By.xpath("//div[@class='pr-card-price-block']/div[@class='pr-card-price']");
    private static final By ADD_TO_CART_BUTTON = By.xpath("//a[@id='but_car_main']");

    public String getProductPrice() {
        String price = $(PRODUCT_PRICE_LOCATOR).getText();
        return price;
    }

    public String getProductName() {
        String name = $(PRODUCT_TITLE_LOCATOR).getText();
        return name;
    }

    public SearchResultPage clickAddToCartButton() {
        $(ADD_TO_CART_BUTTON).click();
        return this;
    }
}
