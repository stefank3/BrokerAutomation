package com.kinCarta.broker.common.driver;

import com.kinCarta.broker.common.Global;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge extends Global implements Drivers {

    public WebDriver browser() {
        System.setProperty("webdriver.edge.driver", drivers + "MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        return driver;
    }
}
