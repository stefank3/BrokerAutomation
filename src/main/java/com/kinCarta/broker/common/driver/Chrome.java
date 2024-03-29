package com.kinCarta.broker.common.driver;

import com.kinCarta.broker.common.Global;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Chrome extends Global implements Drivers {

    public WebDriver browser() {
        if (OSValidator.isWindows(OS)) {
            System.setProperty("webdriver.chrome.driver", drivers + "chromedriver.exe");
        } else if (OSValidator.isMac(OS)) {
            System.setProperty("webdriver.chrome.driver", drivers + "chromedriverMac");
        } else if (OSValidator.isUnix(OS)) {
            System.setProperty("webdriver.chrome.driver", drivers + "chromedriver64");
        } else {
            System.out.println("Your OS is not supported!!");
        }
        driver = new ChromeDriver(options());

        return driver;
    }

    private ChromeOptions options() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--enable-application-cache");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--enable-automation");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        return chromeOptions;
    }


}
