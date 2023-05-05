package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.AutomationExercisePage;

import static com.codeborne.selenide.Condition.*;

import java.util.List;
import java.util.Map;

public class AutomationExerciseStepDef {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();


    @When("user clicks login page")
    public void user_clicks_login_page() {
        automationExercisePage.loginLink.click();
    }
    @When("user enters email and password")
    public void user_enters_email_and_password(DataTable dataTable) {
        List<Map<String, String>> data=dataTable.asMaps();
        automationExercisePage.loginEmailInput.setValue(data.get(0).get("email"));
        automationExercisePage.loginPasswordInput.setValue(data.get(0).get("password"));

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        automationExercisePage.loginButton.click();
    }
    @Then("verify alert message is displayed")
    public void alert_message_should_be_displayed() {
      automationExercisePage.alertMessage.shouldBe(visible);

    }


}
