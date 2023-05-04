package stepdefinitions;

import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDef {

    @Given("user goes to {string} url")
    public void user_goes_to_url(String string) {
        open(string);
    }

    @Then("user waits {int} seconds")
    public void user_waits_seconds(Integer number) {
        sleep(number*1000);
    }
    @Then("user navigates the back page")
    public void user_navigates_the_back_page() {
        back();
    }
    @Then("user navigates the forward page")
    public void user_navigates_the_forward_page() {
        forward();
    }
    @Then("user refresh the page")
    public void user_refresh_the_page() {
        refresh();
    }
    @Then("user keeps the page open")
    public void user_keeps_the_page_open() {

    }

}
