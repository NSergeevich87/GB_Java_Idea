package ru.gb._auto_testing.semi_2.seminar;

/**
 * Интерфейс поставщика
 */
public interface IProducer {

    public boolean subscription(IConsumer consumer);

    public boolean cancel(IConsumer consumer);
}
