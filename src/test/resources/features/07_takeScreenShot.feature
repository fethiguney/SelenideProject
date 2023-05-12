
  Feature: Take ScreenShot

    @getscreenshot
    Scenario: Take screenshot test
      Given user goes to "https://automationexercise.com" url
      When user takes the screenshot of page
      And user takes the screenshot of automationexercise image