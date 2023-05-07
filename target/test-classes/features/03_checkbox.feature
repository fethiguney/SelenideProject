
  Feature: Checkbox Test

    @checkbox
    Scenario: Checkbox Test
      Given user goes to "https://the-internet.herokuapp.com/checkboxes" url
      Then If checkbox 1 is not selected, click the checkbox and validate
      And If checkbox 2 is not selected, click the checkbox and validate

    @radioButton
    Scenario: Radio Button Test
      Given user goes to "https://testcenter.techproeducation.com/index.php?page=radio-buttons" url
      Then If "basketball" radio button is not selected, click the red radio button and validate
