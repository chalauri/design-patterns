package ge.edu.sangu.flyweight.implementations;

import ge.edu.sangu.flyweight.enums.Color;
import ge.edu.sangu.flyweight.interfaces.Tree;

public class AppleTree implements Tree {

    @Override
    public void fill(Color color) {
        System.out.println(String.format("Filling AppleTree with %s", color));
    }
}
