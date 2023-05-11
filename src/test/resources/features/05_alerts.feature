
  Feature: Alerts
    @alert
    Scenario: Alerts test
      Given user goes to "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" url
      When user on alert page clicks on JS Prompt button
      And user sends "Hello" text to JS Prompt and clicks OK
      Then user validates JS prompt result text contains "Hello"