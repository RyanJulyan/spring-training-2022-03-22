package com.example.myticket.core.shared.util;

public class GreetingUtil {

    private static final String NAME_GREETING_FORMAT = "Hello %s!";

    public static String formatNameAsGreeting(final String name) {
        return String.format(NAME_GREETING_FORMAT, name);
    }
}
