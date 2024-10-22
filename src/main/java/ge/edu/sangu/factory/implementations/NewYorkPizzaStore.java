package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.PizzaFactory;
import ge.edu.sangu.factory.interfaces.Pizza;
import ge.edu.sangu.factory.interfaces.PizzaStore;

public class NewYorkPizzaStore implements PizzaStore {

    @Override
    public void order(String type) {
        Pizza pizza  = PizzaFactory.createNewYorkPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}
