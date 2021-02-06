# podium-test

> Java and Selenium WebDriver based BDD framework. It can be also configured for cross device or platform testing as well as end-2-ens testing. Cucumber provides language-bindings for the powerful browser-driving tool Selenium. Its Gherkin language allows you to write your tests in a way that can be easily read by anyone on your team. Cucumber Java integrates easily with the CrossBrowserTesting platform, so you can perform tests on a wide variety of OS/Device/Browser combinations, all from one test.

## Prerequisites
- IDE: IntelliJ IDEA
- Language: Java jdk8+
- Build Tool: Maven
- Selenium WebDriver
- Cucumber

## Installation

1) After prerequisites are set:

```bash
git clone 'podium-test'
```
2) unzip and open project on IntelliJ IDEA
3) run test 'TestRunner.class' under src/test/java/TestRunner/TestRunner
4) view simple cucumber test report under /target/default-html-reports/index.html
(It can be also configured pretty cucumber report with more details)

# Use Maven
Open a command window and run:

```
./mvnw test
```

This runs Cucumber features using Cucumber's JUnit runner. The @RunWith(Cucumber.class) annotation on the RunCucumberTest class tells JUnit to kick off Cucumber.

You may specify files to run by filesystem path:
```
-Dcucumber.features="src/test/resources/features/LoginPage.feature
```

In case you want to run feature files or scenarios, separate them with commas ```,```

```
-Dcucumber.features="src/test/resources/features/LoginPage.feature, src/test/resources/features/CareersPage.feature"

```
You can also specify what to run by tag:

```
-Dcucumber.filter.tags="@homepage"

```
Running only the scenarios that failed in the previous run:
```
-Dcucumber.features="@target/rerun.txt"
```
Specify a different formatter:
```
-Dcucumber.plugin="junit:target/cucumber-junit-report.xml"
```

    
    

