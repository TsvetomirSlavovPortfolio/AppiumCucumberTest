package com.test.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import org.junit.Assert;

import java.net.MalformedURLException;

public class SecureDialogNavigationStepDefs extends CommonStepDefs {

    @When("^I click on \"([^\"]*)\" on \"([^\"]*)\"$")
    public void i_click_on_on(String clickOn, String screenName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (clickOn) {
            case "App":
                homeScreen.getAppScreen();
                break;
            case "Activity":
                appScreen.getActivityScreen();
                break;
            case "Secure Surfaces":
                activityScreen.getSecureSurfaceScreen();
                break;
            case "Secure Dialog":
                secureSurfaceScreen.getSecureDialogScreen();
                break;
            case "Notification":
                appScreen.getNotificationScreen();
                break;
            case "IncomingMessage":
                notificationScreen.getIncomingMessageNotificationScreen();
                break;
        }
    }

    @Then("^\"([^\"]*)\" text should display$")
    public void text_should_display(String textToCheck) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (textToCheck) {
            case "Activity":
                Assert.assertTrue(appScreen.isElementPresent(MobileBy.AccessibilityId("Activity")));
                break;
            case "Secure Surfaces":
                Assert.assertTrue(activityScreen.isElementPresent(MobileBy.AccessibilityId("Secure Surfaces")));
                break;
            case "Secure Dialog\"":
                Assert.assertTrue(secureSurfaceScreen.isElementPresent(MobileBy.AccessibilityId("Secure Dialog")));
                break;
        }
    }

    @Then("^\"([^\"]*)\" text should visible on button$")
    public void text_should_visible_on_button(String buttonText) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (buttonText) {
            case "Show secure dialog":
                Assert.assertTrue(secureDialogScreen.isElementPresent(MobileBy.AccessibilityId("Show secure dialog")));
                break;
            case "Show App Notification":
                Assert.assertTrue(incomingMessageNotificationScreen.isElementPresent(MobileBy.AccessibilityId("Show App Notification")));
        }

    }

    @When("^I click on \"([^\"]*)\" button on \"([^\"]*)\"$")
    public void i_click_on_button_on(String buttonText, String screenName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (buttonText) {
            case "Show secure dialog":
                secureDialogScreen.getSecureDialog();
                break;
            case "Show App Notification":
                incomingMessageNotificationScreen.openMessageNotification();
                break;
        }

    }

    @Then("^Dialog should be visible$")
    public void dialog_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @After
    public void clearSession(){
        try {
            utils.getDriver().quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}