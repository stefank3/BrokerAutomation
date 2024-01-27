package com.kinCarta.broker.common;

import com.kinCarta.broker.common.driver.enums.Drivers;
import com.kinCarta.broker.common.utility.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Global {

    protected static WebDriver driver = null;
    protected static WebDriverWait waitElement = null;
    protected final String environment = $$("environment");
    protected final String OS = $$("os.name").toLowerCase();
    protected final String drivers = "src/test/resources/Drivers/";
    protected final String device = $$("device");
    protected Drivers browser = Drivers.valueOf($$("browser").toUpperCase());

    /**
     * Used for reading environment variable value by specifying environment
     * variable name
     *
     * @param environmentVariableName specify which key from the properties file to be read
     * @return environment variable value
     */
    protected String $(final String environmentVariableName) {
        if (environment != null) {
            return Utils.getValueFromPropertyFile("/Environments/", environment, environmentVariableName);
        }
        return null;
    }

    /**
     * @param systemProperty
     * @return System property value
     */
    protected String $$(final String systemProperty) {
        if (System.getProperty(systemProperty) != null) {
            return System.getProperty(systemProperty);
        }
        return null;
    }
}