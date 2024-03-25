package ru.gb._auto_testing.semi_2.demo.pattern.singleton;

/**
 * Enum
 */
public enum Connection {

    URL("http://"),
    PORT("8080"),
    CONNECT("true");

    private String value;

    Connection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
