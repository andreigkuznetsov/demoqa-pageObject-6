package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fullDataTypingInToFormTest() {
        registrationPage.openPage()
                .typeFirstName("Nate")
                .typeLastName("Late")
                .typeEmail("nlate@mail.ru")
                .makeGenderChoice("Male")
                .typePhone("1234567890")
                .typeDateOfBirth("30", "9", "1996")
                .typeSubject("c", "Commerce")
                .typeHobby("Music")
                .uploadImage()
                .typeAddress("Russia")
                .typeStateAndCity("Delhi", "NCR")
                .submitRegistration()
                .checkModalTitle("Thanks for submitting the form")
                .checkRegistrationResults("Student Name", "Nate Late")
                .checkRegistrationResults("Student Email", "nlate@mail.ru")
                .checkRegistrationResults("Gender", "Male")
                .checkRegistrationResults("Mobile", "1234567890")
                .checkRegistrationResults("Date of Birth", "30 October,1996")
                .checkRegistrationResults("Subjects", "Commerce")
                .checkRegistrationResults("Hobbies", "Music")
                .checkRegistrationResults("Picture", "pic.jpg")
                .checkRegistrationResults("Address", "Russia")
                .checkRegistrationResults("State and City", "NCR Delhi")
                .closeModalWidow();
    }

    @Test
    void minimumDataTypingInToFormTest() {
        registrationPage.openPage()
                .typeFirstName("Nate")
                .typeLastName("Late")
                .makeGenderChoice("Male")
                .typePhone("1234567890")
                .submitRegistration()
                .checkModalTitle("Thanks for submitting the form")
                .checkRegistrationResults("Student Name", "Nate Late")
                .checkRegistrationResults("Gender", "Male")
                .checkRegistrationResults("Mobile", "1234567890")
                .closeModalWidow();
    }

    @Test
    void invalidEmailFieldTypingTest() {
        registrationPage.openPage()
                .typeFirstName("Nate")
                .typeLastName("Late")
                .typeEmail("@r.rt")
                .makeGenderChoice("Male")
                .typePhone("1234567890")
                .submitRegistration()
                .checkEmailTyping("border-color", "rgb(220, 53, 69)");
    }

    @Test
    void invalidPhoneFieldTypingTest() {
        registrationPage.openPage()
                .typeFirstName("Nate")
                .typeLastName("Late")
                .typeEmail("nlate@mail.ru")
                .makeGenderChoice("Male")
                .typePhone("123456789")
                .submitRegistration()
                .checkPhoneTyping("border-color", "rgb(220, 53, 69)");
    }
}
