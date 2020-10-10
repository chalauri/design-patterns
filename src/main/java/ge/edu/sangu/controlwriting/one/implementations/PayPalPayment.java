package ge.edu.sangu.controlwriting.one.implementations;

import java.math.BigDecimal;

import ge.edu.sangu.controlwriting.one.interfaces.PaymentMethod;

public class PayPalPayment implements PaymentMethod {

    private String username;
    private String password;

    public PayPalPayment(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public void pay(BigDecimal amount) {
        System.out.println(String.format("%.2f paid by PayPal", amount.doubleValue()));
    }
}
