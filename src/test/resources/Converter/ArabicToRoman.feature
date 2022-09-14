Feature: Convert arabic numeral to roman numeral
  Scenario: User should be able to convert arabic numerals to romal numerals
    Given user wants to convert 10 to roman numerals
    When user enters 10
    Then 10 is converted to "X"