package com.kinCarta.broker.common.driver;

/**
 * @author gjore.zaharchev
 */
class OSValidator {


    public static boolean isWindows(final String OS) {
        return (OS.contains("win"));
    }

    public static boolean isMac(final String OS) {
        return (OS.contains("mac"));
    }

    public static boolean isUnix(final String OS) {
        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0);
    }

    public static boolean isSolaris(final String OS) {
        return (OS.contains("sunos"));
    }

}