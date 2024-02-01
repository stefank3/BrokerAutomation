package com.kinCarta.broker.common.elements;

import com.kinCarta.broker.common.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class Button extends ElementBase {

    /**
     * Submits the form by any form element.
     *
     * @param by provide locator
     */
    public void submit(final By by) {
        getElement(by).submit();
    }

    /**
     * Submits the form by any form element using index.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public static void submit(final By by, final int index) {
        getAllElements(by).get(index).submit();
    }

    /**
     * Click on particular button or link.
     *
     * @param by provide locator
     */
    public static void click(final By by) {
        getElement(by).click();
    }

    /**
     * Click on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public static void click(final By by, final int index) {
        getAllElements(by).get(index).click();
    }

    /**
     * Double Click on particular button or link.
     *
     * @param by provide locator
     */
    public static void doubleClick(final By by) {
        (new Actions(Global.driver)).doubleClick(getElement(by)).perform();
    }

    /**
     * Double Click on particular button or link.
     *
     * @param by    provide locator
     * @param index provide order number
     */
    public static void doubleClick(final By by, final int index) {
        (new Actions(Global.driver)).doubleClick(getAllElements(by).get(index)).perform();
    }

    /**
     * Right click on particular button or link.
     *
     * @param by provide locator
     */
}