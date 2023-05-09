package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import stepdefinitions.StepDefinitions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommonPage {

    public SelenideElement loginLink=$("a[href='/login']");

    public SelenideElement loginEmailInput=$("input[data-qa='login-email']");

    public SelenideElement loginPasswordInput=$("input[data-qa='login-password']");

    public SelenideElement loginButton=$("button[data-qa='login-button']");

    public SelenideElement alertMessage=$(By.xpath("//*[text()='Your email or password is incorrect!']"));

    public ElementsCollection checkboxes=$$("input[type='checkbox']");

    public SelenideElement radioButton(String str){
        return $("#"+str);
    }

    public SelenideElement year=$("select#year");

    public SelenideElement month=$("select#month");

    public SelenideElement day=$("select#day");

}
