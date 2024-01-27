package com.kinCarta.broker.pageObjects;

import com.kinCarta.broker.common.elements.Button;
import com.kinCarta.broker.common.elements.Input;
import com.kinCarta.broker.common.elements.Validate;
import com.kinCarta.broker.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokerLandingPage {


    private List<WebElement> brokers;

    public static By searchBroker = By.xpath("//*[@class=\"input-search\"]");
     public By searchBrokerButton = By.xpath("//*[@class=\"icon-search____ICON\"]");
     public By clearSearchButton = By.xpath("//*[contains(@class,\"clear-btn\") or contains(@class,\"clear-all-dropdowns\")]");
     public static By loadMoreBrokersButton = By.xpath("//*[contains(@class,\"load-more-results-list\") or contains(@data-container,\"load-more-brokers\")]");
     public By brokerName = By.xpath("//*[contains(@class,\"header-group\")]/h3/a");
     public By brokerCard = By.xpath("//*[@class=\"broker-card\"]");
     public By address = By.xpath("//*[@class=\"office\"]");
     public By properties = By.xpath("//*[@class=\"position\"]/a");
     public By landlinePhoneNumber = By.xpath("//*[@class=\"tel\"][1]/a");
     public By mobilePhoneNumber = By.xpath("//*[@class=\"tel\"][2]/a");


    public List<WebElement> getAllBrokers() {
        return brokers;
    }

  public void searchBrokers(String brokerName){
        Button.click(loadMoreBrokersButton);
        Input.clear(searchBroker);
        Input.type(searchBroker, brokerName);
        Button.click(searchBrokerButton);
  }

  public void clearSearch(){
        Button.click(clearSearchButton);
  }

  public void assertBroker(){

      Validate.isSingleElementPresent(brokerCard);
      Validate.isElementPresent(brokerName);
      Validate.isElementPresent(address);
      Validate.isElementPresent(properties);
      Validate.isElementPresent(landlinePhoneNumber);
      Validate.isElementPresent(mobilePhoneNumber);

  }


}
