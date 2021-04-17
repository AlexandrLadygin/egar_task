package by.zeon.pages;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    public HomePage openPage() {
        open(BASE_URL);
        return this;
    }
}
