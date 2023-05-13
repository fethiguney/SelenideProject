package stepdefinitions;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.CommonPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class StepDefinitions {

    CommonPage commonPage = new CommonPage();


    @When("user clicks login page")
    public void user_clicks_login_page() {
        commonPage.loginLink.click();
    }

    @When("user enters email and password")
    public void user_enters_email_and_password(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
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
    public void checkbox_control(String checkbox) {
        switch (checkbox) {
            case ("checkbox 1"):
                if (!commonPage.checkboxes.get(0).isSelected()) {
                    commonPage.checkboxes.get(0).click();
                }
                commonPage.checkboxes.get(0).shouldBe(checked);
                break;
            case ("checkbox 2"):
                if (!commonPage.checkboxes.get(1).isSelected()) {
                    commonPage.checkboxes.get(1).click();
                }
                commonPage.checkboxes.get(1).shouldBe(checked);
                break;
        }
    }

    @Then("^If \"([a-zA-Z]*)\" radio button is not selected, click the (?:[a-zA-Z]*) radio button and validate$")
    public void radio_button_control(String radioButtonId) {

        SelenideElement element = commonPage.radioButton(radioButtonId);

        if (!element.isSelected()) {
            element.click();
        }
        element.shouldBe(checked);

    }

    @Then("^user selects ([0-9]{2}+) day \"([a-zA-Z]*)\" month and ([0-9]{4}+) year$")
    public void dropdown_button_select_day_month_year(int day, String month, int year) {
        commonPage.year.selectOptionByValue(String.valueOf(year));
        commonPage.month.selectOption(month);
        commonPage.day.selectOptionByValue(String.valueOf(day));

    }

    @When("^user on alert page clicks on (JS Alert|JS Confirm|JS Prompt) button?")
    public void js_alert_buttons_click(String button) {
        switch (button) {
            case ("JS Prompt"):
                commonPage.jsPromptButtonClick();
                break;
        }
    }

    @And("^user sends \"([a-zA-Z]*)\" text to JS Prompt and clicks OK$")
    public void send_text_to_js_prompt(String str) {
        switchTo().alert().sendKeys(str);
        switchTo().alert().accept();
    }

    @Then("^user validates JS prompt result text contains \"([a-zA-Z]*)\"$")
    public void validate_result_contains_text(String str) {
        commonPage.jsPromptResultText().shouldHave(text(str));
    }

    @When("user switch to iframe {int}")
    public void user_switch_to_iframe(Integer index) {
        switchTo().frame(index - 1);
    }

    @When("user clicks on back to techproeducation button")
    public void user_clicks_on_back_to_techproeducation_button() {
        commonPage.backToTechproLinkClick();

    }

    @When("user switch to window {int}")
    public void user_switch_to_window(Integer targetWindow) {
        switchTo().window(targetWindow-1);
    }

    @When("user takes the screenshot of page")
    public void user_takes_the_screenshot_of_page(){
        screenshot(new Date().toString());
    }
    @And("^user takes the screenshot of (?:[a-zA-Z]*) image$")
    public void user_takes_the_screenshot_of_webelement(){
        commonPage.automationExerciseLogo.screenshot();
    }

    @Given("^user selects (chrome|firefox|edge) as the browser$")
    public void user_selects_the_browser(String browser){

        switch (browser) {
            case ("chrome"):
                Configuration.browser="chrome";
                break;
            case ("firefox"):
                Configuration.browser="firefox";
                break;
            case ("edge"):
                Configuration.browser="edge";
                break;

        }
    }

}
