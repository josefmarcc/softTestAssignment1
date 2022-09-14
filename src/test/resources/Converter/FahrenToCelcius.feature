Feature: Convert fahrenheit to celcius
  Scenario: User should be able to convert fahrenheit to celcius
    Given user want to convert 50 fahrenheit to celcius
    When user enters 50 fahrenheit
    Then fahrenheit is converted to 10 celcius