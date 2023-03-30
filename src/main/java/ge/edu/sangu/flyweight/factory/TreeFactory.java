package ge.edu.sangu.flyweight.factory;

import ge.edu.sangu.flyweight.enums.Color;
import ge.edu.sangu.flyweight.enums.TreeType;
import ge.edu.sangu.flyweight.implementations.AppleTree;
import ge.edu.sangu.flyweight.implementations.LemonTree;
import ge.edu.sangu.flyweight.implementations.MangoTree;
import ge.edu.sangu.flyweight.implementations.OrangeTree;
import ge.edu.sangu.flyweight.interfaces.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    // This is flyweight pool
    private static final Map<TreeType, Tree> TREES_BY_TYPE = new HashMap<>();

    public static Tree getTree(TreeType treeType) {
        Tree tree = TREES_BY_TYPE.get(treeType);

        if (tree == null) {
            tree = createTree(treeType);
            TREES_BY_TYPE.put(treeType, tree);
        }

        return tree;
    }

    private static Tree createTree(TreeType treeType) {
        switch (treeType) {
            case APPLE -> {
                System.out.println("Creating new object of AppleTree");
                return new AppleTree();
            }
            case LEMON -> {
                System.out.println("Creating new object of LemonTree");
                return new LemonTree();
            }
            case ORANGE -> {
                System.out.println("Creating new object of OrangeTree");
                return new OrangeTree();
            }
            case MANGO -> {
                System.out.println("Creating new object of MangoTree");
                return new MangoTree();
            }
            default -> throw new IllegalArgumentException("Illegal Tree Type");
        }
    }
}
