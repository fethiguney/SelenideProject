package stepdefinitions;

import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepDef {

    @Given("user goes to {string} url")
    public void user_goes_to_url(String string) {
        open(string);
    }


}
