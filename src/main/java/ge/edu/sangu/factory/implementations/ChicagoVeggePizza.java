package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.interfaces.Pizza;

public class ChicagoVeggePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoVeggePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoVeggePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting ChicagoVeggePizza");
    }
}
