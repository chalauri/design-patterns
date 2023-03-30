package ge.edu.sangu.flyweight;

import ge.edu.sangu.flyweight.enums.Color;
import ge.edu.sangu.flyweight.enums.TreeType;
import ge.edu.sangu.flyweight.factory.TreeFactory;
import ge.edu.sangu.flyweight.interfaces.Tree;

import java.util.stream.IntStream;

public class Main {

    private static final Color[] COLORS = Color.values();
    private static final TreeType[] TREE_TYPES = TreeType.values();

    public static void main(String[] args) {

        IntStream.
            range(0, 20)
            .forEach(index -> {
                Tree tree = TreeFactory.getTree(getRandomTreeType());
                tree.fill(getRandomColor());
            });
    }

    private static Color getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static TreeType getRandomTreeType() {
        return TREE_TYPES[(int) (Math.random() * TREE_TYPES.length)];
    }
}
