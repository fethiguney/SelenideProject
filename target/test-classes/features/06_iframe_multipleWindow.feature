
  Feature: Iframe and Multiple Window
    
    @iframe
    Scenario: Iframe and Multiple Window Test
      Given user goes to "https://testcenter.techproeducation.com/index.php?page=iframe" url
      When user switch to iframe 1
      And user clicks on back to techproeducation button
      When user switch to window 2
      And user keeps the page open
