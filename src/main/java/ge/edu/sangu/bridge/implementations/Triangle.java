package ge.edu.sangu.bridge.implementations;

import ge.edu.sangu.bridge.interfaces.Color;
import ge.edu.sangu.bridge.interfaces.Shape;

public class Triangle implements Shape {

    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("This triangle " + color.fill());
    }
}
