package com.kinCarta.broker.common.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;


public class Validate extends ElementBase {
    /**
     * Wrapper used for validation if web element is present
     * @param by
     */
    public static boolean isElementPresent(By by) {
        try {
            getElement(by).getText();
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }


    public static boolean isSingleElementPresent(By by){
        try {
            Assert.assertEquals(getAllElements(by).size(),1, "More than one element is present");
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isCssAtributePresent(By by, String expectedValue, String cssAttribute){
        try
        {
            String actualValue = getElement(by).getCssValue(cssAttribute).toString();

            Assert.assertEquals(expectedValue, actualValue);
            return true;
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return false;
    }

    /*
            Verifies if title of the page is correct
     */
    public static boolean isTitleValid(String expectedValue){
        try
        {
            String actualValue = driver.getTitle();
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return false;
    }
    /**
     * Wrapper used for validation if text of web element equals test data
     * @param by
     */
    public static boolean textEquals(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();

            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Wrapper used for validation if text of web element is contained in test data
     * @param by
     */
    public static boolean textContains(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertTrue(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
