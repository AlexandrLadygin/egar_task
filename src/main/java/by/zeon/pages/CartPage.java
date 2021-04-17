package by.zeon.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {
    private static final String PRODUCT_NAME_PATH = "//div[@class='cart-items']//div[@class='cart-item flex valign-center']//div[@class='cart-item-product-title']/a[contains(text(),'%s')]";
    private static final String PRODUCT_PRICE_PATH = "//div[@class='cart-items']//div[@class='cart-item flex valign-center']//div[@class='cart-item-product-title']/a[contains(text(),'%s')]/ancestor::div[@class='cart-item flex valign-center']//div[@class='cart-item-price']";

    public String getProductName(String name) {
        String resultName = $(By.xpath(String.format(PRODUCT_NAME_PATH, name))).getText();
        return resultName;
    }

    public String getProductPrice(String name) {
        String resultPrice = $(By.xpath(String.format(PRODUCT_PRICE_PATH, name))).getText();

        return resultPrice;
    }
}
