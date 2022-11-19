package ge.edu.sangu.bridge.implementations;

import ge.edu.sangu.bridge.interfaces.Color;
import ge.edu.sangu.bridge.interfaces.Shape;

public class Rectangle implements Shape {

    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("This rectangle " + color.fill());
    }
}
