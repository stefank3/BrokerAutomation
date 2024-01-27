package com.kinCarta.broker.common.driver;

import com.kinCarta.broker.common.Global;

public class SetUp extends Global {


    public void setBrowser() {
        switch (browser) {
            case CHROME:
                new Chrome().browser();
                break;
                case FIREFOX:
                new Firefox().browser();
                break;
            case EDGE:
                new Edge().browser();
                break;
                default:
                //System.err.println("You are using an unsupported platform/browser!!!");
                break;
        }
    }
}
