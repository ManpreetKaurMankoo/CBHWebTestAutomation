FROM maven:3.6.3-jdk-8
WORKDIR /home/cbhamazonassignment
COPY src /home/cbhamazonassignment/src
COPY test-output /home/cbhamazonassignment/test-output
COPY allure-results /home/cbhamazonassignment/allure-results
COPY pom.xml /home/cbhamazonassignment/pom.xml
COPY testng.xml /home/cbhamazonassignment/testng.xml
ENTRYPOINT mvn clean test