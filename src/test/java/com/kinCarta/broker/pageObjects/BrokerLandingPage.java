package com.kinCarta.broker.pageObjects;

import com.kinCarta.broker.common.Global;
import com.kinCarta.broker.common.elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokerLandingPage extends Global {




     public static By acceptCookiesButton = By.xpath("//*[@value=\"Разбрах\"]");
     public static By searchBroker = By.xpath("//*[@class=\"input-search\"]");
     public static By searchBrokerButton = By.xpath("//*[@class=\"icon-search____ICON\"]");
     public static By clearSearchButton = By.xpath("//*[contains(@class,\"clear-btn\")]");
     public static By loadMoreBrokersButton = By.xpath("//*[contains(@class,\"load-more-results-list\") or contains(@data-container,\"load-more-brokers\")]");
     public static By brokerName = By.xpath("//*[contains(@class,\"header-group\")]/h3/a");
     public static By brokerCard = By.xpath("//*[@class=\"broker-card\"]");
     public static By address = By.xpath("//*[@class=\"office\"]");
     public static By properties = By.xpath("//*[@class=\"position\"]/a");
     public static By landlinePhoneNumber = By.xpath("//*[@class=\"tel\"][1]/a");
     public static By mobilePhoneNumber = By.xpath("//*[@class=\"tel\"][2]/a");


  public void acceptCookies(){
        Button.click(acceptCookiesButton);
  }
  public void loadMorBrokers(){
        Button.click(loadMoreBrokersButton);
        Wait.sleep(3000);
  }

  public void searchBrokers(String brokerName){
        Input.clear(searchBroker);
        Input.type(searchBroker, brokerName);
        Wait.sleep(5000);
        clearSearch();
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
