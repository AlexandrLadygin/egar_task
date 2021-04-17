For running Cucumber test:
mvn clean test
or
mvn -Dsurefire.suiteXmlFiles=cucumber.xml clean test

For running default Java/TestNG test:
mvn -Dsurefire.suiteXmlFiles=testng.xml clean test
