For running Cucumber test:
mvn -Dsurefire.suiteXmlFiles=cucumber.xml clean test

For running default Java/TestNG test:
mvn -Dsurefire.suiteXmlFiles=testng.xml clean test

For getting allure report use (autotests should be passed):
mvn allure:serve
