package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {



    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsPath;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement dropDownPath;
    String sortAToZ = "Name (A - Z)";
    String sortZToA = "Name (Z - A)";
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement productHPLP3065;

    public String getDesktopText() {
        Reporter.log("Getting desktop text " + desktopText.toString());
        CustomListeners.test.log(Status.PASS, "Get desktop text");
        return getTextFromElement(desktopText);
    }

    public void clickOnSortByPosition() {
        Reporter.log("Clicking on sort by button " + dropDownPath.toString());
        clickOnElement(dropDownPath);
        CustomListeners.test.log(Status.PASS, "Click on sort by button");
    }

    public void selectSortByAToZ(String text) {
        Reporter.log("select A to Z" + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);
        CustomListeners.test.log(Status.PASS, "select " + sortAToZ);
    }

    public void selectSortByZToA(String text) {
        Reporter.log("select" + sortZToA + "from" + dropDownPath.toString());
        selectByVisibleTextFromDropDown(dropDownPath, text);
        CustomListeners.test.log(Status.PASS, "select " + sortZToA);
    }

    public void clickOnHPLP3065() {
        Reporter.log("Clicking on product HPLP3065 " + productHPLP3065.toString());
        clickOnElement(productHPLP3065);
        CustomListeners.test.log(Status.PASS, "Click on product HPLP3065");
    }
    public ArrayList<String> expectedList() {
        // Get all the products name and stored into array list
        List<WebElement> products = productsPath;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        return originalProductsName;
    }

    public ArrayList beforeSorting() {
        List<WebElement> product = productsPath;
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement list : product) {
            originalList.add(list.getText());
        }
        return originalList;
    }

    public ArrayList afterSorting() {
        Collections.reverse(beforeSorting());
        System.out.println(beforeSorting());
        List<WebElement> products = productsPath;
        ArrayList<String> afterSortingList = new ArrayList<>();
        for (WebElement newSortList : products) {
            afterSortingList.add(newSortList.getText());
        }
        return afterSortingList;
    }
}