package ge.edu.sangu.factory;

import ge.edu.sangu.factory.implementations.ChicagoCheesePizza;
import ge.edu.sangu.factory.implementations.ChicagoMushroomPizza;
import ge.edu.sangu.factory.implementations.ChicagoVeggePizza;
import ge.edu.sangu.factory.implementations.NewYorkCheesePizza;
import ge.edu.sangu.factory.interfaces.Pizza;

public class PizzaFactory {

    public static Pizza createNewYorkPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new NewYorkCheesePizza();
        }

        if ("chilli".equalsIgnoreCase(type)) {
            return new NewYorkCheesePizza();
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
