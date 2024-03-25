package ru.gb._auto_testing.semi_2.demo.pattern.singleton;

/**
 * Потокобезопасный метод
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private String url;
    private Integer port;
    private Boolean connect;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private ThreadSafeSingleton() {
    }
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

}
