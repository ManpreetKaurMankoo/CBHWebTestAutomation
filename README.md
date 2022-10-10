# CBH Assignment - Web Test Automation Framework
---
## About the framework:

**This is a Test Driven Web Automation Framework built using below open-source libraries (these do not need any license):**

- Selenium library v4.4.0 to automate web browsers
- Java v1.8 as programming language
- Maven v3.10.1 to build the project and for dependencies
- TestNG v7.6.0 framework for handling and triggering the tests
- AssertJ library v3.23.1 for custom assertions for having fluent and readable tests
- Lombok library v.1.18.22 for reducing boilerplate code while creating POJOs and framework constants
- Owner library v1.0.12 for reducing verbosity and boilerplate code while reading properties file
- JSON file as data source for test data
- Test Data Supplier library v1.9.6 for suppling the data to the test in the form of streams from JSON file
- Allure library v2.17.0 for Allure report
- Allure-Maven library v2.11.2 for integration between the two
- WebDriverManager library v5.3.0 for managing web drivers like chrome (others if needed, in future)

---
## Features of the framework:
**Please note**:
Though I have added the provision to run the test on remote mode - selenoid, with (docker-compose.yml file and browsers.json file added), I have not been able to execute using it due to docker related set up issues on my system (Windows Home). But I have added it anyway to showcase how the same can be achieved.

**The framework**:
- Has separation of concerns
- Follows the Arrange (building test data), Act (doing actions on the web browser) and Assert (making assertions) pattern for the test
- Uses Page Object Model pattern (page layers - that has page specific element locators and corresponding functions) via which tests interact with the web elements on the browser
- Uses Composition and Facade pattern to create page components for better readability, maintainability and scalability
- Uses Data Supplier to supply the data from JSON file to the test in form of stream. More data can be added to this file for the same test. For more tests, more such JSON files and data supplier can be added
- Uses POJOs and builder pattern for building test data
- Data is passed to each required page through constructors in page layers
- Has one assertion verifying the 'About this item' text is present on the Product Description Page. It is a custom fluent assertion using AssertJ, more assertions can be added in a fluent way
- Uses explicit wait strategy (Facatory Method pattern) for interacting with the web elements
- Uses dynamic xpath creation strategy during run time for elements having common locator xpaths
- Is designed in such a way that multiple tests can be run in parallel at a time
- Uses ThreadLocal to get the exact driver thread instance, exact test node thread for allure reporting and exact parent window thread opened (to be closed later on) during parallel execution
- Uses owner library for reducing verbosity and boilerplate code while reading properties file
- Has additional abstract layers (Facade pattern) to separate third party libraries and business logic: FrameworkConfigService, DynamicXpathService, JavascriptService
- Has selenium related helper methods for page actions
- Uses Converter interface to convert an input string coming from a property value to a target object returned by the Config method
- Has framework custom exceptions which can be leveraged in future as well to add more custom exceptions
- Has the provision to run the test on Chrome browser in local or remote mode - selenoid (was not able to execute). Either of these values can be given through the FrameworkConfig.properties file
- In the remote mode as well, it can be extended to run on selenium grid or any cloud provider, in future, if needed. Either of these values can be given through the FrameworkConfig.properties file
- Has the provision to run the test in dockerized selenoid (was not able to execute) as docker compose file for it is provided, so that test can be run on different browsers, versions and OS
- Dockerizes the framework by buiding a docker image of the test
- Has used Supplier, Functional interface, driver factories and driver managers to manage the run modes (local, remote), remote modes (selenoid, selenium grid)
- Has Allure annotations (@Epic, @Feature, @Owner at Classes level, @Story, @Description, @Severity at Tests level) to get reflected in Allure report
- Has Listeners to listen to the pass, fail, skip, etc events and log them in the allure report
- Has Allure logs while taking actions on the browser and while making the assertion; to get reflected in Allure report
- Follows coding standards and naming conventions for packages, classes (noun), methods (verb), variables, constants, folders and files
- Uses KISS, DRY, SRP, Open/Closed, YAGNI, Composition over Inheritance design principles
- Uses Page Object Model, Facade, Factory Method, Fluent, Builder design patterns
- Is clean, readable, scalable, robust and maintenable
- has been analysed using sonarlist for code quality
---
## How to use the framework and how it works?

## Pre-requisites:

- IDE - Eclipse/IntelliJ/Other
- Maven
- Allure
- Install Lombok plugin and other settings to be done (if using Eclipse)
- Java
- TestNG
- Docker should be installed to support running the test using selenoid
-----
## Test execution

How to run the tests (locally):

It can be done in two ways:
A. Through testng.xml file:
1. Go to the testng.xml present at the root of the project.

**Right click --> Run As --> TestNG Suite**

B. Using maven through command prompt or git bash or terminal:
1. Open command prompt/terminal → Go to the project path/directory using cd <project directory>→ Run the below command:
**mvn clean test**

Using the above command, maven surefire plugin in the pom.xml triggers the testng.xml file which has the details of the tests to be executed.

How to run the tests on selenoid using docker container:
1. Go to the path where docker-compose.yml file is present. Run the below command:
**docker-compose up**

After running the above command, go to localhost:4444 and localhots:8080 to see the setup ready. Run the tests either through testng.xml or through maven. Execution could be seen at the above ports.
  
-----
How to view the allure report:

1. Execute the tests.
2. To open Allure report, run the below command:
**allure serve**
  
-----
## Test Report

