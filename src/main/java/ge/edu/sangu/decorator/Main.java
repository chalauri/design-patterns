package ge.edu.sangu.decorator;

import ge.edu.sangu.decorator.beverages.Americano;
import ge.edu.sangu.decorator.beverages.Espresso;
import ge.edu.sangu.decorator.component.Beverage;
import ge.edu.sangu.decorator.condiments.Milk;
import ge.edu.sangu.decorator.condiments.Soya;
import ge.edu.sangu.decorator.condiments.Suggar;

public class Main {

    public static void main(String[] args) {

        // Americano
        Beverage americano = new Americano();
        System.out.println(americano.getDescription() + " - " + americano.getCost());

        // Americano with milk
        Beverage amerocanoWithMilk = new Milk(americano);
        System.out.println(amerocanoWithMilk.getDescription() + " - " + amerocanoWithMilk.getCost());

        // Americano with milk and soya
        Beverage withMilkAndSoya = new Soya(amerocanoWithMilk);
        System.out.println(withMilkAndSoya.getDescription() + " - " + withMilkAndSoya.getCost());

        // Espresso with double sugar and double milk
        Beverage espresso = new Milk(new Milk(new Suggar(new Suggar(new Espresso()))));
        System.out.println(espresso.getDescription() + " - " + espresso.getCost());

    }
}
