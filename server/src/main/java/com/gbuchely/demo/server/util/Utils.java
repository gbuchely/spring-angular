package com.gbuchely.demo.server.util;

public class Utils {

    private final String HELLO = "Hello, ";

    public String getComposedString(String firstName, String lastName) {
        return HELLO + firstName + " " + lastName;
    }
}