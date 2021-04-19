package by.zeon.pages;

import by.zeon.loggers.AllureLogger;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    public HomePage openPage() {
        open(BASE_URL);
        AllureLogger.logInfo(String.format("Open Home Page: '%s'.", BASE_URL));
        return this;
    }
}
