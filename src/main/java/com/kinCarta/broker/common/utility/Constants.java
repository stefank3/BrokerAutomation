package com.kinCarta.broker.common.utility;

public class Constants {


    public static final int ELEMENT_LOAD_TIMEOUTS = Integer.parseInt(getGlobalProperty("ELEMENT_LOAD_TIMEOUTS"));

    private static String getGlobalProperty(final String globalPropertyName) {
        return Utils.getValueFromPropertyFile("/GlobalProperties/", "global", globalPropertyName);
    }
}
