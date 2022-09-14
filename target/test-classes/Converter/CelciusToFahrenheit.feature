Feature: Convert Celcius to fahrenheit
  Scenario: User should be able to convert celcius to fahrenheit
    Given user want to convert 200 celcius to fahrenheit
    When user enters 200 celcius
    Then celcius is converted to 392 fahrenheit