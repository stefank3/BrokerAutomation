package com.kinCarta.broker.common.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Input extends ElementBase {



    /**
     * @param by    locator
     * @param value to be used
     */
    public static void type(final By by, final String value) {
        if (value != null) {
            getElement(by).sendKeys(value);
        }
    }


    /**
     * @param by    locator
     * @param index element order
     * @param value to be used
     */
    public static void type(final By by, final int index, final String value) {
        if (value != null) {
            getAllElements(by).get(index).sendKeys(value);
        }
    }

    /**
     * @param by    locator
     * @param value to be used
     */
    public static void type(final By by, final Keys value) {
        getElement(by).sendKeys(value);
    }

    /**
     * @param by    locator
     * @param index element order
     * @param value to be used
     */
    public static void type(final By by, final int index, final Keys value) {
        if (value != null) {
            getAllElements(by).get(index).sendKeys(value);
        }
    }

    /**
     * @param by    locator
     * @param index element order
     * @param value to be used
     */
    public static void type(final By by, int index, final int value) {
        getAllElements(by).get(index).sendKeys(Integer.toString(value));
    }

    /**
     * @param by locator
     */
    public static void clear(final By by) {
        getElement(by).clear();
    }

    /**
     * @param by    locator
     * @param index element order
     */
    public static void clear(final By by, final int index) {
        getAllElements(by).get(index).clear();
    }

    public static void enter(final By by){
        getElement(by).sendKeys(Keys.ENTER);
    }
}
