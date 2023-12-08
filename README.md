# Selenium Java Test Automation Architecture Harbor Freight
by Kasim Safa

UI Test Automation Architecture using Java Cucumber and Selenium WebDriver  



## Installation Steps / QuickStart Guide!⭐

In order to use the framework:

1. Fork the repository.

2. Clone, i.e, download your copy of the repository to your local machine.

3. Use IntelliJ IDEA to run your desired tests.
You can use  [Runner*](src/test/java/com/hf_project/runners/Runner.java) to run tests with tags by specifying tags in `tags = "@tagname"` and  [*FailedRunner*](src/test/java/com/hf_project/runners/FailedRunner.java) to rerun failed tests!
Alternatively, you can use the terminal to run the tests, for example `mvn clean test` to run all tests, or `mvn -Dsurefire.rerunFailingTestsCount=4 clean test` to rerun failing tests automatically or `mvn -Dsurefire.rerunFailingTestsCount=4 clean test -Dbrowser=chrome -Dcucumber.filter.tags=@regression` for running specific tags / browser and rerunning failing tests automatically.
5. To see the report, go to the `target/cucumber` folder in the project root and then open any `.html` file in the browser.
## Project Structure
```bash
├───.idea
└───src
    └───test
        ├───java
        │   └───com
        │       └───hf_project
        │           ├───pages
        │           ├───runners
        │           ├───steps
        │           └───utilities
        └───resources
            ├───features
```
## Languages and Frameworks

The project uses the following:

- *[Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- *[Selenium WebDriver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- *[Cucumber](https://mvnrepository.com/artifact/io.cucumber/cucumber-java)
- *[cucumber reporting-plugin](https://mvnrepository.com/artifact/me.jvt.cucumber/reporting-plugin)
- *[Junit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- *[bonigarcia webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- *[maven-surefire-plugin](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin)
- *[IntelliJ IDEA](https://www.jetbrains.com/idea/)


## Basic Usage

- ### This project utilizes Maven⭐

  Dependency Management: Dependencies are defined in the `pom.xml` file.
  Build Automation: The build process is configured in the `pom.xml` file.
  Test Execution: Maven commands like `mvn clean test` can be used to run tests.

- ### Configuration⭐
  The project uses a [*config.properties*](config.properties) file to manage global configurations such as browser type and base url.

    To add a new property, register a new entry in this file:
      ```
      key=value
      ```

  use `getProperty()` method in [*ConfigurationReader*](src/test/java/com/hf_project/utilities/ConfigurationReader.java) class to read [*config.properties*](config.properties)
    
- ### Cucumber Integration⭐

    [Cucumber](https://cucumber.io/) is utilized for behavior-driven development (BDD) testing. Tests are written in feature files (Gherkin language) located in `src/test/resources/features`, and step definitions map Gherkin steps to Java code.

- ### Page Objects and Page Component Objects⭐
  The project uses Page Object Model Design
  `src/test/java/com/hf_project/pages`
  Page Objects represent individual web pages, encapsulating their elements and related behaviors. This design promotes code reusability and easier maintenance.
- ### Test Runner Configuration⭐

    The [*Runner*](src/test/java/com/hf_project/runners/Runner.java) class configures Cucumber options, specifying the location of feature files and step definitions for test execution.

- ###  Cucumber Reports⭐

    [Cucumber Reporting](https://cucumber.io/docs/cucumber/reporting/) enhances test result visualization.

    Cucumber reports are generated in HTML format and can be found in the `target/cucumber` directory after test execution.

    

- ### Browsers⭐
  The project contains the implementation of the `Chrome`,`Edge` and `Firefox` browsers. 





