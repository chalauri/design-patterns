package ge.edu.sangu.factory.implementations;

import ge.edu.sangu.factory.interfaces.Pizza;

public class NewYorkChilliPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NewYorkChilliPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NewYorkChilliPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NewYorkChilliPizza");
    }
}
