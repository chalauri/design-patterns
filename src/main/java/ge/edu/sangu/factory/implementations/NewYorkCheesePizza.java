package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.interfaces.Pizza;

public class NewYorkCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing NewYorkCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NewYorkCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NewYorkCheesePizza");
    }
}
