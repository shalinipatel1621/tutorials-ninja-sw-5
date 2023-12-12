package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    public void sendEmail(String inputEmail) {
        Reporter.log("Enter email" + inputEmail + "to  field " + email.toString());
        sendTextToElement(email, inputEmail);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + inputEmail);
    }

    public void sendPassword(String inputPassword) {
        Reporter.log("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);
        CustomListeners.test.log(Status.PASS, "Enter password " + inputPassword);
    }

    public void clickOnLogin() {
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }


}
