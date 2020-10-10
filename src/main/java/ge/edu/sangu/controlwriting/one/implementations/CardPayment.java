package ge.edu.sangu.controlwriting.one.implementations;

import java.math.BigDecimal;

import ge.edu.sangu.controlwriting.one.interfaces.PaymentMethod;

public class CardPayment implements PaymentMethod {

    private String cardNumber;
    private String cvc;

    public CardPayment(String cardNumber, String cvc) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(String.format("%.2f paid by Card", amount.doubleValue()));
    }
}
