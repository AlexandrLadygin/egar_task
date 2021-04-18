package by.zeon.loggers;

import java.util.logging.Logger;

public class Log {
    private static java.util.logging.Logger LOGGER = Logger.getLogger("custom-logger");

    public static void info(String message) {
        LOGGER.info(message);
    }
}