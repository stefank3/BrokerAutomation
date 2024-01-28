package com.kinCarta.broker.common.elements;

import com.kinCarta.broker.common.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Wait extends ElementBase {

    /**
     * @param by locator
     * @return element
     */
    public static boolean presenceOfElement(final By by) {
        try {
            Global.waitElement.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by      locator
     * @param timeout timeout
     * @return element
     */
    public static boolean presenceOfElement(final By by, final long timeout) {
        try {
            new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by locator
     * @return element
     */
    public static boolean presenceOfElements(final By by) {
        try {
            Global.waitElement.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by      locator
     * @param timeout timeout
     * @return element
     */
    public static boolean presenceOfElements(final By by, final long timeout) {
        try {
            new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Investigate

    /**
     * @param by locator
     * @return element
     */
    public static boolean visibilityOfElement(final By by) {
        try {
            Global.waitElement.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Investigate

    /**
     * @param by      locator
     * @param timeout timeout
     * @return element
     */
    public static boolean visibilityOfElement(final By by, final long timeout) {
        try {
            new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by locator
     * @return element
     */
    public static boolean visibilityOfElements(final By by) {
        try {
            Global.waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by      locator
     * @param timeout timeout
     * @return element
     */
    public static boolean visibilityOfElements(final By by, final long timeout) {
        try {
            new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by locator
     * @return element
     */
    public static boolean toBecomeInvisible(final By by) {
        try {
            getElement(by);
            Global.waitElement.until(ExpectedConditions.invisibilityOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by      locator
     * @param timeout timeout
     * @return element
     */
    public static boolean toBecomeInvisible(final By by, final long timeout) {
        try {
            getElement(by);
            new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.invisibilityOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @param by    locator
     * @param index element order
     */
    public static boolean toBecomeInvisible(final By by, final int index) {
        getElement(by);
        Global.waitElement.until(ExpectedConditions.invisibilityOfAllElements(getAllElements(by)));
        return true;
    }

    public static boolean toBeClicable(final By by) {
        Global.waitElement.until(ExpectedConditions.elementToBeClickable(by));
        return true;
    }

    public static boolean toBeClicable(final By by, final int timeout) {
        new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.elementToBeClickable(by));
        return true;
    }

    public static boolean toBeSelectable(final By by) {
        Global.waitElement.until(ExpectedConditions.elementToBeSelected(by));
        return true;
    }

    public static boolean toBeSelectable(final By by, final int timeout) {
        new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.elementToBeSelected(by));
        return true;
    }
    /**
     * @param by   locator
     * @param text text to be
     */
    public static boolean textToBe(final By by, final String text) {
        return Global.waitElement.until(ExpectedConditions.textToBe(by, text));
    }

    /**
     * @param by   locator
     * @param text text
     */
    public static boolean textToBe(final By by, final long timeout, final String text) {
        return new WebDriverWait(Global.driver, timeout).until(ExpectedConditions.textToBe(by, text));
    }

    /**
     * @param timeout timeout
     */
    public static void forAsynchronousRequest(int timeout) {
        Global.driver.manage().timeouts().setScriptTimeout(timeout, TimeUnit.MILLISECONDS);
    }

    /**
     * @param timeout timeout
     */
    public static void sleep(final long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
