package de.auinger.training.java_basics.scratch;

import java.time.LocalDate;

public class VersionInfo {

    public static final String APP_VERSION = "1.0.13";
    public static final String BUILD_DATE;

    static {
        String tmpBuildDate = LocalDate.now().toString();
        tmpBuildDate = tmpBuildDate.replace('-', '.');
        BUILD_DATE = tmpBuildDate;
    }

    public static String getVersionWithBuildDate() {
        foo();
        return APP_VERSION + "-b" + BUILD_DATE;
    }

    private static void foo() {
    }
}
