package ru.gb.Unit_tests_seminar_4.card;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;


class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    public void testPaymentFrom() {
        CreditCard mainCard = mock(CreditCard.class);

        when(mainCard.getCardNumber()).thenReturn("4455");
        when(mainCard.getCardHolder()).thenReturn("nick");
        when(mainCard.getExpiryDate()).thenReturn("2029");
        when(mainCard.getCvv()).thenReturn("229");

        PaymentForm mockPaymentForm = new PaymentForm(mainCard);

        mockPaymentForm.pay(100);

        verify(mainCard, times(1)).charge(100);
    }
}