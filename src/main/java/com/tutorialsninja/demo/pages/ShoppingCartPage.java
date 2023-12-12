package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productNameText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDateText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement refreshButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successMessageRefresh;
    @CacheLookup
    @FindBy(css = "a.btn.btn-primary")
    WebElement checkoutButton;

    public Boolean isShoppingCartAppearing() {
        Reporter.log("Verifying if success message contains " + "Shopping Cart");
        CustomListeners.test.log(Status.PASS, "check whether success message appears as expected");
        return getTextFromElement(shoppingCartText).contains("Shopping Cart");
    }

    public String getProductName() {
        return getTextFromElement(productNameText);
    }

    public Boolean isDeliveryDateAppearing(String date) {
        Reporter.log("Verifying if success message contains " + date);
        CustomListeners.test.log(Status.PASS, "check whether success message appears as expected");
        return getTextFromElement(deliveryDateText).contains(date);
    }

    public String getModelText() {
        return getTextFromElement(modelText);
    }

    public String getTotalText() {
        return getTextFromElement(totalText);
    }

    public void clearAndAddQuantity(String quantity) {
        quantityBox.clear();
        sendTextToElement(quantityBox, quantity);
    }

    public void clickOnUpdate() {
        clickOnElement(refreshButton);
    }

    public Boolean isSuccessMessageAppearing(String message) {
        Reporter.log("Verifying if success message contains " + "Success: You have added HP LP3065 to your shopping cart!");
        CustomListeners.test.log(Status.PASS, "check whether success message appears as expected");
        return getTextFromElement(successMessageRefresh).contains("Success: You have modified your shopping cart!");
    }

    public void clickOnCheckout() {
        Reporter.log("Clicking on checkout Button " + checkoutButton.toString());
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS, "Click on checkout button");
    }

}
