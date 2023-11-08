package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    private SelenideElement userName = $("#userName"),
                userEmail = $("#userEmail"),
                userCurrentAddress = $("#currentAddress"),
                userPermanentAddress = $("#permanentAddress"),
                submitButton = $("#submit"),
                output = $("#output");


    public TextBoxPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxPage typeName(String value) {
        userName.setValue(value);

        return this;
    }

    public TextBoxPage typeEmail(String value) {
        userEmail.setValue(value);

        return this;
    }

    public TextBoxPage typeCurrentAddress(String value) {
        userCurrentAddress.setValue(value);

        return this;
    }

    public TextBoxPage typePermanentAddress(String value) {
        userPermanentAddress.setValue(value);

        return this;
    }

    public TextBoxPage submitForm() {
        submitButton.click();

        return this;
    }

    public TextBoxPage checkTheEnteredData(String key, String value) {
        output.$("#" + (key)).shouldHave(text(value));

        return this;
    }
}
