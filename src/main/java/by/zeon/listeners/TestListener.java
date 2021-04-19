package by.zeon.listeners;

import by.zeon.loggers.AllureLogger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        AllureLogger.logInfo(String.format("Test method '%s' STARTED.", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        AllureLogger.logInfo(String.format("Test method '%s' SUCCESSFULLY PASSED.", result.getName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        AllureLogger.logDebug(String.format("Test method '%s' FAILED.", result.getName()));
    }
}
