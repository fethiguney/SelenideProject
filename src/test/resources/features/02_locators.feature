
  Feature: Locators

    @locators
    Scenario: Locators Test
      Given user goes to "https://www.automationexercise.com/" url
      When user clicks login page
      And user enters email and password
      |email         |password|
      |test@gmail.com| 1234   |
      When user clicks login button
      Then "Your email or password is incorrect!" alert message should be displayed
