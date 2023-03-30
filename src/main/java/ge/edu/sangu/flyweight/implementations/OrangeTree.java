package ge.edu.sangu.flyweight.implementations;

import ge.edu.sangu.flyweight.enums.Color;
import ge.edu.sangu.flyweight.interfaces.Tree;

public class OrangeTree implements Tree {

    @Override
    public void fill(Color color) {
        System.out.println(String.format("Filling OrangeTree with %s", color));
    }
}
