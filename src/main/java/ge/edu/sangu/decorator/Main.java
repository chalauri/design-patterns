package ge.edu.sangu.decorator;

import ge.edu.sangu.decorator.beverages.Americano;
import ge.edu.sangu.decorator.beverages.Espresso;
import ge.edu.sangu.decorator.beverages.Latte;
import ge.edu.sangu.decorator.component.Beverage;
import ge.edu.sangu.decorator.condiments.Milk;
import ge.edu.sangu.decorator.condiments.Soy;
import ge.edu.sangu.decorator.condiments.Sugar;

public class Main {

    public static void main(String[] args) {

        // Americano
        Beverage americano = new Americano();
        System.out.println(americano.getDescription() + " - " + americano.getCost());

        // Americano with milk
        Beverage americanoWithMilk = new Milk(americano);
        System.out.println(americanoWithMilk.getDescription() + " - " + americanoWithMilk.getCost());

        // Americano with milk and soya
        Beverage withMilkAndSoy = new Soy(americanoWithMilk);
        System.out.println(withMilkAndSoy.getDescription() + " - " + withMilkAndSoy.getCost());

        // Espresso with double sugar and double milk
        Beverage espresso = new Milk(new Milk(new Sugar(new Sugar(new Espresso()))));
        System.out.println(espresso.getDescription() + " - " + espresso.getCost());

        // Late with sugar, milk and soy
        Beverage lateWithSugarMilkAndSoy = new Sugar(new Milk(new Soy(new Latte())));
        System.out.println(lateWithSugarMilkAndSoy.getDescription() + " - " + lateWithSugarMilkAndSoy.getCost());
    }
}
