package stepdefinitions;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

import java.util.List;
import java.util.Map;

public class StepDefinitions {

    CommonPage commonPage =new CommonPage();


    @When("user clicks login page")
    public void user_clicks_login_page() {
        commonPage.loginLink.click();
    }
    @When("user enters email and password")
    public void user_enters_email_and_password(DataTable dataTable) {
        List<Map<String, String>> data=dataTable.asMaps();
        commonPage.loginEmailInput.setValue(data.get(0).get("email"));
        commonPage.loginPasswordInput.setValue(data.get(0).get("password"));

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        commonPage.loginButton.click();
    }
    @Then("verify alert message is displayed")
    public void alert_message_should_be_displayed() {
      commonPage.alertMessage.shouldBe(visible);

    }
    @Then("^If (checkbox 1|checkbox 2) is not selected, click the checkbox and validate$")
    public void checkbox_control(String checkbox){
        switch (checkbox){
            case ("checkbox 1") :
                if (!commonPage.checkboxes.get(0).isSelected()) {
                    commonPage.checkboxes.get(0).click();
                }
                commonPage.checkboxes.get(0).shouldBe(checked);
                break;
            case ("checkbox 2") :
                if (!commonPage.checkboxes.get(1).isSelected()) {
                    commonPage.checkboxes.get(1).click();
                }
                commonPage.checkboxes.get(1).shouldBe(checked);
                break;
        }
    }

    @Then("^If \"([a-zA-Z]*)\" radio button is not selected, click the (?:[a-zA-Z]*) radio button and validate$")
    public void radio_button_control(String radioButtonId) {

        SelenideElement element=commonPage.radioButton(radioButtonId);

        if (!element.isSelected()) {
            element.click();
        }
        element.shouldBe(checked);

    }

    @Then("^user selects ([0-9]{2}+) day \"([a-zA-Z]*)\" month and ([0-9]{4}+) year$")
    public void dropdown_button_select_day_month_year(int day, String month, int year){
        commonPage.year.selectOptionByValue(String.valueOf(year));
        commonPage.month.selectOption(month);
        commonPage.day.selectOptionByValue(String.valueOf(day));
        Configuration.holdBrowserOpen=true;
    }

}
