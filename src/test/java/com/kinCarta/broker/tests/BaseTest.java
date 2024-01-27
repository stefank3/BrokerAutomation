package com.kinCarta.broker.tests;

import com.kinCarta.broker.common.elements.Elements;

public class BaseTest extends Elements {

    // vm options -Dbrowser=chrome -Denvironment=TEST


    public void set_up() {
        browser.open();
        browser.maximize();
        navigate.toURL($("URL"));
    }


    public void tear_down() {
        browser.close();
    }
}
