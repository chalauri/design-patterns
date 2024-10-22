package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.interfaces.Pizza;

public class ChicagoMushroomPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoMushroomPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoMushroomPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting ChicagoMushroomPizza");
    }
}
