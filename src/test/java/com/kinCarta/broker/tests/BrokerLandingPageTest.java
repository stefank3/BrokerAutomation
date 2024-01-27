package com.kinCarta.broker.tests;

import com.kinCarta.broker.pageObjects.BrokerLandingPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class BrokerLandingPageTest extends BaseTest {

    BrokerLandingPage brokersPage = new BrokerLandingPage();


    @BeforeMethod
    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.toURL($("InPlayerURL"));


    }


    @Test(description = "This test will verify that all of the brokers are listed one by one and the following paramenters are displayed when filtering:" +
            "address,two phone numbers(landline and mobile) and number of properties that are assigned to the broker")
    public void verifyAllBrokers(){
        List<WebElement> brokers = brokersPage.getAllBrokers();

        for (WebElement broker : brokers) {
            String brokerName = broker.getText();
            System.out.println("Searching for broker: " + brokerName);
            brokersPage.searchBrokers(brokerName);

            // Verify search result

            brokersPage.assertBroker();
        }
    }


    @AfterMethod
    public void tear_down() {

        browser.close();
    }

}
