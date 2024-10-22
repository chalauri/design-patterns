package ge.edu.sangu.factory;

import ge.edu.sangu.factory.implementations.ChicagoPizzaStore;
import ge.edu.sangu.factory.implementations.NewYorkPizzaStore;
import ge.edu.sangu.factory.interfaces.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        newYorkPizzaStore.order("cheese");

        System.out.println();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.order("vegge");

        System.out.println();

        chicagoPizzaStore.order("mushroom");
    }
}
