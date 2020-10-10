package ge.edu.sangu.controlwriting.one;

import java.math.BigDecimal;

import ge.edu.sangu.controlwriting.one.implementations.CardPayment;
import ge.edu.sangu.controlwriting.one.implementations.PayPalPayment;
import ge.edu.sangu.controlwriting.one.interfaces.PaymentMethod;
import ge.edu.sangu.controlwriting.one.model.Item;
import ge.edu.sangu.controlwriting.one.model.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        PaymentMethod cardPayment = new CardPayment("1234-1234-1234-1234","111");

        PaymentMethod paymentMethod = new PayPalPayment("username","password");

        Item car = new Item("BWM X5", BigDecimal.valueOf(19500));
        Item book = new Item("Effective Java 3rd edition",BigDecimal.valueOf(17.95));
        Item printer = new Item("Cannon", BigDecimal.valueOf(359));

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(car);

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(book);
        cart2.addItem(printer);


        cart1.pay(cardPayment);
        cart2.pay(paymentMethod);
    }
}
