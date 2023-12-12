package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-checkout']//input[@value='guest']")
    WebElement guestCheckoutRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonBillingDetails;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement country;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement regionOrState;
    @CacheLookup
    @FindBy(name = "comment")
    WebElement commentBox;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsAndConditionsRadioBox;
    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement continueButtonCommentDetails;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement paymentMethodWarning;

    public String getCheckoutText() {
        Reporter.log("Getting checkout text " + checkoutText.toString());
        CustomListeners.test.log(Status.PASS, "Get checkout text");
        return getTextFromElement(checkoutText);
    }

    public String getNewCustomerText() {
        Reporter.log("Getting new customer text " + newCustomerText.toString());
        CustomListeners.test.log(Status.PASS, "Get new customer text");
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton() {
        Reporter.log("Clicking on radio button " + guestCheckoutRadioButton.toString());
        clickOnElement(guestCheckoutRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on radio button");
    }

    public void clickOnContinueButton() {
        Reporter.log("Clicking on continue button " + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button");
    }

    public void clickOnContinueBillingButton() {
        Reporter.log("Clicking on radio button " + guestCheckoutRadioButton.toString());
        clickOnElement(continueButtonBillingDetails);
        CustomListeners.test.log(Status.PASS, "Click on radio button");
    }

    public void clickOnContinueCommentButton() {
        Reporter.log("Clicking on radio button " + guestCheckoutRadioButton.toString());
        clickOnElement(continueButtonCommentDetails);
        CustomListeners.test.log(Status.PASS, "Click on radio button");
    }
    public void enterBillingDetailsFirstName(String inputFirstName) {
        Reporter.log("Enter name" + inputFirstName + "to first name field " + firstName.toString());
        sendTextToElement(firstName, inputFirstName);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + inputFirstName);
    }

    public void enterBillingDetailsLastName(String inputLastName) {
        Reporter.log("Enter name" + inputLastName + "to last name field " + lastName.toString());
        sendTextToElement(lastName, inputLastName);
        CustomListeners.test.log(Status.PASS, "Enter last name " + inputLastName);
    }

    public void enterBillingDetailsEmail(String inputEmail) {
        Reporter.log("Enter email" + inputEmail + "to email field " + email.toString());
        sendTextToElement(email, inputEmail);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + inputEmail);
    }

    public void enterBillingDetailsTelephone(String inputTelephone) {
        Reporter.log("Enter telephone" + inputTelephone + "to field " + telephone.toString());
        sendTextToElement(telephone, inputTelephone);
        CustomListeners.test.log(Status.PASS, "Enter telephone " + inputTelephone);
    }

    public void enterBillingDetailsAddress(String inputAddress) {
        Reporter.log("Enter address" + inputAddress + "to field " + address.toString());
        sendTextToElement(address, inputAddress);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + inputAddress);
    }

    public void enterBillingDetailsCity(String inputCity) {
        Reporter.log("Enter city" + inputCity + "to field " + city.toString());
        sendTextToElement(city, inputCity);
        CustomListeners.test.log(Status.PASS, "Enter city " + inputCity);
    }

    public void enterBillingDetailsPostcode(String inputPostcode) {
        Reporter.log("Enter psotcode" + inputPostcode + "to field " + postCode.toString());
        sendTextToElement(postCode, inputPostcode);
        CustomListeners.test.log(Status.PASS, "Enter postcode " + inputPostcode);
    }

    public void enterBillingDetailsCountry(String inputCountry) {
        Reporter.log("Enter country" + inputCountry + "to field " + country.toString());
        selectByVisibleTextFromDropDown(country, inputCountry);
        CustomListeners.test.log(Status.PASS, "Enter country " + inputCountry);
    }

    public void enterBillingDetailsRegionOrState(String inputRegion) {
        Reporter.log("Enter region" + inputRegion + "to field " + regionOrState.toString());
        selectByVisibleTextFromDropDown(regionOrState, inputRegion);
        CustomListeners.test.log(Status.PASS, "Enter region " + inputRegion);
    }

    public void enterComment(String comment) {
        Reporter.log("Enter comment" + comment + "to field " + commentBox.toString());
        sendTextToElement(commentBox, comment);
        CustomListeners.test.log(Status.PASS, "Enter comment " + comment);
    }

    public void clickOnAgreeToTermsAndConditions() {
        Reporter.log("Clicking on terms and conditions box " + termsAndConditionsRadioBox.toString());
        clickOnElement(termsAndConditionsRadioBox);
        CustomListeners.test.log(Status.PASS, "Click on terms and condtions box");
    }

    public Boolean isPaymentWarningAppearing() {
        Reporter.log("Getting status of payment warning " + paymentMethodWarning.toString());
        CustomListeners.test.log(Status.PASS, "check payment warning");
        return getTextFromElement(paymentMethodWarning).contains("Warning: Payment method required!");
    }
}

