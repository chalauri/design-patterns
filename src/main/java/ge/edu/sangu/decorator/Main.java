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
        Americano americano = new Americano();
        System.out.println(americano.getDescription() + " - " + americano.getCost());

        // Americano with milk 1.69 + 0.35 = 2.04
        Beverage americanoWithMilk = new Milk(americano);
        System.out.println(americanoWithMilk.getDescription() + " - " + americanoWithMilk.getCost());

        // Americano with milk and soya   2.04 + .15 = 2.19
        Beverage withMilkAndSoy = new Soy(americanoWithMilk);
        System.out.println(withMilkAndSoy.getDescription() + " - " + withMilkAndSoy.getCost());

        // Espresso with double sugar and double milk   1.5 + 2* 0.25 + 2*0.35 = 2.7
        Beverage espresso = new Milk(new Milk(new Sugar(new Sugar(new Espresso()))));
        System.out.println(espresso.getDescription() + " - " + espresso.getCost());

        // Late with sugar, milk and soy   1.35 + 0.15 + 0.35 + 0.25 = 2.1
        Beverage lateWithSugarMilkAndSoy = new Sugar(new Milk(new Soy(new Latte())));
        System.out.println(lateWithSugarMilkAndSoy.getDescription() + " - " + lateWithSugarMilkAndSoy.getCost());
    }
}
