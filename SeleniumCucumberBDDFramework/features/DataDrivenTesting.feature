@DataDrivenTesting
Feature: Youtube Channel name validations
    Scenario Outline: Youtube Channel name validation
    Given Open Chrome browser with URL
    When Search Selnium Tutorial "<SearchString>"
    And Click on Channel name
    Then Validate Channel Name
 Examples:
 |SearchString|
 |Selenium by bakkappa n|
 |Selenium webdriver by bakkappa n|
 