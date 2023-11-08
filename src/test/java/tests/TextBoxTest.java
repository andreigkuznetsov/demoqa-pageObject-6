package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void textBoxTest() {
        textBoxPage.openPage()
                .typeName("Nikola Protkov")
                .typeEmail("nprutlov@mail.ru")
                .typeCurrentAddress("101000, Russia, Moscow, PO Box 100")
                .typePermanentAddress("101000, Russia, Moscow, Red Square, 1")
                .submitForm()
                .checkTheEnteredData("name", "Nikola Protkov")
                .checkTheEnteredData("email", "nprutlov@mail.ru")
                .checkTheEnteredData("currentAddress", "101000, Russia, Moscow, PO Box 100")
                .checkTheEnteredData("permanentAddress", "101000, Russia, Moscow, Red Square, 1");
    }
}
