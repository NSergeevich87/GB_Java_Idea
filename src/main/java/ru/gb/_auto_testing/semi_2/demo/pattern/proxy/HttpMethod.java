package ru.gb._auto_testing.semi_2.demo.pattern.proxy;

/**
 * Вспомогательный Enum
 */
public enum HttpMethod {

    GET ("get"),
    POST ("post"),
    PUT ("put"),
    DELETE ("delete");

    private String value;

    public String getValue() {
        return value;
    }

    HttpMethod(String value) {
        this.value = value;
    }
}
