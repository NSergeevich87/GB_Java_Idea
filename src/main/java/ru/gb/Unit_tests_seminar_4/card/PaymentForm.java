package ru.gb.Unit_tests_seminar_4.card;

public class PaymentForm {
    private CreditCard creditCard;

    public PaymentForm(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(double amount) {
        creditCard.charge(amount);
    }
}
