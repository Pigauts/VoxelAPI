package com.fulvio.placeholder;

public class Placeholder {

    private final String placeholder;

    private final String value;

    public Placeholder(String placeholder, String value) {
        this.placeholder = placeholder;
        this.value = value;
    }

    public String set(String s) {
        return s.replaceAll(placeholder, value);
    }

}
