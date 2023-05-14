
  @crossbrowser
  Feature: Cross Browser

    @firefox
    Scenario: firefox
      Given user selects firefox as the browser
      And user goes to "https://google.com" url

    @edge
    Scenario: edge
      Given user selects edge as the browser
      And user goes to "https://google.com" url

    @chrome
    Scenario: chrome
      Given user selects chrome as the browser
      And user goes to "https://google.com" url

    @headless
    Scenario: headless
      Given user selects headless as the browser
      And user goes to "https://google.com" url