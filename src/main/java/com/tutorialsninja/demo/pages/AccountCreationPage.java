package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountCreationPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement accountCreationText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueAfterAccountCreation;


    public String getAccountCreationMessage() {
        Reporter.log("Getting account creation text " + accountCreationText.toString());
        CustomListeners.test.log(Status.PASS, "Get account creation text");
        return getTextFromElement(accountCreationText);
    }

    public void clickOnContinueAfterAccountCreation() {
        Reporter.log("Clicking on continue after account button " + continueAfterAccountCreation.toString());
        clickOnElement(continueAfterAccountCreation);
        CustomListeners.test.log(Status.PASS, "Click on continue after account button");
    }
}
