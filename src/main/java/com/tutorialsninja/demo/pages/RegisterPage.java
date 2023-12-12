package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(name = "confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(name = "newsletter")
    WebElement newsletter;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueAfterPrivacyButton;

    public void sendFirstName(String inputFirstName) {
        Reporter.log("Enter first name" + inputFirstName + "to field " + firstName.toString());
        sendTextToElement(firstName, inputFirstName);
        CustomListeners.test.log(Status.PASS, "Enter first name " + inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        Reporter.log("Enter last name" + inputLastName + "to field " + lastName.toString());
        sendTextToElement(lastName, inputLastName);
        CustomListeners.test.log(Status.PASS, "Enter last name " + inputLastName);
    }

    public void sendEmail(String text) {
        Reporter.log("Enter email" + text + "to email field " + email.toString());
        sendTextToElement(email, text + getRandomAlphaNumericString(4) + "@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + text);
    }

    public void sendTelephone(String inputTelephone) {
        Reporter.log("Enter telephone" + inputTelephone + "to field " + telephone.toString());
        sendTextToElement(telephone, inputTelephone);
        CustomListeners.test.log(Status.PASS, "Enter telephone " + inputTelephone);
    }

    public void sendPassword(String inputPassword) {
        Reporter.log("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);
        CustomListeners.test.log(Status.PASS, "Enter password " + inputPassword);
    }

    public void sendConfirmPassword(String inputConfirmPassword) {
        Reporter.log("Enter email" + inputConfirmPassword + "to email field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, inputConfirmPassword);
        CustomListeners.test.log(Status.PASS, "Enter password " + inputConfirmPassword);
    }

    public void clickOnSubscribeToNewsletter() {
        Reporter.log("Clicking on subscribe " + newsletter.toString());
        clickOnElement(newsletter);
        CustomListeners.test.log(Status.PASS, "Click on subscribe");
    }

    public void clickOnPrivacyPolicy() {
        Reporter.log("Clicking on privacy policy " + privacyPolicy.toString());
        clickOnElement(privacyPolicy);
        CustomListeners.test.log(Status.PASS, "Click on privacy policy");
    }

    public void clickOnContinueAfterPrivacyButton() {
        Reporter.log("Clicking on continue " + continueAfterPrivacyButton.toString());
        clickOnElement(continueAfterPrivacyButton);
        CustomListeners.test.log(Status.PASS, "Click on continue");
    }

}
