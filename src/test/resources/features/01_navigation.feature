
  Feature: Navigations

    @google
    Scenario: Navigations test
      Given user goes to "https://www.google.com.tr/" url
      Then user goes to "https://www.amazon.com" url
      And user waits 5 seconds
      Then user navigates the back page
      And user navigates the forward page
      Then user refresh the page
      And user keeps the page open