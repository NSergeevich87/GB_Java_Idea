package ru.gb._auto_testing.semi_2.seminar;

/**
 * Интерфейс потребителя
 */
public interface IConsumer {

    //Передача сообщения
    public Status sendMessage(String str);

    //Проверка доступности линии
    public boolean isLineFree();
}
