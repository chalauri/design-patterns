package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.interfaces.Pizza;

public class ChicagoCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting ChicagoCheesePizza");
    }
}
