package com.mrlonis.example.util;

public class StringUtil {
    private StringUtil() {}

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
