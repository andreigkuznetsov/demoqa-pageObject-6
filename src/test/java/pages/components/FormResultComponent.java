package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormResultComponent {

    private final static SelenideElement resultsTable = $(".table-responsive");

    public void checkRegistrationResults(String label, String value) {
        resultsTable.$(byText(label)).parent().shouldHave(text(value));
    }
}
