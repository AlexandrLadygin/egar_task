package by.zeon.listeners;

import by.zeon.loggers.Log;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Log.info(String.format("Test method '%s' STARTED.", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info(String.format("Test method '%s' SUCCESSFULLY PASSED.", result.getName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.info(String.format("Test method '%s' FAILED.", result.getName()));
    }
}
