package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.*;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


    @Listeners(CustomListeners.class)
    public class MyAccountsTest extends BaseTest {

        HomePage homePage;
        RegisterPage registerPage;
        AccountCreationPage accountCreationPage;
        MyAccountPage accountPage;
        LoginPage loginPage;
        LogoutPage logoutPage;

        @BeforeMethod(alwaysRun = true)
        public void inIt() {
            homePage = new HomePage();
            registerPage = new RegisterPage();
            accountCreationPage = new AccountCreationPage();
            accountPage = new MyAccountPage();
            loginPage = new LoginPage();
            logoutPage = new LogoutPage();
        }

        @Test(groups = {"sanity", "regression"})
        public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
            homePage.clickOnMyAccount();
            homePage.selectMyAccountOptions("Register");
            Assert.assertEquals(homePage.getRegisterAccountText(), "Register Account", "Register page not displayed");
        }

        @Test(groups = {"smoke", "regression"})
        public void verifyUserShouldNavigateToLoginPageSuccessfully() {
            homePage.clickOnMyAccount();
            homePage.selectMyAccountOptions("Login");
            Assert.assertEquals(homePage.getLoginAccountText(), "Returning Customer", "Login page not displayed");
        }

        @Test(groups = {"regression"})
        public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
            homePage.clickOnMyAccount();
            homePage.selectMyAccountOptions("Register");

            registerPage.sendFirstName("Sneha");
            registerPage.sendLastName("Shah");
            registerPage.sendEmail("sneha123@gmail.com");
            registerPage.sendTelephone("07564123785");
            registerPage.sendPassword("shah123");
            registerPage.sendConfirmPassword("shah123");
            registerPage.clickOnSubscribeToNewsletter();
            registerPage.clickOnPrivacyPolicy();
            registerPage.clickOnContinueAfterPrivacyButton();
            Assert.assertEquals(accountCreationPage.getAccountCreationMessage(), "Your Account Has Been Created!", "account not created");
            accountCreationPage.clickOnContinueAfterAccountCreation();
            accountPage.clickOnMyAccountLink();
            accountPage.selectMyAccountOption("Logout");
            Assert.assertEquals(logoutPage.getTextFromLogout(), "Account Logout", "not logged out");
            accountPage.clickOnContinueAfterLogout();
        }

        @Test(groups = {"regression"})
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
            homePage.clickOnMyAccount();
            homePage.selectMyAccountOptions("Login");
            loginPage.sendEmail("sneha123@gmail.com");
            loginPage.sendPassword("shah123");
            loginPage.clickOnLogin();
            Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "Not on my account");
            accountPage.clickOnMyAccountLink();
            homePage.selectMyAccountOptions("Logout");
            Assert.assertEquals(logoutPage.getTextFromLogout(), "Account Logout", "Not logged out");
        }
    }

