package by.zeon.loggers;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllureLogger {
    private static final Logger logger = LogManager.getLogger(AllureLogger.class);

    @Step("{0}")
    public static void logInfo(String log) {
        logger.info("Logged to allure: " + log);
    }

    public static void logDebug(String log) {
        logger.debug("Logged to allure: " + log);
    }
}
