package ge.edu.sangu.factory;

import ge.edu.sangu.factory.implementations.*;
import ge.edu.sangu.factory.interfaces.Pizza;

public class PizzaFactory {

    public static Pizza createNewYorkPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new NewYorkCheesePizza();
        }

        if ("chilli".equalsIgnoreCase(type)) {
            return new NewYorkChilliPizza();
        }

        throw new IllegalArgumentException(String.format("Pizza type %s Not supported", type));
    }

    public static Pizza createChicagoPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new ChicagoCheesePizza();
        }

        if ("vegge".equalsIgnoreCase(type)) {
            return new ChicagoVeggePizza();
        }

        if ("mushroom".equalsIgnoreCase(type)) {
            return new ChicagoMushroomPizza();
        }

        throw new IllegalArgumentException(String.format("Pizza type %s Not supported", type));
    }
}
