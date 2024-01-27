package com.kinCarta.broker.common.elements;

import com.kinCarta.broker.common.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

class ElementBase extends Global {

    /**
     * @param by provide locator
     * @return single WebElement
     */
    static WebElement getElement(final By by) {
        return waitElement.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * @param by provide locator
     * @return list of WebElement
     */
    static List<WebElement> getAllElements(final By by) {
        return waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((by)));
    }
}
