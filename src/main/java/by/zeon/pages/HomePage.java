package by.zeon.pages;

import by.zeon.loggers.Log;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    public HomePage openPage() {
        open(BASE_URL);
        Log.info(String.format("Open Home Page: '%s'.", BASE_URL));
        return this;
    }
}
