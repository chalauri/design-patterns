package ge.edu.sangu.controlwriting.one.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ge.edu.sangu.controlwriting.one.interfaces.PaymentMethod;

public class ShoppingCart {

    private List<Item> items;

    public void addItem(Item item) {
        if(items == null){
            items = new ArrayList<>();
        }

        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public BigDecimal calculateCartPrice() {
        return items.stream().map(Item::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay(PaymentMethod paymentMethod){
        paymentMethod.pay(calculateCartPrice());
    }

}
