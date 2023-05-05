package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AutomationExercisePage {

    public SelenideElement loginLink=$("a[href='/login']");

    public SelenideElement loginEmailInput=$("input[data-qa='login-email']");

    public SelenideElement loginPasswordInput=$("input[data-qa='login-password']");

    public SelenideElement loginButton=$("button[data-qa='login-button']");
}
