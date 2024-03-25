package ru.gb._auto_testing.semi_2.demo.solid;

/**
 * Интерфейс датчиков
 */
public interface ISensor {

    public void getSignal(int signal);

    default boolean checkAlert (int value, int maxValue) {
        if (value > maxValue) return true;
        return false;
    }

    public void setAlarm (boolean alert, String value);

    public Boolean isAlarm ();
}
